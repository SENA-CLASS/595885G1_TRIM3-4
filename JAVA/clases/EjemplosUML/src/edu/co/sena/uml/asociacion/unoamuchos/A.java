/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.uml.asociacion.unoamuchos;
import java.util.Collections;


/**
 *
 * @author Enrique Moreno
 */
public class A {
    
    private B b[];
    private int numObjetos=0;
    
    
    public A(int tamanoArreglo) {
        this.b= new B[tamanoArreglo];
    
    }
    
    public void agregarObjeto(B objetoAgregar){
     this.b[numObjetos]= objetoAgregar;
     numObjetos++;
    }
    
    
    
    
    
    
    
}
