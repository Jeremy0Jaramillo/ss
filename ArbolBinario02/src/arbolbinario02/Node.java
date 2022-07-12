/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario02;

/**
 *
 * Pablo Costa | Jeremy Jaramillo
 */
public class Node {
    private int value;
    private Node left;
    private Node right;
    
    public Node(int n){
        value = n;
    }
    
    public void setLeft (Node n){
        left = n;
    }
    
    public void setRight (Node n){
        right = n;
    }
    
    public int getValue (){
        return value;
    }
    
    public Node getLeft (){
        return left;
    }
    
    public Node getRight (){
        return right;
    }
    
    @Override
    public String toString(){
        String ola = String.format("--%d--",value);
        
        return ola;
    }
    
}
