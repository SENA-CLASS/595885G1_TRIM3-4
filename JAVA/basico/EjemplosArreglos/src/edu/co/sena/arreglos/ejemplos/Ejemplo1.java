/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.arreglos.ejemplos;

import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Enrique Moreno
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // arreglos 1 dimension
        int[] a = new int[5]; // primera forma para definir
        int b[]=  new int[10]; //segunda forma
        
        System.out.println(a.length);
        System.out.println(b.length);
        //llenado
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            
            //a[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor en la posicion ["+i+"]: "));
            a[i]=teclado.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
        
        
        
        
    }
    
}
