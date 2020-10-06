/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_asociacion;

/**
 *
 * @author Alexis Javier Roman
 */
public class Equipo {
    //Atributos
    private String Nombre;
    private String Ciudad;
    
    //Constructor
    public Equipo(){
        
    }
    
    public Equipo(String Nombre, String Ciudad){
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
    }
    
    //Metodos Get y Set
    
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setCiudad(String Ciudad){
        this.Ciudad=Ciudad;
    }
    
    public String getCiudad(){
        return Ciudad;
    }
}
