/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplo1;

import java.util.Scanner;

/**
 *
 * @author Enrique Moreno
 */
public class Ejemplo1APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=5, c=15;
        int b=5;
        double resultado;
        resultado= a*b;
        System.out.println(resultado);
        
        resultado= (double)a/b;
        System.out.println(resultado);
        
        resultado= a+b;
        System.out.println(resultado);
        
        resultado= a-b;
        System.out.println(resultado);
        
        resultado+=1;
        System.out.println(resultado);
        
        
        boolean aaa= true;
        System.out.println(!aaa);
        
        if(a == b){
            System.out.println("a es igual b");
        }else{
            System.out.println("a es diferente de b");
        }
        
        for (int i = 0; i < 10; i++) {
            
        }
        
        while (aaa == true) {            
            
        }
        
        do {            
            
        } while (aaa);
        // numero
        switch(a){
            case 1: {
            
                
                break;
            }
            
            case 2:{
                
                break;
            }
            default:{
            
                break;
            }
        }
        //letras
             switch(a){
            case 'a': {
            
                
                break;
            }
            
            case 'b':{
                
                break;
            }
            default:{
            
                break;
            }
        }
             //
             //cadena
             String ccc = "";
             switch(ccc){
            case "enero": {
            
                
                break;
            }
            
            case "febrero":{
                
                break;
            }
            default:{
            
                break;
            }
        }
                
     //lectura
     Scanner teclado = new Scanner(System.in);
     int numeroEntero = teclado.nextInt();
        System.out.println(numeroEntero);
     //String texto= teclado.nextLine();
       // System.out.println(texto);
                
                
            
        
        
        
        
    }
    
}
