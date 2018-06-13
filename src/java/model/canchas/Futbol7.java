/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.canchas;

import java.util.ArrayList;
import model.Cancha;
import model.Localizacion;

/**
 *
 * @author Carlos Andrés Chapid Inga
 */
public class Futbol7 extends Cancha {
    public Futbol7() {
        this.tipo = "Futbol 7";
        this.medidaMin = "25M x 45M";
        this.medidaMax = "30M x 50M";
        this.nombre = "";
        this.costo = 0;
        this.estado = false;
        this.turnos = new ArrayList<>();
        this.localizacion = new Localizacion(0, 0, "");
    }
}
