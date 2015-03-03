/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena;

/**
 *
 * @author Enrique Moreno
 */
public class Circulo {
    
    private float area;
    private float radio;
    
    public float getArea() {
        return area;
    }

    
    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }
    
    public void calculoDeArea(float radio){
    this.area= ((float)3.1416*radio)*((float)3.1416*radio);
    }

}
