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
public class Entrenador extends SeleccionFutbol {
    private int idFederacion;

    public Entrenador() {
        super();
    }

    public Entrenador(int idFederacion, int id, String Nombre, String Apellidos, int Edad) {
        super(id, Nombre, Apellidos, Edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String Entrenamiento() {
        return "Dirige un entrenamiento (Clase Entrenador)"; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String PartidoFutbol(){
        return "Dirige un partido (Clase Entrenador)";
    }
    
    public String PlanificarEntrenamiento(){
        return "Planifica un entrenamiento";
    }
}
