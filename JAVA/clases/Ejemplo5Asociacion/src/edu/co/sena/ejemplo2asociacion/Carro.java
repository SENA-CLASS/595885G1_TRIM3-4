/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo2asociacion;

/**
 *
 * @author Enrique Moreno
 */
public class Carro {

    private String numeroPlaca;
    private String marca;
    private String modelo;
    private String color;
    private int cantidadPasajeros;
    private Persona pasajeros[];
    private int contadorPasajeros = 0;

    public Carro(String numeroPlaca, String marca, String modelo, String color, int cantidadPasajeros) {
        this.numeroPlaca = numeroPlaca;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantidadPasajeros = cantidadPasajeros;
        this.pasajeros = new Persona[cantidadPasajeros];
    }

    public int buscarPasajero(Persona e) {
        int resultado = -1;
        for (int i = 0; i < contadorPasajeros; i++) {
            if (pasajeros[i].getTipoDocumento()==e.getTipoDocumento()&&
                    pasajeros[i].getNumeroDocumento()==e.getNumeroDocumento()) {
                resultado = i;
            }
        }
        return resultado;
    }

    public boolean adicionarPersona(Persona e) {
        if (buscarPasajero(e) != -1 || contadorPasajeros==cantidadPasajeros) {
            return false;
        }
        pasajeros[contadorPasajeros] = e;
        contadorPasajeros++;
        return true;
    }
    
    public boolean removerPasajero(Persona e){
        boolean pasajeroSale=false;
        Persona pasajerosTemp[] =new Persona[cantidadPasajeros];
        int contadorPersonaTemp=0;
        
        for (int i = 0; i < contadorPasajeros; i++) {
            if (pasajeros[i].getTipoDocumento() == e.getTipoDocumento() &&
                    pasajeros[i].getNumeroDocumento()==e.getNumeroDocumento()) {
                pasajeroSale = true;
            } else {
                pasajerosTemp[contadorPersonaTemp] = pasajeros[i];
                contadorPersonaTemp++;
            }
        }
        
        if (pasajeroSale) {
                pasajeros = pasajerosTemp;
                contadorPasajeros = contadorPersonaTemp;
            }
            return pasajeroSale;
    
    }
            
            
    public void listarPasajeros(){
        System.out.println("---------------------------------------");
        System.out.println("listado de pasajeros");
        for (int i = 0; i < contadorPasajeros; i++) {
            System.out.println(pasajeros[i].toString());
            System.out.println(pasajeros[i].getTipoDocumento());
            System.out.println(pasajeros[i].getNumeroDocumento());
            System.out.println(pasajeros[i].getPrimerNombre());
            System.out.println(pasajeros[i].getSegundoNombre());
            System.out.println(pasajeros[i].getPrimerApellido());
            System.out.println(pasajeros[i].getSegundoApellido());
            System.out.println("---------------------------------------");
        }
    
    }

    
    //metodos getters  setter

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
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

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public Persona[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Persona[] pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getContadorPasajeros() {
        return contadorPasajeros;
    }

    public void setContadorPasajeros(int contadorPasajeros) {
        this.contadorPasajeros = contadorPasajeros;
    }
    
    
    
}
