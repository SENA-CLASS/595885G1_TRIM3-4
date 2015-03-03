/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplocubetahuevos;

/**
 *
 * @author Enrique Moreno
 */
public class HueveriaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Throwable{
        // TODO code application logic here
        Huevo h1 = new Huevo("AA", "Blanco", 1, "Gallina", 200);
        Huevo h2 = new Huevo("AAAA", "Blanco", 1, "Avestruz", 200);
        Huevo h3 = new Huevo("AA", "Blanco", 1, "Cocodrilo", 200);
        Huevo h4 = new Huevo("AA", "Blanco", 1, "Pato", 200);
        
        
        Cubeta c1 = new Cubeta(10, "carton", "carton", 30);
        c1.agregarHuevo(h1);//0
        c1.agregarHuevo(h2);//1
        c1.agregarHuevo(h3);//2
        c1.agregarHuevo(h4);//3
        c1.agregarHuevo(h1);//4
        c1.agregarHuevo(h2);//5
        c1.agregarHuevo(h3);//6
        c1.agregarHuevo(h4);//7
        c1.agregarHuevo(h1);//8
        c1.agregarHuevo(h2);//9
        c1.agregarHuevo(h1);//10
        c1.agregarHuevo(h2);
        c1.agregarHuevo(h3);
        c1.agregarHuevo(h4);
        
        System.out.println(c1.getPrecio());
        
        c1.quitarTodosHuevo(h1);
        
        System.out.println(c1.getPrecio());
        
         
        c1.imprimirHuevos();
        
    }
    
}
