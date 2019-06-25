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
public class Arrays_Bidimensionales {
    
        public static void main(String[] args) {
            
            int [][] matrix = {
                 {10,15,18,19,21},
                 {5,25,37,41,15},
                 {7,19,32,14,90},
                 {85,2,7,40,27},
                
            };
            
           
            
           for(int [] fila:matrix){
               
               System.out.println("");
               
               for(int z: fila){
                   
                    
                    System.out.print(z + " " ); 
                }
            }
        }

    }
    
