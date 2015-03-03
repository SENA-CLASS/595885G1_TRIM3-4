/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplopolimorfismo2;

/**
 *
 * @author Enrique Moreno
 */
public class Gerente extends Empleado{
    
    @Override
    public void trabajar(){
        System.out.println("controlo los empleados");
    }
    
    public void hacerNomina(){
        System.out.println("estoy haciendo nomina");
    }

    @Override
    public void cobrarSalirio() {
        System.out.println("cobra 4 salarion minimos");
    }
    
    
    
    
}
