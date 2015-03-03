/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.arreglos.ejemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author Enrique Moreno
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // arreglo de mas de una dimension
        int columna= 4;
        int a[][]= new int[3][columna];
        
        System.out.println(a.getClass().toString());
        System.out.println(a.length);
        
        //llando matriz
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < columna; j++) {
                a[i][j]= Integer.parseInt(JOptionPane.showInputDialog("digite el valor ["+i+","+j+"]"));
            }
        }
        //escribir la matriz
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
        
    
    
    }
    
    
    
}
