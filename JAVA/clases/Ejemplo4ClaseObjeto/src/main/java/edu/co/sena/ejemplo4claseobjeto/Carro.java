/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplo4claseobjeto;

/**
 *
 * @author Enrique Moreno
 */
public class Carro {
    private String placa;
    private String color;
    private String modelo;
    private String marca;
    private int velocidad= 0;

    
    /**
     *
     * @param placa
     * @param color
     * @param modelo
     * @param marca
     */
    public Carro(String placa, String color, String modelo, String marca) {
        this.placa = placa;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
    }
    
    /**
     *
     */
    public void acelerar(){
    this.velocidad =this.velocidad+1;
    }
    
    public void ejecutarFrenoMano(){
    this.velocidad =0;
    }
    
    
    public void frenar(){
    if (this.velocidad>0)
        this.velocidad =this.velocidad-1;
    }
    
    
    /**
     *
     * @return
     */
    public String getPlaca() {
        return placa;
    }

    /**
     *
     * @param placa
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     *
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     *
     * @param velocidad
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
    
    
}
