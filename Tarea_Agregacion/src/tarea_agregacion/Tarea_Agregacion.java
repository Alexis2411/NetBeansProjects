/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_agregacion;

/**
 *
 * @author Alexis Javier Roman
 */
public class Tarea_Agregacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RutaAutobus RutaAutobus  = new RutaAutobus(10, "Jose Diaz");
        
        RutaAutobus.AñadirPasajero(new Pasajero("Juan Perez", 10));
        RutaAutobus.AñadirPasajero(new Pasajero("Hernan Lopez", 8));
        
        RutaAutobus.MostrarPasajeros();
    }
    
}
