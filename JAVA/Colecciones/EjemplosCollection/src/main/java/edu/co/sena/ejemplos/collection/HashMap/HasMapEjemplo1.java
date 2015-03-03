/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplos.collection.HashMap;


import edu.co.sena.ejemplos.collection.Perro;
import edu.co.sena.ejemplos.collection.Persona;
import java.util.HashMap;
import java.util.Collection;

/**
 *
 * @author Enrique Moreno
 */
public class HasMapEjemplo1 {
    public static void main(String[] args) {
        HashMap<Persona, Perro> listaDuenos = new HashMap<>();
    
    Perro pe1 = new Perro("chiguagua", "pili");
    Perro pe2 = new Perro("san bernando", "pili2");
    Perro pe3 = new Perro("pitbull", "pili3");
    Perro pe4 = new Perro("pastor", "pili3");
        
        Persona p1 = new Persona("CC", "1", "Hernando Moreno");
        Persona p2 = new Persona("CC", "2", "Enrique moreno");
        Persona p3 = new Persona("CC", "3", "Jose ");
        Persona p4 = new Persona("CC", "4", "Jessica");
        
    listaDuenos.put(p1, pe1);
    listaDuenos.put(p2, pe2);
    listaDuenos.put(p3, pe3);
    listaDuenos.put(p4, pe4);
    if(listaDuenos.containsKey(p4)){
        System.out.println("la persona existe");
    }
    
        System.out.println(listaDuenos.get(p1).getNombre());
    Collection<Perro> perritos = listaDuenos.values();
        for (Perro perro : perritos) {
            System.out.println(perro.getNombre());
        }
        
    }
    
    
    
        
    
}
