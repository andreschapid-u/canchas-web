/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.canchas;

import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import model.Cancha;

/**
 *
 * @author Carlos Andrés Chapid Inga
 */
public class CanchaPrototype {
    private static Hashtable<String, Cancha> cacheCanchas = new Hashtable<>();
    
    public static Cancha getCancha(String nombre){
        Cancha cancha = cacheCanchas.get(nombre);
        return (Cancha)cancha.clone();
    }
    
    public static void loadCache(){
        Futbol6 futbol6 = new Futbol6();
        futbol6.setId("1");
        cacheCanchas.put(futbol6.getId(), futbol6);
        Futbol7 futbol7 = new Futbol7();
        futbol7.setId("2");
        cacheCanchas.put(futbol7.getId(), futbol7);
        Futbol8 futbol8 = new Futbol8();
        futbol8.setId("3");
        cacheCanchas.put(futbol8.getId(), futbol8);
        Futbol9 futbol9 = new Futbol9();
        futbol9.setId("4");
        cacheCanchas.put(futbol9.getId(), futbol9);
    }
    
    public static Collection<Cancha> getAllCanchas(){
        return cacheCanchas.values();
    }
    
    
}
