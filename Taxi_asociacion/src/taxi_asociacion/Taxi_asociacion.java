/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxi_asociacion;

/**
 *
 * @author Alexis Javier Roman
 */
public class Taxi_asociacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chofer chofer = new Chofer("Juan");
        Taxi taxi = new Taxi(chofer, "241100215");
        System.out.println(taxi);
    }    
}
