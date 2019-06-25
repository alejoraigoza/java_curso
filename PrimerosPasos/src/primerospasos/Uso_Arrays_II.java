/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;
import javax.swing.*;

/**
 *
 * @author ALejandro
 */
public class Uso_Arrays_II {
    
    public static void main(String[] args) {
        
       int [] matriz_alea = new int[150];
       
        for (int i = 0; i < matriz_alea.length; i++) {
            matriz_alea[i]=(int)Math.round(Math.random()*100);
            
           
        }
        
        for (int numeros:matriz_alea) {
            
            System.out.print(numeros + "," );
            
        }
    }
    
} 
