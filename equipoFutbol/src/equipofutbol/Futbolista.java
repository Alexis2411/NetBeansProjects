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
public class Futbolista extends SeleccionFutbol {
    //Atributos
    private int dorsal;
    private String demarcacion;
    
    //Constructores
    public Futbolista(int dorsal, String demarcacion, int id, String Nombre, String Apellidos, int Edad) {
        super(id, Nombre, Apellidos, Edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolista() {
        super();
    }
    
    //Get y Set
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    //Metodos
    public void jugarPartido(){
        System.out.println("Jugar partido");
    }
    
    public void entrenar(){
        System.out.println("Entrenar");
    }
    
    
}
