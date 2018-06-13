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
public interface Evento {
    public abstract String publicar();

    public abstract Date getFechaInicio();
    public abstract void setFechaInicio(Date fechaInicio);

    public abstract Date getFechaFin();
    public abstract void setFechaFin(Date fechaFin);

    public abstract String getNombre();
    public abstract void setNombre(String nombre);

    public abstract String getDescripcion();
    public abstract void setDescripcion(String descripcion);

}
