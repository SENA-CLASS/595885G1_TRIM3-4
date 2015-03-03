/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.arreglos.ejemplos;

import javax.swing.JOptionPane;
import edu.co.sena.arreglos.utils.Arreglo;

/**
 *
 * @author Enrique Moreno
 */
public class Ejemplo3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int fila= Integer.parseInt(JOptionPane.showInputDialog("digite el tamaño de las filas matriz"));
    int columna= Integer.parseInt(JOptionPane.showInputDialog("digite el tamaño de las columnas"));
    int matriz[][] = new int[fila][columna];
    
    Arreglo.llenarMatrizEntero(matriz, columna);
    Arreglo.escribirMatrizEntero(matriz, columna);
    
    
    
    }
    
    
}
