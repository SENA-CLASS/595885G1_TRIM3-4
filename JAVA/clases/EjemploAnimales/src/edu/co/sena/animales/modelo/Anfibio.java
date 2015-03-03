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
public abstract class Anfibio extends Vertebrado{
    @Override
    public void comer() {
        System.out.println("carnivoros");
    }
    
    @Override
    public void desplazarse() {
            System.out.println("caminan, nadan");
    }
    
    @Override
    public void reproducirse() {
        System.out.println("fertilizacion");
    }
    
    @Override
    public void nacer() {
        System.out.println("eclosionan");
    }
}
