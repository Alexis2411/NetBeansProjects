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
public class rectangulo extends figura{

    public rectangulo() {
        super();
    }

    public rectangulo(double base, double altura) {
        super(base, altura);
    }
    
    public void obtenerArea(){
        double aux = base*altura;
        setArea(aux);
    }   
}
