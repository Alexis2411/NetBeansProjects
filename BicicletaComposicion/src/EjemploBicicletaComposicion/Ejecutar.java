/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBicicletaComposicion;

/**
 *
 * @author ProDep-1
 */
public class Ejecutar {
    public static void main(String args[]){
    
    Bicicleta bicicleta1=new Bicicleta("Delantera_1","Trasera_1");
    Bicicleta bicicleta2=new Bicicleta("Delantera_2","Trasera_2");
    
    System.out.println("Biceicleta 1 (Rueda Delantera): " + bicicleta1.getRuedas().get(0).getNombre());
    System.out.println("Biceicleta 1 (Rueda Trasera): " + bicicleta1.getRuedas().get(1).getNombre());
    System.out.println("Biceicleta 2 (Rueda Delantera): " + bicicleta2.getRuedas().get(0).getNombre());
    System.out.println("Biceicleta 2 (Rueda Trasera:) " + bicicleta2.getRuedas().get(1).getNombre());
       
    System.out.println("Cambio de rueda delantera bicicleta 1 !!!!!! ");
    bicicleta1.cambiarRueda(0, "Cambio rueda delantera para Bicicleta 1");
    System.out.println("Bicicleta 1 Rueda Delantera (cambiada): " + bicicleta1.getRuedas().get(0).getNombre());
    System.out.println("Bicicleta 1 Rueda Trasera: " + bicicleta1.getRuedas().get(1).getNombre());
    
    System.out.println("Cambio de rueda delantera bicicleta 2 !!!!!! ");
    bicicleta2.cambiarRueda(1, "Cambio rueda trasera para Bicicleta 2");
    System.out.println("Bicicleta 2 Rueda Delantera: " + bicicleta2.getRuedas().get(0).getNombre());
    System.out.println("Bicicleta 2 Rueda Trasera (Cambiada): " + bicicleta2.getRuedas().get(1).getNombre());
    }
}
