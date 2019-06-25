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
public class Comprueba_mail {
    
         public static void main(String[] args) {
             
             int arroba = 0;
             
             boolean punto = false;
             
             String mail = JOptionPane.showInputDialog("introduce mail");
             
             for(int i=0; i<mail.length(); i++){
               
                 if(mail.charAt(i) == '@'){
                     
                     arroba++;
                 }
                 if(mail.charAt(i)=='.'){
                     
                     punto=true;
                 }
             }
             
             
            if(arroba==1 && punto==true){
         
                System.out.println("Es correcto"); 
                
       }    else{
                
               System.out.println("no Es correcto");
                
            }
            
              
       }   
             
}
   
