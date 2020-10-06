/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.cv.arraylist;

/**
 *
 * @author Alexis Javier Roman
 */
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int existencia;

    public Producto(String nombre, String id, double precio, int existencia) {
        this.nombre = nombre;
        this.id=id;
        this.precio = precio;
        this.existencia=existencia;
    }

    public Producto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    
    public void ActualizarExistencia(int u){
        setExistencia(getExistencia()-u);
    }
    
        @Override
    public String toString(){
        return "ID: " + id + " Producto: " + nombre + " Precio: " + precio + " Unidades en inventario: " + existencia ;
        
    }
}
