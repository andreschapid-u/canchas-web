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
public abstract class PaqueteDecorator  extends Paquete{
    
    @Override
    public abstract String getDescripcion();
    @Override
    public abstract double getValor();
    
}
