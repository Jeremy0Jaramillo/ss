/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosNodos;

/**
 *
 * @author SALA H
 */
public class Nodo {
    int dato;
    Nodo next;
    
    public Nodo(){
        dato = 0;
        next = null;
    }
    
    public Nodo (int n){
        dato = n;
        next = null;
    }
    
    public int obtenerDato(){
        return dato;
    }
    
    public void concatenarNext (Nodo nod){
        next = nod;
    }
    
    @Override
    public String toString(){
        String valor = String.format("%s\n"
                , dato);
        return valor;
    }
}
