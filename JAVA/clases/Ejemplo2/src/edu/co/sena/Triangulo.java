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
public class Triangulo {
    private double area;
    private double lado;
    private double altura;

    public double getArea() {
        return area;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
        this.calculoArea(lado, altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        this.calculoArea(lado, altura);
    }
    
    private void  calculoArea(double lado, double altura){
        this.area= lado*altura/2;
    }
             
}
