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
public class PaqueteUniforme extends PaqueteDecorator {

    private Paquete paquete;

    public PaqueteUniforme(Paquete paquete) {
        this.paquete = paquete;
    }

    public PaqueteUniforme() {
        this.paquete = null;
    }

    @Override
    public String getDescripcion() {
        return (paquete != null) ? paquete.getDescripcion() + " + Uniforme" : "Incluye Uniforme";

    }

    @Override
    public double getValor() {
        return (paquete != null) ? paquete.getValor() + 20000 : 20000;

    }

}
