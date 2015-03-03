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
public class CaroGasolina extends Carro{
   private double capacidadTanque;

    public CaroGasolina(double capacidadTanque, String matricula, int cantidadLlantas, String color, String modelo) {
        super(matricula, cantidadLlantas, color, modelo);
        this.capacidadTanque = capacidadTanque;
    }

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }
   
   
}
