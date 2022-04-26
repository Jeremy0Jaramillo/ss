/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Ingrese el valor del cual desea calcular el factorial:");
        int valor = entry.nextInt();

        int ola = Factorial(valor);
        System.out.printf("\nEl factorial de %d es: %d\n", valor, ola);
    }

    public static int Factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * Factorial(n - 1));
        }
    }
}
