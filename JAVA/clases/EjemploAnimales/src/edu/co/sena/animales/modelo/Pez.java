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
public abstract class Pez extends Vertebrado{

    @Override
    public void respirar() {
        System.out.println("respiran por medio de branqueas"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public void desplazarse() {
        System.out.println("nadar");
    }
    
    @Override
    public void reproducirse() {
        System.out.println("fertilizar");
    }
    
    @Override
    public void nacer() {
        System.out.println("eclosion");
    }
    
    
    
}
