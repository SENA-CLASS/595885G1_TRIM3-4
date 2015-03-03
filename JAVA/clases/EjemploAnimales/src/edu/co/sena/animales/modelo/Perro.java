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
public abstract class Perro extends Mamifero{
    public final static int PATAS=4;
    private String raza;

    
        
    
    
    
    @Override
    public void desplazarse() {
        System.out.println("cuadrupedo");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    
    
    
    
}
