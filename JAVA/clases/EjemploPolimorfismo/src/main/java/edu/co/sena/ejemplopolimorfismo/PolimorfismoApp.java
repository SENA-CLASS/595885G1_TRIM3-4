/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplopolimorfismo;

/**
 *
 * @author Enrique Moreno
 */
public class PolimorfismoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Carro carrito1= new CarroElectrico(2.4, 2, 2.8, "aaa123", 4, "rojo", "2014");
        
        carrito1.setCantidadLlantas(5);
        carrito1.setColor("verde");
        carrito1.setMatricula("bbb123");
        carrito1.setModelo("2000");
        
        System.out.println(carrito1.getClass().getCanonicalName());
        int a[] = new int[10];
    }
    
    public static void algo(){
    }
    
}
