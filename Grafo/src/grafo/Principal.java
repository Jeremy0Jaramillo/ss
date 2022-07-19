/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafo;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author fabri
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grafo grafo = new Grafo(true);
        Nodo a = new Nodo(0, "A");
        Nodo b = new Nodo(1, "B");
        Nodo c = new Nodo(2, "C");
        Nodo d = new Nodo(3, "D");
        Nodo e = new Nodo(4, "E");
        
        grafo.insertarEnlace(a, b);
        grafo.insertarEnlace(b, c);
        grafo.insertarEnlace(b, d);
        grafo.insertarEnlace(c, e);
        grafo.insertarEnlace(b, a);

        grafo.printBordes();

    
    }
}
