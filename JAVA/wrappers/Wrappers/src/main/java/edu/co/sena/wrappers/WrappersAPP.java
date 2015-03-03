/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.wrappers;

import javax.swing.JOptionPane;


/**
 *
 * @author Enrique Moreno
 */
public class WrappersAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a=5;
        Integer aWrapper = a;
        String aString = "10";
        a= (int)Integer.parseInt(aString);
        
//        String lecturaa= JOptionPane.showInputDialog("digite el numero");
//        String lecturab= JOptionPane.showInputDialog("digite el numero");
//        int resultado=Integer.parseInt( lecturaa)+Integer.parseInt(lecturab);
        JOptionPane.showMessageDialog(null, a);
        
    }
    
}
