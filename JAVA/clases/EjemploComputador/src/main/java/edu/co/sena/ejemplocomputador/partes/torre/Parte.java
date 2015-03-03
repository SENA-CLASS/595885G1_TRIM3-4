/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplocomputador.partes.torre;

/**
 *
 * @author Enrique Moreno
 */
public class Parte {
    private String serial;
    private String marca;

    public Parte(String serial, String marca) {
        this.serial = serial;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "serial=" + serial + ", marca=" + marca;
    }
    
    
    
}
