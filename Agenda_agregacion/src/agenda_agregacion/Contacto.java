/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_agregacion;

/**
 *
 * @author Alexis Javier Roman
 */
public class Contacto {
    //Atributos
    private String nombre;
    private String telefono;
    
    //Metodos
    public Contacto(String nombre, String telefono){
        this.nombre=nombre;
        this.telefono=telefono;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    
}
