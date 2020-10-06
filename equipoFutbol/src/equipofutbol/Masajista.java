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
public class Masajista extends SeleccionFutbol {
    //Atributos
    private String Titulacion;
    private int añosExperiencia;
    
    //Constructores

    public Masajista(String Titulacion, int añosExperiencia, int id, String Nombre, String Apellidos, int Edad) {
        super(id, Nombre, Apellidos, Edad);
        this.Titulacion = Titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public Masajista() {
        super();
    }
    
    //Metodos
    
    public void darMasaje(){
        System.out.println("Dar masaje");
    }
    
}
