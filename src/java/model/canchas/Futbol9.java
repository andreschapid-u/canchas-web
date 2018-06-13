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
public class Futbol9 extends Cancha{

    public Futbol9() {
        this.tipo = "Futbol 9";
        this.medidaMin = "40M x 60M";
        this.medidaMax = "50M x 80M";
        this.nombre = "";
        this.costo = 0;
        this.estado = false;
        this.turnos = new ArrayList<>();
        this.localizacion = new Localizacion(0, 0, "");
    }
    
}
