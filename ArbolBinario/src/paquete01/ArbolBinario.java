/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author kevin
 */
public class ArbolBinario {

    Nodo raiz = null;

    
    
    public void insertarNodo(int d) {
        Nodo newNodo = new Nodo(d);
        if (raiz == null) {
            raiz = newNodo;
        } else {
            Nodo aux = raiz;
            Nodo padre;
            while (true) {
                padre = aux;
                if (d < aux.valor) {
                    aux = aux.hijoIzq;
                    if (aux == null) {
                        padre.hijoIzq = newNodo;
                        return;
                    }
                } else {
                    aux = aux.hijoDer;
                    if (aux == null) {
                        padre.hijoDer = newNodo;
                        return;
                    }
                }
            }
        }
    }

    
    
    public void PreOrden(Nodo n) {
        if (n == null) {
            return;
        } else {
            System.out.print(n.valor + " ");
            PreOrden(n.hijoIzq);
            PreOrden(n.hijoDer);
        }
    }

    
    
    public void Inorden(Nodo n) {
        if (n == null) {
            return;
        } else {
            Inorden(n.hijoIzq);

            System.out.print(n.valor + " ");

            Inorden(n.hijoDer);
        }
    }

    
    
    public void PostOrden(Nodo n) {
        if (n == null) {
            return;
        } else {
            PreOrden(n.hijoIzq);
            PreOrden(n.hijoDer);
            System.out.print(n.valor + " ");
        }
    }

    
    
    public void eliminarNodo(int d) {
        if (raiz == null) {
            System.out.println("------No hay valores en el árbol------");
        } else {
            Nodo aux = raiz;
            Nodo padre = raiz;
            boolean esHijoIzq = true;
            while (d != aux.valor) {
                padre = aux;
                if (d < aux.valor) {
                    esHijoIzq = true;
                    aux = aux.hijoIzq;

                } else {
                    esHijoIzq = false;
                    aux = aux.hijoDer;
                }
                if (aux == null) {
                    System.out.printf("\n------El nodo con valor %d no existe en el árbol-------\n", d);
                    return;
                }
            }

            if (aux.hijoIzq == null && aux.hijoDer == null) {
                if (aux == raiz) {
                    raiz = null;
                } else {
                    if (esHijoIzq) {
                        padre.hijoIzq = null;
                    } else {
                        padre.hijoDer = null;
                    }
                }
            } else {
                if (aux.hijoDer == null) {
                    if (aux == raiz) {
                        raiz = aux.hijoIzq;
                    } else {
                        if (esHijoIzq) {
                            padre.hijoIzq = aux.hijoIzq;
                        } else {
                            padre.hijoDer = aux.hijoIzq;
                        }
                    }
                } else {
                    if (aux.hijoIzq == null) {
                        if (aux == raiz) {
                            raiz = aux.hijoIzq;
                        } else {
                            if (esHijoIzq) {
                                padre.hijoIzq = aux.hijoDer;
                            } else {
                                padre.hijoDer = aux.hijoDer;
                            }
                        }
                    } else {
                        Nodo reemplazo = NodoReemplazo(aux);
                        if (aux == raiz) {
                            raiz = reemplazo;
                        } else {
                            if (esHijoIzq) {
                                padre.hijoIzq = reemplazo;
                            } else {
                                padre.hijoDer = reemplazo;
                            }
                        }
                        reemplazo.hijoIzq = aux.hijoIzq;
                    }
                    return;
                }
            }
        }
    }

    
    
    public Nodo NodoReemplazo(Nodo actual) {
        Nodo reemplazoPadre = actual;
        Nodo reemplazo = actual;
        Nodo aux = actual.hijoDer;
        
        
        while (aux != null) {
            reemplazoPadre = reemplazo;
            reemplazo = aux;
            aux = aux.hijoIzq;
        }
        if (reemplazo != actual.hijoDer) {
            reemplazoPadre.hijoIzq = reemplazo.hijoDer;
            reemplazo.hijoDer = actual.hijoDer;
        }
        System.out.println("\nEl nodo Reemplazo es: " + reemplazo.valor);
        return reemplazo;
    }

    
    
}
