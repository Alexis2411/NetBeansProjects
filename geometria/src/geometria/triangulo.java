/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author Alexis Javier Roman
 */
public class triangulo extends figura {

    public triangulo(double base, double altura) {
        super(base, altura);
    }
    
    public triangulo(){
        super();
    }
    
    public void obtenerArea(){
        double aux = (base*altura/2);
        setArea(aux);
    }   
}
