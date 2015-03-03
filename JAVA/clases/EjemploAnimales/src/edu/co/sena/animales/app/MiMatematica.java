/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.animales.app;

/**
 *
 * @author Enrique Moreno
 */
public class MiMatematica {
    Byte a= new Byte((byte)125);
    
    public static void main(String[] args) {
        
        
        
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        
        A claseA = new A();
        System.out.println("1"+claseA.nombreClase);
        System.out.println("2"+claseA.getNombeClase());
        
        B claseB = new B();
        System.out.println("3"+claseB.nombreClase);
        System.out.println("4"+claseB.getNombeClase());
        
    }
    
}
