/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.uml.astracta;

/**
 *
 * @author Enrique Moreno
 */
public class AbstractAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a = new B();
        a.baila();
        a.caminar();
        a.baila =10;
        
        System.out.println(a.getClass().getName());
        
        B b = new B();
        b.baila();
        b.caminar();
        b.baila=10;
        b.color= "rojo";
        
         
        
        
        
        
    }
    
}
