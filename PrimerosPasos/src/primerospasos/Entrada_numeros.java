/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

import javax.swing.JOptionPane;

/**
 *
 * @author ALejandro
 */

public class Entrada_numeros {
    public static void main(String[] args) {
        
        //double x=10000;
        
        //System.err.printf("%1.2f",x/3);
        // printf y "%1.2f" para indicar los decimales con que se imprime
       
        String num1 = JOptionPane.showInputDialog("Introduce un número");
        
        double num2 = Double.parseDouble(num1);
        
        System.err.print(" La raíz de " + num2 + " es ");
        
        System.out.printf("%1.2f", Math.sqrt(num2));
        
    }

  }