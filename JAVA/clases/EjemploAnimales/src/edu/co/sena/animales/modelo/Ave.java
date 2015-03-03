/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.animales.modelo;

/**
 *
 * @author Enrique Moreno
 */
public abstract class Ave extends Vertebrado{
    
     @Override
    public void desplazarse() {
         System.out.println("volar");
    }
    
     @Override
    public void reproducirse() {
         System.out.println("fertilizacion");
    }
    @Override
    public void nacer() {
        System.out.println("eclosion");
    }
    
}
