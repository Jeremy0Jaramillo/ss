/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos.practica;

    import java.io.File;
    import java.io.FileReader;
    import java.io.FileWriter;
    import java.io.FileInputStream;
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.util.Scanner;
/**
 *
 * @author SALA A
 */
public class practica {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        
        try {File f = new File("C:\\Users\\SALA A\\Desktop\\práctica1.txt");
            
        if (f.createNewFile()){
            System.out.println("Archivo creado: " + f.getName());
        }else{
            System.out.println("El archivo ya existe");
        }
        } catch (IOException e){
            System.out.println("Error.");
        }
    
        try ( FileWriter escritor = new FileWriter("C:\\Users\\SALA A\\Desktop\\práctica1.txt",true)) {
            
                System.out.println("\nResponda las siguientes cinco preguntas\n");
                System.out.println("Ingrese su nombre:");
                
                String respuesta = entry.nextLine();
                escritor.write(respuesta+"\n");
                
                System.out.println("Ingrese su edad:");
                String respuesta2 = entry.nextLine();
                escritor.write(respuesta2+"\n");
                
                System.out.println("Ingrese su hobby:");
                String respuesta3 = entry.nextLine();
                escritor.write(respuesta3+"\n");
                
                System.out.println("Ingrese su nivel académico:");
                String respuesta4 = entry.nextLine();
                escritor.write(respuesta4+"\n");
                
                System.out.println("Ingrese su ciudad:");
                String respuesta5 = entry.nextLine();
                escritor.write(respuesta5+"\n");
                
                escritor.close();
                
            System.out.println("El archivo ha sido escrito.");
        } catch (IOException e) {
            System.out.println("Error de escritura.");
            //e.printStackTrace();
        }
        
        try ( FileReader cuandolees = new FileReader("C:\\Users\\SALA A\\"
                + "Desktop\\práctica1.txt")) {
            int i;
            while ((i = cuandolees.read()) != -1) {
                System.out.print("La longitud del archivo es: "+i);
            }
        } catch (IOException e) {
            System.out.println("Error de lectura");

        }
        }
    }
                

        

