/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.eventos;

import java.util.Date;
import model.Campeonato;
import model.Evento;

/**
 *
 * @author Carlos Andrés Chapid Inga
 */
public class EventoAdapter implements Evento {

    private Campeonato campeonato;

    public EventoAdapter(Date fechaInicio, Date fechaFin, String nombre, String descripcion, int numJugadores, double costo) {
        this.campeonato = new Campeonato(nombre, fechaInicio, fechaFin, costo, numJugadores, descripcion);
    }

    public EventoAdapter() {
        this.campeonato = new Campeonato();
    }

    public EventoAdapter(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    @Override
    public String publicar() {
        return "Publicación para un campeonato";
    }

    @Override
    public Date getFechaInicio() {
        return this.campeonato.getFechaInicio();
    }

    @Override
    public void setFechaInicio(Date fechaInicio) {
        this.campeonato.setFechaInicio(fechaInicio);
    }

    @Override
    public Date getFechaFin() {
        return this.campeonato.getFechaFin();
    }

    @Override
    public void setFechaFin(Date fechaFin) {
        this.campeonato.setFechaFin(fechaFin);
    }

    @Override
    public String getNombre() {
        return this.campeonato.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        this.campeonato.setNombre(nombre);
    }

    @Override
    public String getDescripcion() {
        return this.campeonato.getReglas();
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.campeonato.setReglas(descripcion);
    }
}
