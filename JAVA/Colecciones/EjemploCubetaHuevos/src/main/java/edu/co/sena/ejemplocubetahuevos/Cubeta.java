/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplocubetahuevos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Enrique Moreno
 */
public class Cubeta {
    private int cantidadHuevos;
    private String material;
    private String color;
    private double precio;
    private ArrayList<Huevo> listaHuevos;
    private int contadorHuevos=0;
    
    public Cubeta(int cantidadHuevos, String material, String color, double precio) {
        this.cantidadHuevos = cantidadHuevos;
        this.material = material;
        this.color = color;
        this.precio = precio;
       listaHuevos = new ArrayList<>();
    }

    public void agregarHuevo(Huevo huevito){
        
        if(listaHuevos.size()<cantidadHuevos){
            listaHuevos.add(huevito);
            calcularPrecio(huevito.getPrecio());
        }else{
            System.out.println("la cubeta esta llena no se uedo meter el sigueinte "+huevito.toString());
        }
    
    }
    
    public void quitarUnHuevo(Huevo huevito){
        Huevo huevoEliminar= new Huevo(null, null, 0, null, 0);
        int bandera=0;
        for (Huevo huevo : listaHuevos) {
            if (huevo.compareTo(huevito)==0 && bandera==0){
            huevoEliminar=huevo;
            precio= precio-huevoEliminar.getPrecio();
            bandera++;
            }
        }
        int posicion=listaHuevos.indexOf(huevoEliminar);
        listaHuevos.remove(posicion);
    
    }
    
    public void quitarTodosHuevo(Huevo huevito){
    Huevo huevoEliminar= new Huevo(null, null, 0, null, 0);
    int conth= 0;
    ArrayList<Integer> posiciones = new ArrayList<>();
        for (Huevo huevo : listaHuevos) {
            if (huevo.compareTo(huevito)==0){
            huevoEliminar=huevo;
            precio= precio-huevoEliminar.getPrecio();
           // listaHuevos.remove(conth);
            posiciones.add(conth);
        
            }
        conth++;
        }
        
        
        for (int i=posiciones.size()-1; i>-1;i--) {
            listaHuevos.remove((int)posiciones.get(i));
            
        }
        
        
    }
    
    public void imprimirHuevos(){
        for (Huevo huevo : listaHuevos) {
            System.out.println(huevo.toString());    
        }
    }
    
    private void calcularPrecio(double valorHuevo){
        precio=precio+valorHuevo;
    }
    
    public int getCantidadHuevos() {
        return cantidadHuevos;
    }

    public void setCantidadHuevos(int cantidadHuevos) {
        this.cantidadHuevos = cantidadHuevos;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Huevo> getListaHuevos() {
        return listaHuevos;
    }

    public void setListaHuevos(ArrayList<Huevo> listaHuevos) {
        this.listaHuevos = listaHuevos;
    }
    
    
    
    
}
