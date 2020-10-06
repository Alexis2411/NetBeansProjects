/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona_fecha_composicion;

/**
 *
 * @author Alexis Javier Roman
 */
public class Persona {
    //Atributos
    private String nombre;
    private String direccion;
    private int cp;
    private String ciudad;
    private Fecha fecha;
    
    //Metodos
    public Persona(String nombre, String direccion, int cp, String ciudad){
        this.nombre=nombre;
        this.direccion=direccion;
        this.cp=cp;
        this.ciudad=ciudad;
        fecha = new Fecha();
    }

    public Persona() {
        fecha = new Fecha();
    
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setCp(int cp){
        this.cp=cp;
    }
    
    public int getCp (){
        return cp;
    }
    
    public void setCiudad(String ciudad){
        this.ciudad=ciudad;
    }
    
    public String getCiudad(){
        return ciudad;
    }
    
    public void setFecha(int d, int m, int a){
        fecha.setDia(d);
        fecha.setMes(m);
        fecha.setAño(a);
    }
    
    public Fecha getFecha(){
        return fecha;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ");
        sb.append(nombre);
        sb.append("\nFecha de Nacimiento: ");
        sb.append(fecha.getDia()+ "/" + fecha.getMes() + "/" + fecha.getAño());
        sb.append("\nDireccion: ");
        sb.append(direccion);
        sb.append("\n");
        sb.append(cp);
        sb.append("\n");
        sb.append(ciudad);
        sb.append("\n");
        return sb.toString();
    }
}
