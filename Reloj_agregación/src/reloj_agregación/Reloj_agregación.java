/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj_agregación;

/**
 *
 * @author Alexis Javier Roman
 */
public class Reloj_agregación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hora hora = new Hora(10, 15, 55);
        Reloj reloj1 = new Reloj (hora, "digital");
        Reloj reloj2 = new Reloj (hora, "analogico");
        
        reloj1.Start();
        reloj2.Start();
        
    }
    
}
