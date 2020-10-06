/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compraventa;

/**
 *
 * @author ProDep-1
 */
public class Empresa {
    private String RazonSocial;
    private CProducto catProducto;
    private Venta aVenta[];
    private int i=0;
    
    
    public Empresa(String RazonSocial)
    {
        setRazonSocial(RazonSocial);
        catProducto=new CProducto();
        aVenta=new Venta[100];
    }
    
   
    
    public void setRazonSocial(String RazonSocial)
    {
        this.RazonSocial=RazonSocial;
    }
    
    public String getRazonSocial()
    {
        return RazonSocial;
    }
      
    public void agregarProductoCtg()
    {   
        Producto producto=new Producto();
        System.out.println("Intoduce el codigo del Producto: ");
        producto.setid_codigo(Leer.datoString());
        System.out.println("Descripción del Producto: ");
        producto.setdescripcion(Leer.datoString());
        System.out.println("Existencia del Producto: ");
        producto.setexistencia(Leer.datoInt());
        System.out.println("Precio del Producto: ");
        producto.setprecio(Leer.datoDouble());
        catProducto.Añadir(producto);                
    }
    
    public void mostrasrCatalogoProductos()
    {  ///No se ha probado
       for(int i=0;i<catProducto.getPosicion();i++)
       {
       System.out.println("Descripcion: " + catProducto.getCatalogoProducto()[i].getdescripcion());
       System.out.println("Descripcion: " + catProducto.getCatalogoProducto()[i].getdescripcion());  
       }
    }
    
    private Producto buscarProductoCtg()
    {         
        return catProducto.Buscar(Leer.datoString());        
    }
    
    public void agregarVenta()
    {   String opcion;
        Producto p;
        Venta venta=new Venta();
        System.out.println("Id Venta: ");
        venta.setid_venta(Leer.datoString());
        System.out.println("Fecha de la Venta: ");
        venta.setfecha(Leer.datoString());
        System.out.println("Intoduce los codigos de los productos de la venta: ");
        do
        {
            System.out.println("Introduce codigo: ");
            p=buscarProductoCtg();
            if(p.getid_codigo()!=null)
            {
            //venta.setproducto(buscarProductoCtg());
              venta.setproducto(p);
              System.out.println(" El producto se agraego a la venta.");              
            } else
                System.out.println("¡¡¡¡¡¡  No existe el producto en el catalogo. ");
            
            System.out.println("¿Desea añadir un nuevo producto a la venta[Ss/Nn]: ");
            opcion = Leer.datoString();     
        }
        while (opcion.toUpperCase().equals("S"));
        
        aVenta[getPosicion()]=venta;
        setPosicion(getPosicion() + 1);
        System.out.println("Venta exitosa !!!!!!");
    }
       
    public Venta[] obtenerVentas()
    {
        return aVenta;
    }
    
    public void mostrarVentas()
    {
        System.out.println("!!!!!!!Datos de las ventas:!!!!!!!");
        for(int i=0;i<getPosicion();i++)
        {
          System.out.println("Venta " + (i+1) + "--> Id Venta:" + obtenerVentas()[i].getid_venta() + " Fecha: " + obtenerVentas()[i].getfecha());
          System.out.println("Productos de la venta:");
          for(int j=0;j<obtenerVentas()[i].getPos();j++) 
          {    
            System.out.print("Producto " + (j+1) + ":");
            System.out.println(obtenerVentas()[i].getproducto()[j].getid_codigo() + "-->" + obtenerVentas()[i].getproducto()[j].getdescripcion());
          }
        }
    }
    
    
    private void setPosicion(int i)
    {
        this.i = i;
    }
    
    private int getPosicion()
    {
        return i;
    }
}
