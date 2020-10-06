/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBicicletaAgregacion;

/**
 *
 * @author ProDep-1
 */
public class Ejecutar {
    public static void main(String args[]){
    Rueda rueda1=new Rueda("Delantera");
    Rueda rueda2=new Rueda("Trasera");
    Rueda ruedaR=new Rueda("Rueda de cambio");
    Bicicleta bicicleta=new Bicicleta(rueda1,rueda2);
    
    System.out.println("Rueda Delantera: " + bicicleta.getRuedas().get(0).getNombre());
    System.out.println("Rueda Trasera: " + bicicleta.getRuedas().get(1).getNombre());
    
    System.out.println("Cambio de rueda trasera !!!!!! ");
    bicicleta.cambiarRueda(1, ruedaR);
    System.out.println("Rueda Delantera: " + bicicleta.getRuedas().get(0).getNombre());
    System.out.println("Rueda Trasera: " + bicicleta.getRuedas().get(1).getNombre());
    //Cuando se añade un elemento al arreglo se recorre la posicion, por eso es necesario
    //borrar el elemento de la poscion y luego añadir. Por eso se imprime posicion 2.
    //System.out.println("Rueda Trasera: " + bicicleta.getRuedas().get(2).getNombre());
    }
}
