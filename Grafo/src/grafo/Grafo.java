/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafo;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author fabri
 */
public class Grafo {

   //Cada nodo se mapea a la lista de todas sus vecinos
private HashMap<Nodo, LinkedList<Nodo>> MapaAdyacencia;
private boolean direccion;

public Grafo(boolean direccion) {
    this.direccion = direccion;
    MapaAdyacencia = new HashMap<>();
}

public void insertarEnlaceApoyo(Nodo a, Nodo b) {
    LinkedList<Nodo> tmp = MapaAdyacencia.get(a);

    if (tmp != null) {
        tmp.remove(b);
    }
    else tmp = new LinkedList<>();
    tmp.add(b);
    MapaAdyacencia.put(a,tmp);
}

public void insertarEnlace(Nodo origen, Nodo destino) {
    
    // Nos aseguramos de que cada nodo usado se muestre en el .keySet()
    if (!MapaAdyacencia.keySet().contains(origen))
        MapaAdyacencia.put(origen, null);

    if (!MapaAdyacencia.keySet().contains(destino))
        MapaAdyacencia.put(destino, null);

    insertarEnlaceApoyo(origen, destino);

    // Si la gráfica no es dirigida, también vamos a añadir un borde desde destino a origen 
    if (!direccion) {
        insertarEnlaceApoyo(destino, origen);
    }
}




public void printBordes() {
        for (Nodo nodo : MapaAdyacencia.keySet()) {
            System.out.print("El " + nodo.name + " tiene enlace hacia: ");
            if (MapaAdyacencia.get(nodo) != null) {
                for (Nodo vecino : MapaAdyacencia.get(nodo)) {
                    System.out.print(vecino.name + " ");
                }
                System.out.println();
            }
            else {
                System.out.println("ninguno");
            }
        }
    }

    
}
