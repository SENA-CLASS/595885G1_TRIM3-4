/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemploherencia;

/**
 *
 * @author Enrique Moreno
 */
public class EmpleadoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager gerente1 = new Manager(182827, "andres", "aasdfsd78941", 1000000, "contabilidad");
        gerente1.raiseSalary(10);
        
        System.out.println(gerente1.getEmpId());
        System.out.println(gerente1.getName());
        System.out.println(gerente1.getSsn());
        System.out.println(gerente1.getSalary());
        System.out.println(gerente1.getNombreDepartamento());
        
        
    }
    
}
