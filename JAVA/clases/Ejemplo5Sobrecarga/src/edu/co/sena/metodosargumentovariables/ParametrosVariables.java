/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.metodosargumentovariables;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Enrique Moreno
 */
public class ParametrosVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(suma(1,2,3,4,5,6));
        System.out.println(suma(1,2));
        System.out.println(suma(1,2,3));
        System.out.println(suma(1,2,3,4));
        
        int a[] = new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        
        System.out.println(sumaMatrix(a));
        
        Scanner teclado = new Scanner(System.in);
        
        
        
    }

    public static int suma(int... num) {
        int sumatoria = 0;
        for (int i = 0; i < num.length; i++) {
            sumatoria += num[i];
        }
        return sumatoria;
    }
    public static int sumaMatrix(int[] num) {
        int sumatoria = 0;
        for (int i = 0; i < num.length; i++) {
            sumatoria += num[i];
        }
        return sumatoria;
    }
    

}
