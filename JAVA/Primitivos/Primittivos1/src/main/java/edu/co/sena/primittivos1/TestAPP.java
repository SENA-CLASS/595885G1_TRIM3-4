/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.primittivos1;


/**
 *
 * @author Enrique Moreno
 */
public class TestAPP {
    
    Persona a = new Persona(5);
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tipos de datos primitivos
        byte a;
        short b;
        int c = 5;
        long d;
        float e;
        double f;
        char g;
        boolean h;
        
        
        //wrappers   
        System.out.println("el int tiene los siguientes rangos max:"+Integer.MIN_VALUE+" max:"+Integer.MAX_VALUE);
        System.out.println("el float tiene los siguientes rangos max:"+Float.MIN_VALUE+" max:"+Float.MAX_VALUE);
        System.out.println("el byte tiene los siguientes rangos max:"+Byte.MIN_VALUE+" max:"+Byte.MAX_VALUE);
        System.out.println("el short tiene los siguientes rangos max:"+Short.MIN_VALUE+" max:"+Short.MAX_VALUE);
        System.out.println("el long tiene los siguientes rangos max:"+Long.MIN_VALUE+" max:"+Long.MAX_VALUE);
        System.out.println("el double tiene los siguientes rangos max:"+Double.MIN_VALUE+" max:"+Double.MAX_VALUE);
        System.out.println("el char tiene los siguientes rangos max:"+Character.MIN_VALUE+" max:"+Character.MAX_VALUE);
        System.out.println("el boolean tiene los siguientes rangos max:"+Boolean.FALSE+" max:"+Boolean.TRUE);
        
        
    }
    
}
