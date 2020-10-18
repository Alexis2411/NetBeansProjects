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
public class Romboide extends Figura {

    public Romboide(double base, double altura) {
        super(base, altura);
    }
    
    @Override
    public double calcularArea() {
        area=base*altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro= base*2+altura*1.5;
        return perimetro;
    }
    
}
