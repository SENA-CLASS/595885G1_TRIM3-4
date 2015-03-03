/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplos.collection.arraylist;

import edu.co.sena.ejemplos.collection.Perro;
import edu.co.sena.ejemplos.collection.Persona;
import java.util.ArrayList;

/**
 *
 * @author Enrique Moreno
 */
public class ArayListEjemplo2APP {
    public static void main(String[] args) throws ClassCastException{
        try {
              ArrayList b= new ArrayList();
        
        Perro pe1 = new Perro("chiguagua", "pili");
        
        Persona p1 = new Persona("CC", "1", "Hernando Moreno");
        Persona p2 = new Persona("CC", "2", "Enrique moreno");
        Persona p3 = new Persona("CC", "3", "Enrique moreno");
        Persona p4 = new Persona("CC", "4", "Enrique moreno");
        


//agregar
        b.add(p1);
        b.add(p2);
        b.add(p3);
        b.add(pe1);
        
        Persona pa1 = (Persona)b.get(0);
        Persona pa2 = (Persona)b.get(1);
        Persona pa3 = (Persona)b.get(2);
        Perro pa4 = (Perro)b.get(3);
        
        System.out.println(pa1.getClass().getName());
        System.out.println(pa2.getClass().getName());
        System.out.println(pa3.getClass().getName());
        System.out.println(pa4.getClass().getName());
            
            
        } catch (Exception e) {
            System.out.println("el error es: "+e.toString());
        }
        
        
      
        
       
        
        
    }
}
