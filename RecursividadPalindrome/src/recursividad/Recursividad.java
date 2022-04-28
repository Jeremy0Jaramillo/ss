/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author SALA A
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entry = new Scanner (System.in);
        
        boolean boliviano;
        
        System.out.println("Ingrese la palabra a verificar si es palíndrome");
        String palabra = entry.nextLine();
        
        
            boliviano = Proceso(palabra);
            
            System.out.println(boliviano);
            
            
        
    }
    
    public static boolean Proceso(String n){
        
        
        if(n.length()==0 || n.length()==1){
            return true;
            
        }else{
            
            if(n.charAt(0) == n.charAt(n.length()-1)){
               
                return Proceso(n.substring(1, n.length()-1));
            }
            return false;
        }
            
        
        
    }
    
    
        
    }
    

