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
public class Empresa {
    private String nombre;
    private final Inventario catalogo;
    private final ArrayList<Ventas> ventas = new ArrayList<Ventas>();

    public Empresa(String nombre) {
        this.nombre = nombre;
        catalogo = new Inventario();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }
    
    public void AgregarProducto(){
        Producto p = new Producto();
        System.out.println("Introduce el nombre del producto: ");
        p.setNombre(Leer.datoString());
        System.out.println("ID: ");
        p.setId(Leer.datoString());
        System.out.println("Precio: ");
        p.setPrecio(Leer.datoDouble());
        System.out.println("Existencia: ");
        p.setExistencia(Leer.datoInt());
        catalogo.AñadirProducto(p);
    }
    
    public void MostrarCatalogo(){
        System.out.println("Inventario: ");
        catalogo.MostrarProductos();
    }
    
    public Producto BuscarProducto(){
        return catalogo.Buscar(Leer.datoString());
    }
    
    public void RealizarVenta(){
        String opcion;
        Producto p;
        int u;
        Ventas venta = new Ventas();
        System.out.println("Fecha de la venta: ");
        venta.setFecha(Leer.datoString());
        System.out.println("Folio: ");
        venta.setNo_Venta(Leer.datoInt());
        System.out.println("Introduzca ID de los productos para agregar: ");
        do{
            System.out.println("ID: ");
            p = BuscarProducto();
            if (p.getId()!= null){
                System.out.println("Unidades: ");
                u=Leer.datoInt();
                if (u<=p.getExistencia()){
                    venta.AgregarProducto(p, u);
                    venta.CalcularTotal(p.getPrecio(), u);
                }
                else{
                    System.out.println("No hay suficientes unidades");
                }
            }
            else{
                System.out.println("Producto no encontrado");
            }
        System.out.println ("Desea agregar mas productos [Ss/Nn]: ?");
        opcion=Leer.datoString();
        }
        while (opcion.toUpperCase().equals("S"));
        ventas.add(venta);
        System.out.println("Venta Realizada");
        System.out.println("Total a pagar: " + venta.getTotal()); 
    }
    
    public ArrayList<Ventas> getVentas(){
        return ventas;
    }
    
    public void MostrarVentas(){
        Iterator<Ventas> nventas = ventas.iterator();
        System.out.println("Ventas realizadas: ");
        while (nventas.hasNext()){
            nventas.next().DatosVenta();
        }
    }
}
