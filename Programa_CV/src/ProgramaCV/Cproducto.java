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
public class Cproducto {
    //Atributos
    private Producto productos[];
    private int i=0;
    
    //Metodos

    public Cproducto() {
        productos = new Producto[100];
    }

    public void AñadirProducto(Producto p){
        productos[getI()] = p;
        setI(getI()+1);
    }
    
    public Producto Buscar(String ID){
        Producto aux = new Producto();
        for (int i=0; i < getI(); i++){
            if (ID.compareTo(productos[i].getId())==0){
                aux = productos[i];
                break;
            }
        }
        return aux;
    }
    
    public Producto[] ObtenerProductos(){
        return productos;
    }
    
    public void MostrarProductos(){
        for (int i=0; i<getI(); i++){
            System.out.println(" ID: " + ObtenerProductos()[i].getId()+ " Nombre: " + ObtenerProductos()[i].getNombre() +" Unidades: " + ObtenerProductos()[i].getExistencia() + " Precio: " + ObtenerProductos()[i].getPrecio());
        }
    }
    
    public int getI(){
        return i;
    }

    private void setI(int i) {
        this.i = i;
    }
    
    
}
