/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplointerfaces;

/**
 *
 * @author Enrique Moreno
 */
public class EstudianteIngenieria extends Estudiante implements Monitores, Pasante{

    public EstudianteIngenieria(String tipoDocumento, String numeroDocumento, String nombre) {
        super(tipoDocumento, numeroDocumento, nombre);
    }

    
    
    
    @Override
    public void revisarSalas() {
        System.out.println("reviso salas");
    }

    @Override
    public void sacarInventario() {
        System.out.println("saco inventario");
    }

    @Override
    public void trabajar() {
        System.out.println("trabajo "+this.getNombre());
    }
    
    public void estudiar(){
        System.out.println("estudia");
    
    }

    @Override
    public void lavaPlatos(int numeroPlatos) {
        System.out.println("lavo feliz mis "+numeroPlatos+" platos");
    }
    
    
    
}
