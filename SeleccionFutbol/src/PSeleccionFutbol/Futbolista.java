/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PSeleccionFutbol;

/**
 *
 * @author Alexis Javier Roman
 */
public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String demarcación;

    public Futbolista(int dorsal, String demarcación, int id, String Nombre, String Apellidos, int Edad) {
        super(id, Nombre, Apellidos, Edad);
        this.dorsal = dorsal;
        this.demarcación = demarcación;
    }

    public Futbolista() {
        super();
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcación() {
        return demarcación;
    }

    public void setDemarcación(String demarcación) {
        this.demarcación = demarcación;
    }
    
    @Override
    public String Entrenamiento() {
        return "Realiza un entrenamiento (Clase Futbolista)"; 
    }
    
    public String Entrevista(){
        return "Da una entrevista";
    }
    
    @Override
    public String PartidoFutbol(){
        return "Juega un partido (Clase Futbolista)";
    }
    
    
}
