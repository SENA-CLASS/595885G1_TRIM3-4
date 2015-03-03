/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.uml.estatico;

/**
 *
 * @author Enrique Moreno
 */
public class A {
    
    private static int a=0;

    public A() {
                    this.a=this.a+1;
        
    }
    
    

    public static int getA() {
        return a;
    }

    public static void setA(int aA) {
        a = aA;
    }

    
    
    
    
    
}
