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
public class Cuadrado {
    private float lado;
    private float area;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
        this.calculoDeArea(lado);
    }

    public float getArea() {
        return area;
    }

    private void calculoDeArea(float lado){
    this.area=lado*lado;
    }
    
    
}
