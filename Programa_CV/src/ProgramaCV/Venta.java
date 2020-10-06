/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramaCV;

/**
 *
 * @author Alexis Javier Roman
 */
public class Venta {
    private final Producto[] producto;
    private final int[] cantidad;
    private int total;
    private int No_Venta;
    private String fecha;
    private int i;
    
    public Venta(){
        producto = new Producto[100];
        cantidad = new int[100];
    }
    
    public Venta(int No_Venta, String fecha, int total) {
        this.No_Venta = No_Venta;
        this.fecha=fecha;
        this.total=total;
        producto = new Producto[100];
        cantidad = new int[100];
    }

    public int getNo_Venta() {
        return No_Venta;
    }

    public void setNo_Venta(int No_Venta) {
        this.No_Venta = No_Venta;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public Producto[] getProducto() {
        return producto;
    }
    

    public int[] getCantidad() {
        return cantidad;
    }
    
    
    public void AgregarProducto(Producto producto, int cantidad){
        this.producto[getI()] = producto;
        this.cantidad[getI()] = cantidad;
        setI(getI()+1);
        producto.ActualizarExistencia(cantidad);  
    }
   
    public int getI() {
        return i;
    }

    private void setI(int i) {
        this.i = i;
    }
    
}
