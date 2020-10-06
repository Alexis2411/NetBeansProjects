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
public class Jugador {
    //Atributos
    private String Nombre;
    private int Edad;
    private Equipo Equipo;
    private String Posicion;
    
    //Metodo Constructor
    
    public Jugador(){
        
    }
    
    public Jugador (String Nombre, int Edad, Equipo Equipo, String Posicion){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Equipo = Equipo;
        this.Posicion = Posicion;
    }
    
    //Metodos Get y Set
    
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setEdad(int Edad){
        this.Edad = Edad;
    }
    
    public int getEdad(){
        return Edad;
    }
    
    public void setEquipo(Equipo Equipo){
        this.Equipo = Equipo;
    }
    
    public Equipo getEquipo(){
        return Equipo;
    }
    
    public void setPosicion(String Posicion){
        this.Posicion = Posicion;
    }
    
    public String getPosicion(){
        return Posicion;
    }
    
     @Override
    public String toString() {
        return "Nombre del jugador: " + Nombre + "\nEdad: " + Edad + "\nEquipo: " + Equipo.getNombre() + "\nPosicion: " + Posicion ;
    }
}
