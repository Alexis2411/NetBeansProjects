/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.cv.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alexis Javier Roman
 */
public class Ventas {
    private final ArrayList<Producto> productos;
    private ArrayList<Integer> cantidad;
    private double total=0;
    private int no_Venta;
    private String fecha;
    
    public Ventas(){
        productos = new ArrayList<Producto>();
        cantidad = new ArrayList<Integer>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Integer> getCantidad() {
        return cantidad;
    }

    public void setCantidad(ArrayList<Integer> cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getNo_Venta() {
        return no_Venta;
    }

    public void setNo_Venta(int no_Venta) {
        this.no_Venta = no_Venta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public void AgregarProducto(Producto producto, int u){
        productos.add(producto);
        cantidad.add(u);
        producto.ActualizarExistencia(u);
    }
    
    public void DatosVenta(){
        Iterator<Producto> nproductos = productos.iterator();
        Iterator<Integer> ncantidad = cantidad.iterator();
        System.out.println("Datos Venta");
        System.out.println("Fecha: " + fecha + " No. de Venta: " + no_Venta);
        while(nproductos.hasNext()){
            System.out.println(nproductos.next() + " Unidades Vendidas: " + ncantidad.next());
        }
        System.out.println("Total: " + getTotal());
    }
    
    public void CalcularTotal(double p, int u){
        setTotal(getTotal()+ p*u);
    }
    
}
    

    

