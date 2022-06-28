/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dobleenlace;

/**
 *
 * @author SALA A
 */
public class DobleEnlace {

    private Nodo tail;
    private Nodo head;

    public void insertarNodo(int value) {
        Nodo node = new Nodo(value);

        if (tail == null && head == null) {
            tail = node;
            head = node;
        }

        if (node.getValue() > head.getValue()) {
            node.setNextElement(head);
            head.setPreviousElement(node);
            head = node;
        } else {
            Nodo actual = head;
            while (actual != null) {
                if(actual.getValue() > node.getValue() && actual.getNextElement() == null){
                    actual.setNextElement(node);
                    node.setPreviousElement(actual);
                    tail = node;
                }else if(actual.getValue() > node.getValue() && node.getValue() < actual.getNextElement().getValue()){
                    actual.getNextElement().setPreviousElement(node);
                    node.setNextElement(actual.getNextElement());
                    actual.setNextElement(node);
                    node.setPreviousElement(actual);
                }
                actual = actual.getNextElement();
            }
        }
    }

    public void eliminarNodo(int data) {
        Nodo elim = head;

        while (elim != null) {
            if (elim.getValue() == data) {
                if (elim.getPreviousElement() == null) {
                    elim.getNextElement().setPreviousElement(null);
                    head = elim.getNextElement();
                } else if (elim.getNextElement() == null) {
                    elim.getPreviousElement().setNextElement(null);
                    tail = elim.getPreviousElement();
                } else {
                    elim.getNextElement().setPreviousElement(elim.getPreviousElement());
                    elim.getPreviousElement().setNextElement(elim.getNextElement());
                }
            }
            elim = elim.getNextElement();
        }
        if (elim != null) {
            System.out.println("el valor a eliminar no existe");
        } else {
            System.out.printf("Se ha eliminado el valor %d\n", data);
        }
    }

    public void print() {
        for (Nodo i = head; i != null; i = i.getNextElement()) {
            System.out.printf(" %s ", i.toString());
        }
        System.out.println();
    }
}
