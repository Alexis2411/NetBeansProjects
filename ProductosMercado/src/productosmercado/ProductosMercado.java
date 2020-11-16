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
public class ProductosMercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaEnlazada<Producto> productos = new ListaEnlazada<>();
        
        int cantidad;
        double precio;
        double precioTotal=0;
        String imprimir="************ Unidades***Precio***Total\n";
        int numeroProductos = (int)(Math.random()*(10)+1);

        for (int i=0; i<numeroProductos; i++){
            cantidad=(int) (Math.random()*(10)+1);
            precio=Math.rint(Math.random()*50)/2;
            productos.insertar_frente(new Producto(cantidad, precio));
        }
        
        Producto productoActual=new Producto();
        
        //Recorremos la lista
        for(int i=0; i<productos.getTamaño(); i++){
            productoActual=productos.devolverDato(i);
            precioTotal+=productoActual.precioFinal();
            imprimir+="Producto"+(i+1)+"\t"+productoActual.getUnidades()+
                    "\t"+productoActual.getPrecio()+
                    "\t"+productoActual.precioFinal()+"\n";
            
        }
        
        imprimir+="Precio final\t\t\t"+precioTotal;
        
        System.out.println(imprimir);
        
    
    }
  
}
