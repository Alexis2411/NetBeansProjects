/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author Alexis Javier Roman
 */
public class Triangulo extends Figura {

    public Triangulo(double base, double altura) {
        super(base, altura);
    }
    
    @Override
    public double calcularArea(){
        area=base*altura/2;
        System.out.println("El area es ");
        return area;
    }
    
    @Override
    public double calcularPerimetro(){
        perimetro=base*3;
        return perimetro;
    }
}
