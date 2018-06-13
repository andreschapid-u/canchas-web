/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Carlos Andrés Chapid Inga
 */
public class Campeonato {

    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private double costoPlanilla;
    private int numeroEquipos;
    private String reglas;

    public Campeonato(String nombre, Date fechaInicio, Date fechaFin, double costoPlanilla, int numeroEquipos, String reglas) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPlanilla = costoPlanilla;
        this.numeroEquipos = numeroEquipos;
        this.reglas = reglas;
    }

    public Campeonato() {
        this.nombre = "";
        this.fechaInicio = new Date();
        this.fechaFin = new Date();
        this.costoPlanilla = 0;
        this.numeroEquipos = 0;
        this.reglas = "";
    }

    public String getReglas() {
        return reglas;
    }

    public void setReglas(String reglas) {
        this.reglas = reglas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getCostoPlanilla() {
        return costoPlanilla;
    }

    public void setCostoPlanilla(double costoPlanilla) {
        this.costoPlanilla = costoPlanilla;
    }

    public int getNumeroEquipos() {
        return numeroEquipos;
    }

    public void setNumeroEquipos(int numeroEquipos) {
        this.numeroEquipos = numeroEquipos;
    }

}
