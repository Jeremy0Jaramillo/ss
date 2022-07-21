/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArbolBinario ab = new ArbolBinario();
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int num;

        do {

            System.out.println("Ingrese una opción:\n"
                    + "'1' Para ingresar nuevo nodo\n"
                    + "'2' Para eliminar un nodo\n"
                    + "'3' Para imprimir arbol en Preorden\n"
                    + "'4' Para imprimir arbol en Inorden\n"
                    + "'5' Para imprimir arbol en Postorden\n"
                    + "'6' Para salir del programa");

            num = entrada.nextInt();
            boolean bandera = true;

            switch (num) {

                case 1:
                    System.out.println("Ingrese el valor del nodo a ingresar: ");
                    int valor = entrada.nextInt();
                    entrada.nextLine();
                    ab.insertarNodo(valor);
                    break;

                case 2:
                    System.out.println("Ingrese el valor del nodo a eliminar: ");
                    int dato = entrada.nextInt();
                    ab.eliminarNodo(dato);
                    break;

                case 3:
                    System.out.println("----------------PreOrden----------------");
                    ab.PreOrden(ab.raiz);
                    System.out.println("\n-----------------------------------------");
                    break;
                    
                case 4:
                    System.out.println("----------------InOrden----------------");
                    ab.Inorden(ab.raiz);
                    System.out.println("\n----------------------------------------");
                    break;
                    
                case 5:
                    System.out.println("----------------PostOrden----------------");
                    ab.PostOrden(ab.raiz);
                    System.out.println("\n-------------------------------------------");
                    break;

                case 6:
                    System.out.println("|----------Fin de Programa---------|");
                    break;

                default:
                    System.err.println("Opcion fuera de límites");
                    break;
            }

        } while (num != 6);

    }

}
