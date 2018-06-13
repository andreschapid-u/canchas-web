/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.paquetes;

import model.Paquete;

/**
 *
 * @author Carlos Andrés Chapid Inga
 */
public class PaqueteBebida extends PaqueteDecorator{
    
    private Paquete paquete;

    public PaqueteBebida(Paquete paquete) {
        this.paquete = paquete;
    }

    public PaqueteBebida() {
        this.paquete = null; 
    }

    
    @Override
    public String getDescripcion() {
        return (paquete != null ) ? paquete.getDescripcion() + " + Bebida" : "Incluye Bebida";
    }

    @Override
    public double getValor() {
        return (paquete != null ) ? paquete.getValor() + 10000 : 10000;
    }
    
}
