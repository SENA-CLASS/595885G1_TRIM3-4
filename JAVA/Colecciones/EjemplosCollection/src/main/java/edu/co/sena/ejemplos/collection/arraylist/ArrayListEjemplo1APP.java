/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplos.collection.arraylist;

import edu.co.sena.ejemplos.collection.Perro;
import edu.co.sena.ejemplos.collection.Persona;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Enrique Moreno
 */
public class ArrayListEjemplo1APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Persona> b = new ArrayList<>();
        Perro pe1 = new Perro("chiguagua", "pili");
        
        Persona p1 = new Persona("CC", "1", "Hernando Moreno");
        Persona p2 = new Persona("CC", "2", "Enrique moreno");
        Persona p3 = new Persona("CC", "3", "Enrique moreno");
        Persona p4 = new Persona("CC", "4", "Enrique moreno");
        


//agregar
        b.add(p1);
        b.add(p2);
        b.add(p3);
        b.add(p4);
       
        
        
        System.out.println(b.size());
        
        if (b.contains(p2)){
        
            System.out.println("si existe en la coleccion");
        }else{
            System.out.println("no existe en la coleccion");
        }
       
        Iterator it = b.iterator();
        
        
        while (it.hasNext()) {
            Object object = it.next();
            
        }
 
       
       
       int posicion;
       posicion= b.lastIndexOf(p4);
       Persona pt = b.get(posicion);
       b.remove(posicion);
       
        
       
       
       System.out.println("-------"+pt.getNombre()+pt.getNumeroDocumento());
       
        System.out.println(posicion);
        //
        for (Persona object : b) {
            System.out.println(object.getNumeroDocumento()+" "+ object.getNombre());
        }
       
       ArrayList<Persona> c = (ArrayList<Persona>) b.clone();
       
       for (Persona object : c) {
            System.out.println(object.getNumeroDocumento()+" clon "+ object.getNombre());
       }
       
       
       
        
        
    }
    
}
