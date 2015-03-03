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
public abstract class Ornitorringo extends Mamifero{

    @Override
    public final void desplazarse() {
        System.out.println("nadan y caminan");
    }

    @Override
    public final void reproducirse() {
        super.reproducirse(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public final void nacer() {
        super.nacer(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
