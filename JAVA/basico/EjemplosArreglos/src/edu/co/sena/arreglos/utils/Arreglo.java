/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.arreglos.utils;

import javax.swing.JOptionPane;

/**
 *
 * @author Enrique Moreno
 */
public abstract class Arreglo {
    
    public static void llenarVectorEntero(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            vector[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor "
                    + "para el vector en la posicion"+(i+1)));
        }
    }
    public static void escribirVectorEntero(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector en la posicion "+i+": "+vector[i]);
        }
    }
    
    public static void llenarVectorEntero(double vector[]){
        for (int i = 0; i < vector.length; i++) {
            vector[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor "
                    + "para el vector en la posicion"+(i+1)));
        }
    }
    public static void escribirVectorEntero(double vector[]){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector en la posicion "+i+": "+vector[i]);
        }
    }
    
    public static void llenarVectorEntero(long vector[]){
        for (int i = 0; i < vector.length; i++) {
            vector[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor "
                    + "para el vector en la posicion"+(i+1)));
        }
    }
    public static void escribirVectorEntero(long vector[]){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector en la posicion "+i+": "+vector[i]);
        }
    }
    
    public static void llenarMatrizEntero(int matriz[][], int columna){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < columna; j++) {
                 matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor "
                    + "para matriz en la posicion["+(i+1)+","+(j+1)+"]"));
            }
        }
    }
    public static void escribirMatrizEntero(int matriz[][], int columna){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
