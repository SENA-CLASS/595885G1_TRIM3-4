/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.domain;

/**
 *
 * @author Enrique Moreno
 */
public class Manager extends Employee{
    private String nombreDepartamento;
    
    public Manager(int empId, String name, String ssn, double salary, String nombreDep) {
        super(empId, name, ssn, salary);
        this.nombreDepartamento=nombreDep;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }
    
    
    
    
    
}
