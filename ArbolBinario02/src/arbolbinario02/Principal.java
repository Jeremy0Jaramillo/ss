/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolbinario02;

/**
 *
 * Pablo Costa | Jeremy Jaramillo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario ab = new ArbolBinario();
        
        ab.insertNode(6);
       
        
        Node node = ab.obtenerRaiz();
        
        ab.preOrden(node);
    }
    
}
