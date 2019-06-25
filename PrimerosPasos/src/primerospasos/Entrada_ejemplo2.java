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
import javax.swing.*;
public class Entrada_ejemplo2 {
    
    public static void main(String[] args) {
    
    String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
    
    String Edad =JOptionPane.showInputDialog("Introduce tu edad por favor");
    
    int  edad_usuario = Integer.parseInt(Edad);
    
    System.out.println(" Hola " + nombre_usuario + " el año que viene tendras  "
            + (edad_usuario+1) + " años "); 
 
    }

}
