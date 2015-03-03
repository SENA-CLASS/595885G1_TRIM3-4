/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.animales.app;

import edu.co.sena.animales.modelo.Cocodrilo;
import edu.co.sena.animales.modelo.CocodriloHembra;
import edu.co.sena.animales.modelo.Perro;
import edu.co.sena.animales.modelo.*;
import java.math.MathContext;

/**
 *
 * @author Enrique Moreno
 */
public class AnimalesAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro p1 = new PerroHembra();
        System.out.println(p1.getClass().getName());
        p1.comer();
        p1.desplazarse();
        p1.morir();
        p1.nacer();
        p1.reproducirse();
        p1.respirar();
        System.out.println("--------------------");
        Cocodrilo c1 = new CocodriloMacho();
        c1.comer();
        c1.desplazarse();
        c1.morir();
        c1.nacer();
        c1.reproducirse();
        c1.respirar();
                
        
        
        
        
        
        
    }
    
}
