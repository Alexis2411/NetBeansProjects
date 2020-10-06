/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipofutbol;

/**
 *
 * @author Alexis Javier Roman
 */
public class Entrenador extends SeleccionFutbol {
    //ATRIBUTOS
    private String idFederacion;
    
    //CONSTRUCTORES
    public Entrenador(String idFederacion, int id, String Nombre, String Apellidos, int Edad) {
        super(id, Nombre, Apellidos, Edad);
        this.idFederacion = idFederacion;
    }

    public Entrenador() {
        super();
    }
    
    //GET Y SET

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    //METODOS
    public void dirigirPartido(){
        System.out.println("Dirigir partido");
    }
    
    public void dirigirEntrenamiento(){
        System.out.println("Dirigir entrenamiento");
    }
     
}
