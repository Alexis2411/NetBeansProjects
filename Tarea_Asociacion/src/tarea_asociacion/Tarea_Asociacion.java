/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_asociacion;

/**
 *
 * @author Alexis Javier Roman
 */
public class Tarea_Asociacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo Equipo = new Equipo("Atlas", "Guadalajara");
        Jugador Jugador = new Jugador("Jose Navarro", 25, Equipo, "Portero");
        System.out.println(Jugador);
    }
    
}
