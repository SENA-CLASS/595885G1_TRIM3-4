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
public class Torre extends Parte {
    private DiscoDuro disco;
    private MotherBoard targetaMadre;
    private RAM targetaMemoria;
    private Fuente fuente;
    private Procesador procesador;
    private Disipador disipadorProcesador;
    private Lector lector = new Lector(0, 0, 0, null, null);
    private TargetaSonido targetaSonido = new TargetaSonido(null, null) ;
    private TargetaVideo targetaVideo = new TargetaVideo(null, null);

    public Torre(RAM memoria,DiscoDuro disco, MotherBoard targetaMadre, Fuente fuente, Procesador procesador, Disipador disipadorProcesador, String seria, String marca) {
        super(seria, marca);
        this.targetaMemoria=memoria;
        this.disco = disco;
        this.targetaMadre = targetaMadre;
        this.fuente = fuente;
        this.procesador = procesador;
        this.disipadorProcesador = disipadorProcesador;
    }

    public Torre(MotherBoard targetaMadre, RAM targetaMemoria, Fuente fuente, Procesador procesador, Disipador disipadorProcesador, String seria, String marca) {
        super(seria, marca);
        this.targetaMadre = targetaMadre;
        this.targetaMemoria = targetaMemoria;
        this.fuente = fuente;
        this.procesador = procesador;
        this.disipadorProcesador = disipadorProcesador;
    }
    
    
    
    public Disipador getDisipadorProcesador() {
        return disipadorProcesador;
    }

    public void setDisipadorProcesador(Disipador disipadorProcesador) {
        this.disipadorProcesador = disipadorProcesador;
    }

    public DiscoDuro getDisco() {
        return disco;
    }

    public void setDisco(DiscoDuro disco) {
        this.disco = disco;
    }

    public MotherBoard getTargetaMadre() {
        return targetaMadre;
    }

    public void setTargetaMadre(MotherBoard targetaMadre) {
        this.targetaMadre = targetaMadre;
    }

    public Fuente getFuente() {
        return fuente;
    }

    public void setFuente(Fuente fuente) {
        this.fuente = fuente;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public TargetaSonido getTargetaSonido() {
        return targetaSonido;
    }

    public void setTargetaSonido(TargetaSonido targetaSonido) {
        this.targetaSonido = targetaSonido;
    }

    public TargetaVideo getTargetaVideo() {
        return targetaVideo;
    }

    public void setTargetaVideo(TargetaVideo targetaVideo) {
        this.targetaVideo = targetaVideo;
    }

    public RAM getTargetaMemoria() {
        return targetaMemoria;
    }

    public void setTargetaMemoria(RAM targetaMemoria) {
        this.targetaMemoria = targetaMemoria;
    }
    
    
    
}
