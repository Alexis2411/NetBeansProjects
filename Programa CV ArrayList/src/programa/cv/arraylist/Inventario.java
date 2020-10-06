package programa.cv.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexis Javier Roman
 */
public class Inventario {
    private final ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<Producto>();
    }
    
    public void AñadirProducto(Producto p){
        productos.add(p);
    }
    
    public Producto Buscar (String ID){
        Producto aux = new Producto();
        Producto p;
        Iterator<Producto> nproductos = productos.iterator();
        while(nproductos.hasNext()){
            p = nproductos.next();
            if(ID.compareTo(p.getId())==0){
                aux = p;
                break;
            }   
        }
        return aux;
    }
    
    public ArrayList<Producto> ObtenerProducto(){
        return productos;
    }
    
    public void MostrarProductos(){
        Iterator<Producto> nproductos = productos.iterator();
        while(nproductos.hasNext()){
            System.out.println(nproductos.next());
        }
    }
}
