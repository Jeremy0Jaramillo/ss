/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilavaciapilallena;


import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class PilaVaciaPilaLlena {
    
    int [] PILA;
    int TOPE;
    int MAX;
    
    Scanner entry = new Scanner(System.in);

    
    
    
    public PilaVaciaPilaLlena (int MAX){
        
        this.TOPE = -1;
        this.MAX = MAX;
        this.PILA= new int[this.MAX];
    }
    
    public int GetTOPE(){
        return TOPE;
    }
    
    public void VaciarPila(){
        this.TOPE = -1;
    }
    
    
    
    public void EliminarPila(){
        if (this.PilaVacia()){
            System.out.println("Pila Vacía");
        }else{
            int ITEM = this.PILA[this.TOPE];
            this.TOPE--;
            System.out.println("El item "+ITEM+" se ha eliminado.");
        }
    }
    
    public void InsertarPila(){
        if(this.PilaLlena()){       
            System.out.println("");
        }else{
            int ITEM;
            System.out.println("Ingrese item a insertar");
            ITEM = entry.nextInt();
            this.TOPE++;
            this.PILA[this.TOPE] = ITEM;
            System.out.println("El item " + ITEM +" se ha insertado.");
        }
    }
    
    public boolean PilaVacia(){
            if(this.TOPE ==-1){
                return true;
            }else{
                return false;
            }
        }
    
    public boolean PilaLlena(){
        if (this.MAX-1 == this.TOPE){
            return true;
        }else{
            return false;
        }
            
        }
    
    public void MostrarPila(){
        if(this.PilaVacia()){
            System.out.println("La pila está vacía\nno hay datos.");
        }else{
            int i;
            String MOSTRAR = "";
            for(i = 0; i <= this.TOPE;i++){
                MOSTRAR = MOSTRAR + this.PILA[i]+"\n";
            }
            System.out.println("Los datos de la pila son: \n" + MOSTRAR);
        }
    }
    
}
