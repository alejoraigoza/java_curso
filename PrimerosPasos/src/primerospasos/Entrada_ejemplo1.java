/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primerospasos;

import java.util.Scanner;

/**
 *
 * @author ALejandro
 */
import java.util.*;
public class Entrada_ejemplo1 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre, por favor");
        
        String nombre_usuario = entrada.nextLine();
        
        System.out.println("Introduce tu edad, por favor");
        
        int edad = entrada.nextInt();
        
        System.out.println(" Hola " + nombre_usuario + " El año que viene tendras " 
        + (edad + 1) + " años ");
    }

            
}
