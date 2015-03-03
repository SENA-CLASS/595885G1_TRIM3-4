/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.uml.astracta;

/**
 *
 * @author Enrique Moreno
 */
public class B extends A{
    public String color;
    
    
    @Override
    public void baila() {
        System.out.println("baila");
       
    }
    
    @Override
    public void caminar(){
        System.out.println("camina pero cojo");
    }

    
    
}
