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
public class Huevo implements Comparable<Huevo>{
    private String tamano;
    private String color;
    private int yemas;
    private String tipoAnimal;
    private double precio;

    public Huevo(String tamano, String color, int yemas, String tipoAnimal, double precio) {
        this.tamano = tamano;
        this.color = color;
        this.yemas = yemas;
        this.tipoAnimal = tipoAnimal;
        this.precio = precio;
    }

    

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYemas() {
        return yemas;
    }

    public void setYemas(int yemas) {
        this.yemas = yemas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Huevo o) {
       int resultado =-1;
       if(this.color.equals(o.color) && this.precio==o.precio && this.tamano.equals(o.tamano) && tipoAnimal.equals(o.tipoAnimal) && yemas==o.yemas               ){
           resultado=0;
       
       }
       return resultado;
    }

    @Override
    public String toString() {
        return "Huevo{" + "tamano=" + tamano + ", color=" + color + ", yemas=" + yemas + ", tipoAnimal=" + tipoAnimal + ", precio=" + precio + '}';
    }
    
    
    
    
    
}
