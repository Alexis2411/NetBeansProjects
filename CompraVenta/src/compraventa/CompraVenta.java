
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
public class CompraVenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empresa empresa= new Empresa("Comercializadora Patito.com");
        String opcion;
        System.out.println("<<<<< Añadir Productos al Catalogo. >>>>>");
        do
        {
            empresa.agregarProductoCtg();
            System.out.println("¿Desea añadir un nuevo producto al catalogo[Ss/Nn]: ");
            opcion = Leer.datoString();     
        }
        while (opcion.toUpperCase().equals("S"));
        System.out.println("<<<<< Realizar Ventas. >>>>>");
        do
        {
            empresa.agregarVenta();
            System.out.println("¿Desea añadir una nueva venta[Ss/Nn]: ");
            opcion = Leer.datoString();     
        }
        while (opcion.toUpperCase().equals("S"));
        
       
        empresa.mostrarVentas();
    }
    
}
