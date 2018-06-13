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
public class PaqueteBasico extends Paquete {

    private int numHoras;
    private double costoBase;

    public PaqueteBasico() {
        this.numHoras = 1;
        this.costoBase = 50000;
    }
    public PaqueteBasico(int numHoras) {
        this.numHoras = numHoras;
        this.costoBase = 50000;
    }

    
    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }
    
    
    @Override
    public String getDescripcion() {
        return "Paquete Básico";
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    
    @Override
    public double getValor() {
        return getCostoBase() * getNumHoras();
    }

}
