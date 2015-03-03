/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.uml.asociacion.unoamuchos;

/**
 *
 * @author Enrique Moreno
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //creacion de objeto B que tiene como atribuo un objeto A
        A objetoA = new A(10);
        B objetoB = new B();
        objetoB.setA(objetoA);
        
        // creacion de un objeto A que contiene 10 objetos B
        A objetoA2 =new A(5);
        B objetoB2 = new B();
        objetoA2.agregarObjeto(objetoB2);
        objetoA2.agregarObjeto(objetoB2);
        objetoA2.agregarObjeto(objetoB2);
        objetoA2.agregarObjeto(objetoB2);
        objetoA2.agregarObjeto(objetoB2);
        objetoA2.agregarObjeto(objetoB2);
        
        
        
        
        
        
    }
    
}
