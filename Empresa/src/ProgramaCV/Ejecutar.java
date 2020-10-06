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
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tienda");
        String opcion;
        
        System.out.println(">>>>>>Añadir productos al catalogo<<<<<");
        do{
            empresa.AgregarProducto();
            System.out.println("¿Desea agregar mas productos? [Ss/Nn]");
            opcion=Leer.datoString();
        }
        while (opcion.toUpperCase().equals("S"));
        System.out.println(">>>>>Realizando ventas<<<<< ");
        do{
        empresa.RelizarVenta();
            System.out.println("¿Desea realizar otra venta? [Ss/Nn]");
            opcion=Leer.datoString();
        }
        while (opcion.toUpperCase().equals("S"));
        
        empresa.MostrarVentas();
        empresa.MostrarCatalogo();
    }
}
