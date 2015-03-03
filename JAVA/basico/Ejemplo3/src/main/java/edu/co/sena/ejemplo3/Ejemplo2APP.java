/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplo3;

import javax.swing.JOptionPane;

/**
 *
 * @author Enrique Moreno
 */
public class Ejemplo2APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mensajeMenu="1. Area cuadrado\n"
                + "2. Area circulo\n"
                + "3. Area triangulo\n"
                + "4. Volumen cubo\n"
                + "5. volumen esfera\n"
                + "6. volumen de piramide\n"
                + "7. salir";
        
        //String opcion =JOptionPane.showInputDialog(mensajeMenu);
        
        int opcion=0;
        do {            
            opcion =Integer.parseInt(JOptionPane.showInputDialog(null,mensajeMenu,"MENU",3));
            switch(opcion){
                case 1: {
                    double lado;
                    lado= (double)Double.parseDouble(JOptionPane.showInputDialog("digite el valor del lado"));
                    JOptionPane.showMessageDialog(null, "el area del cuadrado es: "+lado*lado);
                    break;
                }
                case 2:{
                }
                case 7:{
                    JOptionPane.showMessageDialog(null, "gracias por usar la aplicacion");
                    break;
                }
                default:{
                JOptionPane.showMessageDialog(null, "la ocpion selecionada no existe");
                }
            }
        } while (opcion!=7);
    }
}
