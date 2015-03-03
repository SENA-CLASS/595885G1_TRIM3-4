/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplo4matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author Enrique Moreno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //vector
//        String nombres[]= new String[3];
//        //System.out.println(nombres.length);
//        for (int i = 0; i < nombres.length; i++) {
//            nombres[i]=JOptionPane.showInputDialog("digite nombre");
//        }
//        
//        int a[] = new int[3];
//        
//        for (int i = 0; i < a.length; i++) {
//            a[i]=Integer.parseInt(JOptionPane.showInputDialog("digite un entero"));
//        }
//        
//        for (int i = 0; i < nombres.length; i++) {
//            System.out.println(nombres[i]);
//        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        
        //matriz
//        int columna= 3; 
//        int fila = 3;
//        int matriza[][] = new int[fila][columna];
//        
//        for (int i = 0; i < fila; i++) {
//            for (int j = 0; j < columna; j++) {
//                matriza[i][j]=Integer.parseInt(JOptionPane.showInputDialog("escriba el valor ["+i+","+j+"]"));
//            }
//        }
//        for (int i = 0; i < fila; i++) {
//            for (int j = 0; j < columna; j++) {
//                System.out.print(matriza[i][j]+"\t");
//            }
//            System.out.println("");
//        }        
        
        //for-each
//        String apellidos[] = new String[7];
//        for (int i = 0; i < apellidos.length; i++) {
//            apellidos[i]= JOptionPane.showInputDialog("digite");
//        }
//        //salida
//        for (String apellido : apellidos) {
//            System.out.println(apellido);
//        }
//        for (int i = 0; i < apellidos.length; i++) {
//            System.out.println(apellidos[i]);
//            
//        }
        int a=1;
        while (a<11) {            
            System.out.println(2+"*"+a+"="+(2*a));
            a++;
        }
        
        System.out.println(Math.E);
    }
    
}
