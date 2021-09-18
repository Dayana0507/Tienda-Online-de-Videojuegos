/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendavideojuegogkj;

import javax.swing.JOptionPane;

/**
 *
 * @author compu
 */
public class Verificacion {
    
    
     public static boolean verificar(String nombre){
     
         
     return nombre.matches("[0-2]{1}[1-9]{1}[0-9]{8}");    
    
     }
     public static boolean nombreAceptado(String nombre){
        
    
      
     return nombre.matches("[a-zA-Z]+\\s[a-zA-Z]+\\s[a-zA-Z]+\\s[a-zA-Z]+"); 
    }
    public static boolean direccionAceptada(String nombre){
        
    
      
    // return nombre.matches("[a-zA-Z]+.*[a-zA-Z]+.*[y]{1}.*[a-zA-Z]+.*[a-zA-Z]+.*\\s[N]{1}\\d+-\\d+");    //*[y]?.*[a-zA-Z]+\\N[0-6]-\\d"); 
    
    return nombre.matches("[a-zA-Z]+.*[a-zA-Z]*.*[a-zA-Z]*.*[a-zA-Z]*.*[a-zA-Z]*.*[a-zA-Z]*.*[a-zA-Z]*.*[a-zA-Z]*.*\\s[N]{1}\\d+-\\d+");  
    } 
     
}
