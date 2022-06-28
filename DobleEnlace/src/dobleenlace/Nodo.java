/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dobleenlace;

/**
 *
 * @author SALA A
 */
public class Nodo {
    private int dato;
    private Nodo nextElement;
    private Nodo previousElement;
 
    public Nodo(int value) {
        dato = value;
    }
 
    public int getValue() {
        return dato;
    }
 
    public void setValue(Integer value) {
        dato = value;
    }
 
    public Nodo getNextElement() {
        return nextElement;
    }
 
    public void setNextElement(Nodo n) {
        nextElement = n;
    }
 
    public Nodo getPreviousElement() {
        return previousElement;
    }
 
    public void setPreviousElement(Nodo n) {
        previousElement = n;
    }
 
    @Override
    public String toString() {
        String cadena = "";
               cadena = String.format("%s<--%s-->", cadena, dato);
               return cadena;
    }
 
}


