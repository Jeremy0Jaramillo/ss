/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario02;

/**
 *
 * Pablo Costa | Jeremy Jaramillo
 */
public class ArbolBinario {

    Node root;
    Node current;

    public void insertNode(int n) {
        Node nodo = new Node(n);
        if (root == null) {
            root = nodo;
            current = root;
        }

        if (current.getValue() < n) {
            if (current.getLeft() == null) {
                current.setLeft(nodo);
            } else {
                current = current.getLeft();
                insertNode(n);
            }
        } else {
            if (current.getRight() == null) {
                current.setRight(nodo);
            } else {
                current = current.getRight();
                insertNode(n);
            }
        }
    }

    public Node obtenerRaiz() {
        return root;
    }

    public void preOrden(Node n) {
        
        if (root == null) {
            System.out.println("No hay nodos en el árbol.");
        }

        if (n != null) {
            System.out.printf("--%d--", n.getValue());
            preOrden(n.getLeft());
            preOrden(n.getRight());
        }

    }
}
