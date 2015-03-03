/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplo4claseobjeto;

/**
 *
 * @author Enrique Moreno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro c1= new Carro("aaa123", "rojo", "1992", "Mazda");
        System.out.println(c1.getColor());
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.frenar();
        c1.frenar();
        c1.frenar();
        System.out.println(c1.getVelocidad());
                
        System.out.println(Math.PI);
        CarroGas c2= new CarroGas(null, null, null, null);
        
        if(c2 instanceof Carro){
            System.out.println("el objeto es una instancia de carro");
        }else{
        }
                
        
        
    }
    
}
