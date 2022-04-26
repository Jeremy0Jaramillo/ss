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
public class ejercicio {
    public static void main(String[] args){
        Scanner entry = new Scanner(System.in);
        
        int valor;
        
        System.out.println("Ingrese un valor a sumar los antecedentes");
        valor = entry.nextInt();
        
        valor = yocuando(valor);
        System.out.println(valor);
    }
    
    public static int yocuando(int n){
        if(n==1){
            return 1;
        }else{
            return n+(yocuando(n-1));
        }
    }
}
