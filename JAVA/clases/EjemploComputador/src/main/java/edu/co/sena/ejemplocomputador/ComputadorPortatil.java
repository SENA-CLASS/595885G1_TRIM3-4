/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplocomputador;

import edu.co.sena.ejemplocomputador.dispositivos.entrada.Mouse;
import edu.co.sena.ejemplocomputador.dispositivos.entrada.Teclado;
import edu.co.sena.ejemplocomputador.dispositivos.salida.Monitor;
import edu.co.sena.ejemplocomputador.partes.torre.Bateria;
import edu.co.sena.ejemplocomputador.partes.torre.Torre;

/**
 *
 * @author Enrique Moreno
 */
public class ComputadorPortatil extends Computador{
    private Bateria bateria;
    
    public ComputadorPortatil(Torre torre, Mouse mouse, Teclado teclado, Monitor pantalla) {
        super(torre, mouse, teclado, pantalla);
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    
    
    
}
