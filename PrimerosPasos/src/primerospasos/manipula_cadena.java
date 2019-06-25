/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

/**
 *
 * @author ALejandro
 */
public class manipula_cadena {
    
    public static void main(String[] args) {
        
    String nombre = "Juan";
        
    System.out.println("Mi nombre tiene " + nombre.length() + " letras. "); 
    
    System.out.println("la primera letra de mi nombre " + nombre  + " es " +  nombre.charAt(0)); 
    
    int ultima_letra;
    
    ultima_letra = nombre.length();
    
    System.out.println(" y la ultima letra es " + nombre.charAt(ultima_letra-1));

    }
}
