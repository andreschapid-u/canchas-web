/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Carlos Andrés Chapid Inga
 */
public abstract class Cancha implements Cloneable {

    protected String id;
    protected String nombre;
    protected boolean estado;
    protected Localizacion localizacion;
    protected List<Turno> turnos;
    protected double costo;
    protected String tipo;
    protected String medidaMin;
    protected String medidaMax;

    @Override
    public String toString() {
        return "{"
                + "\n\t\"id\" : " + getId()
                + "\n\t\"nombre\" : " + getNombre()
                + "\n\t\"tipo\" : " + getTipo()
                + "\n\t\"estado\" : " + isEstado()
                + "\n\t\"direccion\" : " + getLocalizacion().getDireccion()
                +"\n}";
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
        }
        return clone;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getMedidaMin() {
        return medidaMin;
    }

    public String getMedidaMax() {
        return medidaMax;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

}
