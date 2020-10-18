/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaselccionfutbol;

/**
 *
 * @author Alexis Javier Roman
 */
public abstract class SeleccionFutbol {
    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected int Edad;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, String Nombre, String Apellidos, int Edad) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    public String Viajar(){
        return "Viaja (Clase Padre)";
    }
    
    public String Concentrarse(){
        return "Se concentra (Clase Padre)";
    }
    
    public abstract String Entrenamiento();
    
    public String PartidoFutbol(){
        return "Asiste al partido de Futbol (Clase Padre)";
    }
}
