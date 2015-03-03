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
public abstract class Vertebrado extends Animal{
    @Override
    public void respirar() {
        System.out.println("respira oxigeno por los pulmones");
    }
    
}
