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
public class CarroElectrico extends Carro{
    private double voltage;
    private double corriente;
    private double potencia;

    public CarroElectrico(double voltage, double corriente, double potencia, String matricula, int cantidadLlantas, String color, String modelo) {
        super(matricula, cantidadLlantas, color, modelo);
        this.voltage = voltage;
        this.corriente = corriente;
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public double getCorriente() {
        return corriente;
    }

    public void setCorriente(double corriente) {
        this.corriente = corriente;
    }
    
    
   
    
   
   
}
