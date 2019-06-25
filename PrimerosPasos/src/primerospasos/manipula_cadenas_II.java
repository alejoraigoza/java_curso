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
public class manipula_cadenas_II {
    
    public static void main(String[] args) {
        
        String frase = "Hoy es un estupendo día para aprender a programar en java";
        
        String frase_resuminda = frase.substring(0,29) + " irnos a la playa y "
                + "olvidarnos de todo..." + "y su total de letras es "
                + frase.length() + " y su ultima letra es " + frase.charAt(56);
        
        System.out.println(frase_resuminda);
        
        
        
    }
    
}
