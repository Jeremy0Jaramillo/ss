/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacenamientoejemeplo;

/**
 *
 * @author SALA H
 */
public class Persona {

    private String nombre;
    private int edad;

    Persona(String n, int m) {
        nombre = n;
        edad = m;
    }
    
    public void cambiarDatos (String n, int m){
        nombre = n;
        edad = m;
    }
    
    public void mostrarDatos (){
        System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad + "\n");
    }
    
    @Override
    public String toString(){
        String valor = String.format("%s %s\n"
                , nombre, 
                 edad);
        return valor;
    }
}
