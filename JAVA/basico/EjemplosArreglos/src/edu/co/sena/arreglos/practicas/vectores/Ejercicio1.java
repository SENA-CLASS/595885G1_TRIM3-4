/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.arreglos.practicas.vectores;

import edu.co.sena.arreglos.utils.Arreglo;

/**
 *
 * @author Enrique Moreno
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int a[]= new int[10];
        Arreglo.llenarVectorEntero(a);
        int mayor=-1, posicion=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>mayor) {
                mayor=a[i];
                posicion=i;
            }
        }
        Arreglo.escribirVectorEntero(a);
        System.out.println("el numero mayor es "+a[posicion]+" y la posicion es"
                + ": "+posicion);
    }
}
