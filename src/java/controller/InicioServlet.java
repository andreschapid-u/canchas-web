/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Campeonato;
import model.Cancha;
import model.Evento;
import model.Paquete;
import model.canchas.CanchaPrototype;
import model.eventos.EventoAdapter;
import model.eventos.EventoFacebook;
import model.eventos.EventoTwitter;
import model.paquetes.PaqueteBasico;
import model.paquetes.PaqueteBebida;
import model.paquetes.PaqueteUniforme;

/**
 *
 * @author Carlos Andrés Chapid Inga
 */
public class InicioServlet extends HttpServlet {

    public static List<Evento> eventos = new ArrayList<>();
    public static List<Paquete> paquetes = new ArrayList<>();
    public static List<Paquete> paquetesVendidos = new ArrayList<>();
    public static List<Cancha> canchas = new ArrayList<>();
    public static List<Campeonato> campeonatos = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        CanchaPrototype.loadCache();
        paquetes.add(new PaqueteBebida());
        paquetes.add(new PaqueteUniforme());

    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
        String accion = request.getParameter("accion");
        System.out.println("Request URI: " + request.getRequestURI());
        System.out.println("Referer: " + request.getHeader("Referer"));

        if (accion == null) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
            if (accion.equals("nueva-cancha")) {
                System.out.println(accion);
                String nombre = request.getParameter("nombre");
                String direccion = request.getParameter("direccion");
                String tipo = request.getParameter("tipo");
                String estado = request.getParameter("estado");
                Double costo = Double.parseDouble(request.getParameter("costo"));

                Cancha cancha = CanchaPrototype.getCancha(tipo);
                cancha.setNombre(nombre);
                cancha.getLocalizacion().setDireccion(direccion);
                cancha.setCosto(costo);
                cancha.setEstado((estado != null));

                canchas.add(cancha);
                request.setAttribute("correcto", "Se creo la cancha correctamente!");
//                response.addHeader("correcto", "Se creo la cancha correctamente!");
//                response.sendRedirect("prototype.jsp");
                request.getRequestDispatcher("prototype.jsp").forward(request, response);
            } else if (accion.equals("registrar-paquete")) {
                int horas = Integer.parseInt(request.getParameter("horas"));
                String bebida = request.getParameter("bebida");
                String uniforme = request.getParameter("uniforme");

                Paquete paquete = new PaqueteBasico(horas);
                if (bebida != null) {
                    paquete = new PaqueteBebida(paquete);
                }
                if (uniforme != null) {
                    paquete = new PaqueteUniforme(paquete);
                }

                paquetesVendidos.add(paquete);
                request.setAttribute("correcto", "Se ha realizado la compra!");
//                response.addHeader("correcto", "Se creo la cancha correctamente!");
//                response.sendRedirect("prototype.jsp");
                request.getRequestDispatcher("decorator.jsp").forward(request, response);
            } else if (accion.equals("registrar-evento")) {
                try {
                    DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
//                    System.out.println(date.toLocaleString());

                    String nombre = request.getParameter("nombre");
                    String fecha_inicio = request.getParameter("fecha-inicio");
                    String fecha_fin = request.getParameter("fecha-fin");
                    String tipo = request.getParameter("tipo");
                    String descripcion = request.getParameter("descripcion");
                    Evento evento;
                    Date fechaInicio = format.parse(fecha_inicio);
                    Date fechaFin = format.parse(fecha_fin);
                    if (tipo.equals("twitter")) {
                        evento = new EventoTwitter(nombre, fechaInicio, fechaFin, descripcion);
                        eventos.add(evento);
                    } else {
                        evento = new EventoFacebook(nombre, fechaInicio, fechaFin, descripcion);
                        eventos.add(evento);
                    }

                    request.setAttribute("correcto", "Se ha registrado el evento!");
                } catch (ParseException ex) {
                     request.setAttribute("error", ex);
                    Logger.getLogger(InicioServlet.class.getName()).log(Level.SEVERE, null, ex);
                }finally{
                    
                    request.getRequestDispatcher("adapter.jsp").forward(request, response);
                }
            }else if (accion.equals("registrar-campeonato")) {
                try {
                    DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
//                    System.out.println(date.toLocaleString());

                    String nombre = request.getParameter("nombrec");
                    String fecha_inicio = request.getParameter("fecha-inicio");
                    String fecha_fin = request.getParameter("fecha-fin");
                    int numEquipos = Integer.parseInt(request.getParameter("num-equipos"));
                    double costo = Double.parseDouble(request.getParameter("costo"));
                    String reglas = request.getParameter("reglas");
                    String publicar = request.getParameter("publicar");
                    Evento evento;
                    Date fechaInicio = format.parse(fecha_inicio);
                    Date fechaFin = format.parse(fecha_fin);
                    Campeonato campeonato = new Campeonato(nombre, fechaInicio, fechaFin, costo, numEquipos, reglas);
                    
                    campeonatos.add(campeonato);
                    String msg = "El campeonato se ha creado";
                    
                    if(publicar != null){
                        evento = new EventoAdapter(campeonato);
                        eventos.add(evento);
                        msg+= " y se ha publicado";
                    }

                    request.setAttribute("correcto",msg);
                } catch (ParseException ex) {
                     request.setAttribute("error", ex);
                    Logger.getLogger(InicioServlet.class.getName()).log(Level.SEVERE, null, ex);
                }finally{
                    
                    request.getRequestDispatcher("adapter.jsp").forward(request, response);
                }
            }

        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
