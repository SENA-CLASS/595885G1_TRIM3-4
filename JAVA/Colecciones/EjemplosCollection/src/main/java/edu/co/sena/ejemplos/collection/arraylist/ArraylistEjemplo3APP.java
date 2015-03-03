/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplos.collection.arraylist;

import edu.co.sena.ejemplos.collection.Perro;
import edu.co.sena.ejemplos.collection.Persona;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Enrique Moreno
 */
public class ArraylistEjemplo3APP {
    public static void main(String[] args) throws Throwable{
        ArrayList<Persona> b= new ArrayList<>();
        
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
        //con iterator
        Iterator<Persona> it = b.iterator();
        while(it.hasNext()){
        Persona pt = it.next();
            System.out.println(pt.getTipoDocumento()+" "+pt.getNumeroDocumento()+" "+pt.getNombre() );
        }
        //for
        for (Iterator<Persona> it1 = b.iterator(); it1.hasNext();) {
            Persona pt = it1.next();
            System.out.println(pt.getTipoDocumento()+" "+pt.getNumeroDocumento()+" "+pt.getNombre() );
        }
        //foreach
        for (Persona pt : b) {
            System.out.println(pt.getTipoDocumento()+" "+pt.getNumeroDocumento()+" "+pt.getNombre() );
        }
        
        Persona pe = null;
        for (Persona persona2 : b) {
            if (persona2.compareTo(p2)==0) {
                System.out.println("la persona existe");
                pe=persona2;
            }
        }
        
        System.out.println(b.indexOf(pe));
        
        
        
        
        
    }
    
    
    
    
}


