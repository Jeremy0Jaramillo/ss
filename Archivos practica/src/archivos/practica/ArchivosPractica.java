/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivos.practica;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author SALA A
 */
public class ArchivosPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try ( FileWriter escritor = new FileWriter("C:\\Users\\SALA A\\Desktop"
                + "\\yocuando")) {
            escritor.write("Ejemplo de escritura en archivo usando Write");
            escritor.close();
            System.out.println("El archivo ha sido escrito.");
        } catch (IOException e) {
            System.out.println("Error de escritura.");

        }
        try ( FileReader cuandolees = new FileReader("C:\\Users\\SALA A\\"
                + "Desktop\\yocuando")) {
            int i;
            while ((i = cuandolees.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error de lectura");

        }

        try  (FileOutputStream fis = new FileOutputStream("C:\\Users\\SALA A\\"
                    + "Desktop\\yocuando")){

            String datos = "Esto es un ejemplo de Stream con bytes";
            byte b[] = datos.getBytes();
            fis.write(b);
            fis.close();
            System.out.println("\nSe ha escrito en el archivo");

        } catch (IOException e) {

            System.out.println("Error de escritura");
        }

        try {

            FileInputStream ola = new FileInputStream("C:\\Users\\SALA A"
                    + "\\Desktop\\yocuando");
            int i;
            while ((i = ola.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
}
