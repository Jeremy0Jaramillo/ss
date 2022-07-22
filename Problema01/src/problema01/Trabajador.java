/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author SALA I
 */
public class Trabajador {
    String cedula;
    String nombres;
    String correo;
    double sueldo;
    double mesSueldo;
    
    public void establecerCedula(String n){
        cedula = n;
    }
    
    public void establecerNombres(String n){
        nombres = n;
    }
    
    public void establecerCorreo(String n){
        correo = n;
    }
    
    public void establecerSueldo(double n){
        sueldo = n;
    }
    
    public void establecerMesSueldo(double n){
        mesSueldo = n;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
    public String obtenerNombres(){
        return nombres;
    }
    
    public String obtenerCorreo(){
        return correo;
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
    
    public double obtenerMesSueldo(){
        return mesSueldo;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Cédula: %s\n"
                + "Nombre: %s\n"
                + "Correo; %s\n"
                + "Sueldo: %.2f\n"
                + "Sueldo mes: %.2f\n",
                cedula,
                nombres,
                correo,
                sueldo,
                mesSueldo);
        
        return cadena;
    }
    
}
