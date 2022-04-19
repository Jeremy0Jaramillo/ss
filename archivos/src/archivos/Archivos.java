/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivos;

import java.io.File;
import java.io.IOException;
/**
 *
 * @author SALA H
 */
public class Archivos {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        File f = new File("C:\\Users\\SALA A\\Desktop\\yocuando.txt");
        
        if (f.createNewFile()){
            System.out.println("Archivo crade: " + f.getName());
        }else{
            System.out.println("El archivo ya existe");
        }
        } catch (IOException e){
            System.out.println("Error.");
        }
    }
    
}
