/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplo4strings;

import javax.swing.JOptionPane;

/**
 *
 * @author Enrique Moreno
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
//        String texto=JOptionPane.showInputDialog("digite su nombre");
//              
//        JOptionPane.showMessageDialog(null, texto.length(), "longitud", 3);
//        JOptionPane.showMessageDialog(null, texto.toLowerCase(), "minusculas", 3);
//        JOptionPane.showMessageDialog(null, texto.toUpperCase(), "mayusculas", 3);
//        
        
//        String numeros = JOptionPane.showInputDialog("escriba texto");
//        String numerosComoArray[] = numeros.split(" ");
//        for (int i = 0; i < numerosComoArray.length; i++) {
//            JOptionPane.showMessageDialog(null, numerosComoArray[i],"palabra numero "+(i+1),3 );
//            //System.out.println(numerosComoArray[i]);
//        }
       
        int a=5;
        int b=9;
        if (a==b){
            System.out.println("son iguales");
        }else{
            System.out.println("son diferente");
        
        }
        int c=(a==b)?a+1:b;
        System.out.println(c);
        
        
        
        
    }
    
}
