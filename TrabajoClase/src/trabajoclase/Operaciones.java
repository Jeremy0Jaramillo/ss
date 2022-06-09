/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoclase;

import java.util.Scanner;

/**
 *
 * @author SALA A
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        Persona p1 = ingresoDatos();
        Persona p2 = ingresoDatos();
        Persona p3 = ingresoDatos();

        p1.concatenarPersona(p2);
        p2.concatenarPersona(p3);

        System.out.println("Ingrese cual persona desea mostrar(Ingrese 1, 2 o 3):");
        int num = entry.nextInt();
        if (num == 1) {
            p1.mostrarDatos();
            System.out.println("\nSi desea modificar esta"
                    + " información ingrese '1'");
            num = entry.nextInt();
        } else {
            if (num == 2) {
                p2.mostrarDatos();
                System.out.println("\nSi desea modificar esta"
                        + " información ingrese '2'");
                num = entry.nextInt();
            } else {
                if (num == 3) {
                    p3.mostrarDatos();
                    System.out.println("\nSi desea modificar esta"
                            + " información ingrese '3'");
                    num = entry.nextInt();
                } else {
                    System.out.println("ERROR. Número fuera de límite");
                }
            }
        }

        if (num == 1) {
            System.out.println("Ingrese el nombre de la persona:");
            String nom = entry.nextLine();
            System.out.println("Ingrese la edad de la persona:");
            int ed = entry.nextInt();
            System.out.println("Ingrese el codigo de la persona:");
            int cod = entry.nextInt();
            p1 = new Persona(nom, ed, cod);
            p1.mostrarDatos();
        } else {
            if (num == 2) {
                System.out.println("Ingrese el nombre de la persona:");
                String nom = entry.nextLine();
                System.out.println("Ingrese la edad de la persona:");
                int ed = entry.nextInt();
                System.out.println("Ingrese el codigo de la persona:");
                int cod = entry.nextInt();
                p2 = new Persona(nom, ed, cod);
                p2.mostrarDatos();
            } else {
                if (num == 3) {
                    System.out.println("Ingrese el nombre de la persona:");
                    String nom = entry.nextLine();
                    System.out.println("Ingrese la edad de la persona:");
                    int ed = entry.nextInt();
                    System.out.println("Ingrese el codigo de la persona:");
                    int cod = entry.nextInt();
                    p3 = new Persona(nom, ed, cod);
                    p3.mostrarDatos();
                }
            }
        }
        
        if(p1.obtenerNombre().equals(p2.obtenerNombre())){
            System.out.println("El nombre de la primera persona y la "
                    + "segunda persona son iguales.");
        }else{
            if(p2.obtenerNombre().equals(p3.obtenerNombre())){
            System.out.println("El nombre de la segunda persona y la "
                    + "tercera persona son iguales.");
        }else{
                if(p1.obtenerNombre().equals(p3.obtenerNombre())){
            System.out.println("El nombre de la primera persona y la "
                    + "tercera persona son iguales.");
            }

    }
            }
        }
            

    public static Persona ingresoDatos() {
        Scanner entry = new Scanner(System.in);
        String nom;
        int ed;
        int cod;
        System.out.println("Ingrese la informacion de las 3 personas:\n");
        entry.nextLine();

        System.out.println("Ingrese el nombre de la persona:");
        nom = entry.nextLine();
        System.out.println("Ingrese la edad de la persona:");
        ed = entry.nextInt();
        System.out.println("Ingrese el codigo de la persona:");
        cod = entry.nextInt();
        Persona p = new Persona(nom, ed, cod);

        return p;
    }

}
