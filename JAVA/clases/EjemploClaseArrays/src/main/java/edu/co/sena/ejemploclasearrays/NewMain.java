/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemploclasearrays;

import java.util.Arrays;

/**
 *
 * @author Enrique Moreno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = new int[10];
        a[0]=10;
        a[1]=1;
        a[2]=3;
        a[3]=2;
        a[4]=5;
        a[5]=9;
        a[6]=6;
        a[7]=50;
        a[8]=8;
        a[9]=4;
        
        int b[] = a;
        int burbuja;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]){
                burbuja= a[i];
                a[i]=a[j];
                a[j]=burbuja;
                }
            }
        }
        
        for (int i= 0; i<b.length;i++) {
            System.out.println("["+i+"]: "+a[i]);
        }
       // System.out.println(Arrays.binarySearch(a, 3));
        
    }
    
}
