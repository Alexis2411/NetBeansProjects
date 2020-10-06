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
public class figura {
    protected double base;
    protected double altura;
    protected double area;

    public figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public figura() {
        super();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public void calcularArea (){
        System.out.println("\n El area del "+ this.getClass().getSimpleName()+ " es de: "+ getArea());
    }
    
}
