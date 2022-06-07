/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosNodos;

/**
 *
 * @author SALA H
 */
public class ejecutor {

    public static void main(String[] args) {
        Nodo objA = new Nodo(8);
        System.out.println(objA);

        Nodo objB = new Nodo(4);
        System.out.println(objB);
        
        Nodo objC = new Nodo(15);
        System.out.println(objC);

        objA.concatenarNext(objB);
        System.out.println("NextA: " + objA.next);
        
        objB.concatenarNext(objC);
        System.out.println("NextB: " + objB.next);
        
        System.out.println("NextC: " + objC.next);
        
        int num = objA.obtenerDato();
        System.out.println("\nDato(A) obtenido: "+num);
    }
}