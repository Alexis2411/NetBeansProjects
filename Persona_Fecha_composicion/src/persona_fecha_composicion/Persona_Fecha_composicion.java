/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona_fecha_composicion;

/**
 *
 * @author Alexis Javier Roman
 */
public class Persona_Fecha_composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Alexis");
        persona.setDireccion("C. Hidalgo");
        persona.setCp(94546);
        persona.setCiudad("Cordoba");
        persona.setFecha(24, 11, 2000);
        
        System.out.println(persona);  
    }
}
