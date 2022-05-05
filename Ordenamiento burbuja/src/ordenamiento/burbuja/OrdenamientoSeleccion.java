/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento.burbuja;

import java.util.Arrays;

/**
 *
 * @author SALA A
 */
public class OrdenamientoSeleccion {

    public static void main(String[] args) {
        int aux;
        int k;
        int[] a = {8, 3, 7, 2, 4};
        for (int i = 0; i < a.length - 1; i++) {
            k = i;
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }

            if (k != i) {

                aux = a[k];
                a[k] = a[i];
                a[i] = aux;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
