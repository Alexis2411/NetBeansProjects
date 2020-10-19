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
public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int añosExperiencia;

    public Masajista(String titulacion, int añosExperiencia, int id, String Nombre, String Apellidos, int Edad) {
        super(id, Nombre, Apellidos, Edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public Masajista() {
        super();
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String Entrenamiento() {
        return "Da asistencia en el entrenamiento(Clase Masajista)"; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String PartidoFutbol(){
        return "Da asistencia en el entrenamiento(Clase Masajista)";
    }
    
    public String DarMasaje(){
        return "Da un masaje";
    }
    
    
}
