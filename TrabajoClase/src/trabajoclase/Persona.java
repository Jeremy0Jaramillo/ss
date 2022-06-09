/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoclase;

/**
 *
 * @author SALA A
 */
public class Persona {
    private String nombre;
    private int edad;
    private int codigo;
    private Persona siguiente;

    Persona(String n, int m, int c) {
        nombre = n;
        edad = m;
        codigo = c;
        siguiente = null;
    }
    
    public String obtenerNombre (){
        return nombre;
    }
    
    public void cambiarDatos (String n, int m, int c){
        nombre = n;
        edad = m;
        codigo = c;
    }
    
    public void concatenarPersona (Persona n){
        siguiente = n;
    }
    
    public void mostrarDatos (){
        System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Codigo: " + codigo + "\n");
    }
    
    @Override
    public String toString(){
        String valor = String.format("%s %s\n"
                , nombre, 
                 edad);
        return valor;
    }
}
