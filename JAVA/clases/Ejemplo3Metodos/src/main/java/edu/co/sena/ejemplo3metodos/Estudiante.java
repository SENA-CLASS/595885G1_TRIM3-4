/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplo3metodos;

/**
 *
 * @author Enrique Moreno
 */
public class Estudiante {
    String tipoDcumento;
    String numeroDocumento;
    int edad;
    String telefono;
    String direccion;
    int numeroTelefono=0;
   

    public String getTipoDcumento() {
        return tipoDcumento;
    }

    public void setTipoDcumento(String tipoDcumento) {
        this.tipoDcumento = tipoDcumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
    
    
    
}
