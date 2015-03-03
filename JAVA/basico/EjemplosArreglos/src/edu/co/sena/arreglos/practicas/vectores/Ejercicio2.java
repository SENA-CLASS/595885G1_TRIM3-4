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
public class Ejercicio2 {
    public static void main(String[] args) {
        
        int vector[]= new int[10];
        int cont=0;
        for (int i = 100; i <= 300; i++) {
            if (cont==10) {
                break;
            }
            
            if (determinaPrimo(i)) {
                vector[cont]=i;
                cont++;
            }
        }
        
        Arreglo.escribirVectorEntero(vector);
        
        
        
    }
    
    public static boolean determinaPrimo(int a){
        int cont=0;
        for (int i = 1; i <= a; i++) {
            if ((a%i)==0) {
                cont++;
            }
        }
        if (cont==2) {
            return true;
        } else {
            return false;
        }
    
    
    }
    
    
}
