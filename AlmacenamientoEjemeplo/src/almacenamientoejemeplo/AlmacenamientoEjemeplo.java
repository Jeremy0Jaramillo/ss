/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almacenamientoejemeplo;

/**
 *
 * @author SALA H
 */
public class AlmacenamientoEjemeplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona personaA = new Persona("Juan", 25);
        System.out.println("PersonaA: " + personaA);
        Persona personaB = new Persona("Ana", 22);
        System.out.println("PersonaB: " + personaB);
        Persona personaC = new Persona("Kevin", 22);
        System.out.println("PersonaC: " + personaC);
        
        personaC = personaA;
        System.out.println("PersonaC: " + personaC);
        
        personaA.cambiarDatos("Carlos", 30);
        personaA.mostrarDatos();
        
    }

}
