/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.clases;

/**
 *
 * @author Enrique Moreno
 */
 public class Estudiante {
    String tipoDocumento; // visibilidad paquete
    String numeroDocumento; //visibilidad paquete
    protected String edad; // visibilidad protegida
    public String sexo; //visibilidad publica
    private String nombres = "sdagdafg"; // visiblidad privada
    public String apellidos;
    private Monitor monitor; //refencias a una clase
    
    
    public void modificarTipoDocumento(String documento){
    this.numeroDocumento= documento;
    int a;
    }
    
    
    
    
    
}
