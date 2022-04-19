/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author SALA H
 */
public class ReaderW {

    public static void main(String[] args) {
        try ( FileWriter escritor = new FileWriter("C:\\Users\\SALA A\\Desktop\\yocuando.txt")) {
            escritor.write("Ejemplo de escritura en archivo usando Write"
                    + "\n yo cuando");
            escritor.close();
            System.out.println("El archivo ha sido escrito.");
        } catch (IOException e) {
            System.out.println("Error de escritura.");
            //e.printStackTrace();
        }

        System.out.println("Leemos el archivo: ");
        try (FileReader cuandolees = new FileReader("C:\\Users\\SALA A\\Desktop\\yocuando.txt")) {
            int i;
            while ((i = cuandolees.read()) != -1) {
                   System.out.print((char)i);
            }
        }catch (IOException e){
            System.out.println("Error de lectura");
            //e.printStackTrace();
        }
    }

}
