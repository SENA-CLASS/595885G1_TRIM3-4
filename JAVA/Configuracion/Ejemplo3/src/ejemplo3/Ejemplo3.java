/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo3;

import java.util.Scanner;

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
        Scanner teclado = new Scanner(System.in);
        int a;
        a=teclado.nextInt();
        for (int i = 0; i < 100000000; i++) {
        System.out.println(a);    
        }
        
        
        
        
        
    }
    
}
