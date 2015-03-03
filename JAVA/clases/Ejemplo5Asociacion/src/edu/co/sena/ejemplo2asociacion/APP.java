/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplo2asociacion;

/**
 *
 * @author Enrique Moreno
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro1 = new Carro("AAA123", "Mazda", "2005", "rojo", 4);
        
        Persona p1= new Persona("CC", "123456", "andres", "felipe", "martinez", "martinea");
        Persona p2= new Persona("CC", "12345", "andres", "felipe", "martinez", "martinea");
        Persona p3= new Persona("CC", "1234", "andres", "felipe", "martinez", "martinea");
        Persona p4= new Persona("CC", "123", "andres", "felipe", "martinez", "martinea");
        Persona p5= new Persona("CC", "1234567", "andres", "felipe", "martinez", "martinea");
        
        carro1.adicionarPersona(p1);
        carro1.adicionarPersona(p2);
        carro1.adicionarPersona(p3);
        carro1.adicionarPersona(p4);
        carro1.adicionarPersona(p5);
        carro1.adicionarPersona(p4);
        
        System.out.println(carro1.getContadorPasajeros());
        carro1.listarPasajeros();
        
        if (carro1.removerPasajero(p1)) {
            System.out.println("se pudo eliminar");
        }
        carro1.adicionarPersona(p5);
        System.out.println(carro1.getContadorPasajeros());
        carro1.listarPasajeros();
        
        
        
    }
    
}
