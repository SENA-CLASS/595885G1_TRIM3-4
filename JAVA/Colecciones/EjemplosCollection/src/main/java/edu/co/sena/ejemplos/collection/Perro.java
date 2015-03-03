/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplos.collection;

/**
 *
 * @author Enrique Moreno
 */
public class Perro {
    private String raza;
    private String nombre;

    public Perro(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }
    

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
