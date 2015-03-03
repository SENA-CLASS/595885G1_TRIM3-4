/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplo2;

import java.util.Scanner;

/**
 *
 * @author Enrique Moreno
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a;
       String b;
       float c;
       char d;
       double e;
       boolean f;
       
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite un entero");
        a= teclado.nextInt();
        System.out.println(a);
        System.out.println("digite el texto");
        b= teclado.next();
        System.out.println(b);
        c=teclado.nextFloat();
        e= teclado.nextDouble();
        f=teclado.nextBoolean();
    }
    
}
