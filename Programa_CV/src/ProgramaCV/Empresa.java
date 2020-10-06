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
public class Empresa {
    private String Nombre;
    private final Cproducto Catalogo;
    private final Venta Ventas[];
    private int i=0;

    public Empresa(String Nombre) {
        this.Nombre = Nombre;
        Catalogo = new Cproducto();
        Ventas = new Venta[100];
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void AgregarProducto(){
        Producto p = new Producto();
        System.out.println("Introduce el nombre del producto: ");
        p.setNombre(Leer.datoString());
        System.out.println("ID: ");
        p.setId(Leer.datoString());
        System.out.println("Precio: ");
        p.setPrecio(Leer.datoInt());
        System.out.println("Existencia: ");
        p.setExistencia(Leer.datoInt());
        Catalogo.AñadirProducto(p);
    }
    
    public void MostrarCatalogo(){
        System.out.println(">>>>Inventario<<<<");
        Catalogo.MostrarProductos();
    }
    
    public Producto BuscarProducto(){
        return Catalogo.Buscar(Leer.datoString());
    }
    
    public void RealizarVenta(){
        String opcion;
        Producto p;
        int u;
        Venta venta = new Venta();
        System.out.println("Fecha de la venta: ");
        venta.setFecha(Leer.datoString());
        System.out.println("Folio: ");
        venta.setNo_Venta(Leer.datoInt());
        System.out.println("Introduzca ID de los productos para agregar: ");
        do{
            System.out.println("ID: ");
            p = BuscarProducto();
            if (p.getId()!= null)
            {
                System.out.println("Unidades: ");
                u=Leer.datoInt();
                if (u<=p.getExistencia()){
                    venta.AgregarProducto(p, u);
                    venta.setTotal(venta.getTotal()+p.getPrecio()*u);
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
        Ventas[getI()]=venta;
        setI(getI()+1);
        System.out.println("Venta Realizada");
        System.out.println("Total a pagar: " + venta.getTotal());      
    }
    
    public Venta[] ObtenerVentas(){
        return Ventas;
    }
    
    public void MostrarVentas(){
        System.out.println(">>>>>Datos de las ventas<<<<<");
        for (int c=0; c<getI(); ++c){
            System.out.println("Numero de venta: " + c + " Fecha: " + Ventas[c].getFecha() + " Folio: " + Ventas[c].getNo_Venta());
            System.out.println("Productos: ");
            for (int j =0; j<ObtenerVentas()[c].getI(); j++){
                System.out.println("ID " + ObtenerVentas()[c].getProducto()[j].getId() + "--- Nombre " + ObtenerVentas()[c].getProducto()[j].getNombre() + "--- Unidades " +  ObtenerVentas()[c].getCantidad()[j]);
            }
            System.out.println("Total: " + Ventas[c].getTotal());
        }
    }
    
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    

}
