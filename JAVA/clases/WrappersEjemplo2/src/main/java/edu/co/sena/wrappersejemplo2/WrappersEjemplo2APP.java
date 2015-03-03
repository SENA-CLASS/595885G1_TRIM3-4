/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.wrappersejemplo2;

import javax.swing.JOptionPane;

/**
 *
 * @author Enrique Moreno
 */
public class WrappersEjemplo2APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valorLeido;
        valorLeido= Integer.parseInt(JOptionPane.showInputDialog("digite el numero: "));
        
        
        for (int i = valorLeido ; i >= 1; i--) {
            for (int j = 1; j <= 10; j++) {
                //JOptionPane.showMessageDialog(null, i+"*"+j+"="+i*j);
                System.out.println(i+"*"+j+"="+i*j);
            }
            
            
        }
        
        
        
    }
    
}
