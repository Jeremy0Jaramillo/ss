/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class ejercicio2 {
    public static void main(String[] args){
        
        //buscar relacion en la ultima y primera letra, luego buscar relacion con la penultima y seguna letra de la palabra
        Scanner entry = new Scanner (System.in);
        
        System.out.println("Ingrese la palabra a verificar si es palíndrome");
        String palabra = entry.nextLine();
        
        Proceso(palabra.length());
    }
    
    public static void Proceso(int n){
        
        
    }
    
}
