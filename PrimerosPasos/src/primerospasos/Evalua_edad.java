/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;


import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ALejandro
 */
public class Evalua_edad {
    
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
    
         System.out.println("Ingresa tu edad, por favor");  
         
         int edad = entrada.nextInt();
         
         if(edad < 18){
             System.out.println("Eres un adolescente");
         }
         else if (edad<40){
             System.out.println("Eres joven");
         } 
             
        else if (edad<65){
             System.out.println("Eres maduro");
         } 
        else{
             System.out.println("Cuidate");
        }
        
       
        
    }
}
