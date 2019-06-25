/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ALejandro
 */
public class numeros {
    
    public static void main(String[] args){
        
       Scanner entrada = new Scanner(System.in);
       
        System.out.println("Digite el limite");
        
         int limite = entrada.nextInt();
        
        System.out.println("Digite el dato");
       
      
      int dato = entrada.nextInt();
      
          while ( dato < limite ){
              
              if( dato % 2 == 0){
                  System.out.println(dato);
                  
              }
        dato++;
        
              
    }
    
    
    }
    
    
    
}
