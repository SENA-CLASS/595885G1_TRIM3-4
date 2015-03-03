/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplopolimorfismo;

/**
 *
 * @author Enrique Moreno
 */
public class Carro {
    private String matricula;
    private int cantidadLlantas;
    private String color;
    private String modelo;

    public Carro(String matricula, int cantidadLlantas, String color, String modelo) {
        this.matricula = matricula;
        this.cantidadLlantas = cantidadLlantas;
        this.color = color;
        this.modelo = modelo;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCantidadLlantas() {
        return cantidadLlantas;
    }

    public void setCantidadLlantas(int cantidadLlantas) {
        this.cantidadLlantas = cantidadLlantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    
    
}
