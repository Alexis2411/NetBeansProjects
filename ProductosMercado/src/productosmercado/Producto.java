/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productosmercado;

/**
 *
 * @author alexis
 */
public class Producto {
    private int unidades;
    private double precio;

    public Producto(int unidades, double precio) {
        this.unidades = unidades;
        this.precio = precio;
    }
    public Producto(){
        
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double precioFinal(){
        return precio*unidades;
    }
    
}
