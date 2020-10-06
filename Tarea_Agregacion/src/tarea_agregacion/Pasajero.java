/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_agregacion;

/**
 *
 * @author Alexis Javier Roman
 */
public class Pasajero {
    private String Nombre;
    private int Asiento;
    
    //Constructor
    public Pasajero(String Nombre, int Asiento){
        this.Nombre=Nombre;
        this.Asiento=Asiento;
    }
    
    public Pasajero(){
        
    }
    
    //Get y Set
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setAsiento(int Asiento){
        this.Asiento=Asiento;
    }
    
    public int getAsiento(){
        return Asiento;
    }
    
}
