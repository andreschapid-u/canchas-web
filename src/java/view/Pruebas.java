/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            String string = "20/06/2018";
            DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date date = format.parse(string);

            System.out.println(date.toLocaleString());
            
            Paquete p = new PaqueteBebida();
            System.out.println(p.getDescripcion());
            CanchaPrototype.loadCache();
            Cancha c1 = CanchaPrototype.getCancha("1");
            Cancha c2 = CanchaPrototype.getCancha("2");
            Cancha c3 = CanchaPrototype.getCancha("3");
            Cancha c4 = CanchaPrototype.getCancha("4");
            
            System.out.println(c1.toString());
            System.out.println(c2.toString());
            System.out.println(c3.toString());
            System.out.println(c4.toString());
            
            Scanner scanner = new Scanner(System.in);
            int op = 0;
            Paquete paquete = new PaqueteBasico();
            System.out.println(paquete.getDescripcion());
            do {
                System.out.println("1 - Paquete bebida");
                System.out.println("2 - Paquete Uniforme");
                op = scanner.nextInt();
                switch (op) {
                    case 0:
                        break;
                    case 1:
                        paquete = new PaqueteBebida(paquete);
                        System.out.println(paquete.getDescripcion());
                        break;
                    case 2:
                        paquete = new PaqueteUniforme(paquete);
                        System.out.println(paquete.getDescripcion());
                        break;
                    default:
                        System.out.println("Error en opcion.");
                }
            } while (op != 0);
        } catch (ParseException ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
