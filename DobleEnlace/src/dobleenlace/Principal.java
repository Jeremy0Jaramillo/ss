/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dobleenlace;

import java.util.Scanner;

/**
 *
 * @author SALA A
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        DobleEnlace lista = new DobleEnlace();
        
        lista.insertarNodo(3);
        lista.insertarNodo(1);
        lista.insertarNodo(2);
        lista.insertarNodo(0);
        lista.insertarNodo(9);
        lista.insertarNodo(7);

        
        
        lista.eliminarNodo(1);
        lista.print();
    }
}
