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
public abstract class Tortuga extends Reptile{

    @Override
    public void comer() {
        System.out.println("hay carnivoras y herbiboras");
    }


    @Override
    public void reproducirse() {
        
    }

    @Override
    public void nacer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
