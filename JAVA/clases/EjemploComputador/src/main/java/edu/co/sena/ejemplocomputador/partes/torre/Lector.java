/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplocomputador.partes.torre;

/**
 *
 * @author Enrique Moreno
 */
public class Lector extends Parte{
    private double ancho;
    private double alto;
    private double largo;

    public Lector(double ancho, double alto, double largo, String serial, String marca) {
        super(serial, marca);
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    
    
    
   
}
