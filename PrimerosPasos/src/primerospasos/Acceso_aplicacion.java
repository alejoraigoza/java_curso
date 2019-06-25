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
public class Acceso_aplicacion {
    
    public static void main(String[] args) {
        
       String clave = "juan";
       
       String pass ="";
       
       while (!clave.equals(pass)){
           
           pass=JOptionPane.showInputDialog("Introduce la contraseña por favor");
           
           if (!clave.equals(pass)){
               
               System.out.println("Contraseña incorrecta");
           }
           
       }
        
        System.out.println("Contraseña correcta. Acceso permitido");
    }
    
}
