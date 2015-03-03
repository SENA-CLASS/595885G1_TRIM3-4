/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.sobrecarga;

/**
 *
 * @author Enrique Moreno
 */
public class SobrecargaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Moto motico1 = new Moto("aaa123", "ducati", "2012", "rojo", 3.8, 8_500_000);
        System.out.println(motico1.toString());
        int placa = 123456;
        motico1.setPlaca(placa);
        System.out.println(motico1.toString());
        
        Moto motico2 = new Moto();
        System.out.println(motico2.toString());
        
        int a=5;
        double b=3.9;
        System.out.println(suma(a, b));
        System.out.println(suma(a, a));
        
    }
    
    public static double suma(int a, int b){
        return (double)a+b;
    
    }
    public static String suma(int a, double b){
        double temp = (int)a+b;
        Double tempW= temp;
        return tempW.toString();
    
    }
    
    
    
}
