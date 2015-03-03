/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplo3metodos;

/**
 *
 * @author Enrique Moreno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
       int a=5;
       int b=8;
       double c =suma(a, b);
        System.out.println(c);
        
    }
    
    public static double suma(int a, int b){
        
        return a/b;
    }
    
}
