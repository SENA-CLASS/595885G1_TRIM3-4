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
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado cuadrito1 = new Cuadrado();
        cuadrito1.setLado((float)3);
        
        System.out.println(cuadrito1.getLado());
        System.out.println(cuadrito1.getArea());
        
        Circulo circulo1 = new Circulo();
        circulo1.setRadio(4);
        circulo1.calculoDeArea(4);
        System.out.println(circulo1.getRadio());
        System.out.println(circulo1.getArea());
        
        Triangulo t1 = new Triangulo();
        t1.setAltura(2);
        t1.setLado(2);
        System.out.println(t1.getArea());
        
    }
    
}
