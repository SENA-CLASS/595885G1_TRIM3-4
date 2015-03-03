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
public abstract class Reptile extends Vertebrado{
     @Override
    public void desplazarse() {
        System.out.println("cuadrupedo y nada"); 
    }
    
    @Override
    public void reproducirse() {
        System.out.println("fertiliza huevos");
    }
    
    @Override
    public void nacer() {
        System.out.println("eclosionan");
    }
}
