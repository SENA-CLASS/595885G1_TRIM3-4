/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.sobrecarga;

/**
 *
 * @author Enrique Moreno
 */
public class Moto {
    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private double cilindraje;
    private double precio;

    public Moto() {
    }
        
    public Moto(String placa, String marca, String modelo, String color, double cilindraje, double precio) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
        this.precio = precio;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public void setPlaca(int placa){
        String temPlaca;
        Integer tempPlacaWrapper = placa;
        temPlaca= tempPlacaWrapper.toString();
        this.placa= temPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Moto{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", cilindraje=" + cilindraje + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
    
    
}
