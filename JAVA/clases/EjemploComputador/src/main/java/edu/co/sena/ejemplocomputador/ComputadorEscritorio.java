/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplocomputador;

import edu.co.sena.ejemplocomputador.dispositivos.entrada.Camara;
import edu.co.sena.ejemplocomputador.dispositivos.entrada.Mouse;
import edu.co.sena.ejemplocomputador.dispositivos.entrada.Teclado;
import edu.co.sena.ejemplocomputador.dispositivos.salida.Monitor;
import edu.co.sena.ejemplocomputador.partes.torre.LectorDisquette;
import edu.co.sena.ejemplocomputador.partes.torre.Torre;

/**
 *
 * @author Enrique Moreno
 */
public class ComputadorEscritorio extends Computador{
    
    private LectorDisquette lectorDisquette;
    
    
    
    
    public ComputadorEscritorio(Torre torre, Mouse mouse, Teclado teclado, Monitor pantalla) {
        super(torre, mouse, teclado, pantalla);
    }

    public LectorDisquette getLectorDisquette() {
        return lectorDisquette;
    }

    public void setLectorDisquette(LectorDisquette lectorDisquette) {
        this.lectorDisquette = lectorDisquette;
    }

   
    
    
}
