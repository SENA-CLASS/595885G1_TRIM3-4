/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplocomputador;

import edu.co.sena.ejemplocomputador.dispositivos.entrada.Camara;
import edu.co.sena.ejemplocomputador.dispositivos.entrada.Mouse;
import edu.co.sena.ejemplocomputador.dispositivos.entrada.Teclado;
import edu.co.sena.ejemplocomputador.dispositivos.entradasalida.Multifuncional;
import edu.co.sena.ejemplocomputador.dispositivos.salida.Impresora;
import edu.co.sena.ejemplocomputador.dispositivos.salida.Monitor;
import edu.co.sena.ejemplocomputador.partes.torre.Torre;

/**
 *
 * @author Enrique Moreno
 */
public class Computador {
    private Torre torre ;
    private Mouse mouse;
    private Teclado teclado;
    private Monitor pantalla;
    private Camara camara;
    private Impresora impresora;
    private Multifuncional multifuncional;
    
    
    public Computador(Torre torre, Mouse mouse, Teclado teclado, Monitor pantalla) {
        this.torre = torre;
        this.mouse = mouse;
        this.teclado = teclado;
        this.pantalla = pantalla;
    }
    
     public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public Torre getTorre() {
        return torre;
    }

    public void setTorre(Torre torre) {
        this.torre = torre;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Monitor getPantalla() {
        return pantalla;
    }

    public void setPantalla(Monitor pantalla) {
        this.pantalla = pantalla;
    }

    public Impresora getImpresora() {
        return impresora;
    }

    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }

    public Multifuncional getMultifuncional() {
        return multifuncional;
    }

    public void setMultifuncional(Multifuncional multifuncional) {
        this.multifuncional = multifuncional;
    }
    
    
}
