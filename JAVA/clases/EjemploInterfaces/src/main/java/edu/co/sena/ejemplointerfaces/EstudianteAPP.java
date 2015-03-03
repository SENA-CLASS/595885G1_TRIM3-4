/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplointerfaces;

/**
 *
 * @author Enrique Moreno
 */
public class EstudianteAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Monitores m1 = new EstudianteIngenieria("CC", "12345", "jose");
        m1.revisarSalas();
        m1.sacarInventario();
        
        Pasante p1= new EstudianteIngenieria("CC", "12345", "jose");
        p1.trabajar();
        
        System.out.println(Pasante.a);
        
        EstudianteIngenieria ei1 = new EstudianteIngenieria("CC", "12345", "jose");
        ei1.lavaPlatos(1000000);
        
        
    }
    
}
