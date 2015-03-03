package edu.co.sena.ejemplopolimorfismo2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enrique Moreno
 */
public class EmpleadoAPP {
    public static void main(String[] args) {
      Empleado e1= new Gerente();
      e1.trabajar();
      e1.cobrarSalirio();
        System.out.println(e1.getClass().getName());
    }
}
