/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_agregacion;

/**
 *
 * @author Alexis Javier Roman
 */
public class Agenda_agregacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda miAgenda= new Agenda(2019);
        miAgenda.añadirContacto(new Contacto("Pedro Guzman Robles","2711796406"));
        miAgenda.añadirContacto(new Contacto("Erick Torres Perez","2711204499"));
        miAgenda.añadirContacto(new Contacto("Carlos Perez Diaz","2711801194"));
        miAgenda.verAgenda();
    }
    
}
