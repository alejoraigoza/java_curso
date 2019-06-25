/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package primerospasos;
import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author ALejandro
 */
public class Areas {
    
      public static void main(String[] args) {
          
          Scanner entrada = new Scanner(System.in);
          
          System.out.println(" Elige una opción: \n1: cuadrado \n2: rectangulo \n3: Triangulo \n4: circulo");
          
          int figura =  entrada.nextInt();
          
          switch(figura){
              case 1:
                  
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                
                System.out.println(" El area del cuadrado es " + Math.pow(lado, 2));
                  
                break;
                  
              case 2:
                  
                 int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                  
                 int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

                 System.out.println(" EL area del rectagulo es " + base*altura);
                 
                 break;
                 
              case 3:
                  
                  base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                  
                  altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

                  System.out.println(" EL area del triangulo es " + (base*altura)/2);
                 
                 break;
                  
              case 4:
                  
                  int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
                  
                  System.out.print("El area del circulo es ");
                  
                  System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
                  
                  break;
                  
               default:
                   
                   System.out.println("La opción no es correcta");   
             }
             
        }
      
}       
          
    
