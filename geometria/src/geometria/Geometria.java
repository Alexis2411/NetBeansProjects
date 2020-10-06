/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package geometria;

import java.util.ArrayList;

/**
*
* @author Alexis Javier Roman
*/
public class Geometria {

public static ArrayList<figura> figuras = new ArrayList<figura>();
    public static void main(String[] args) {
        triangulo trianguloA= new triangulo (5,3);
        rectangulo rectanguloA = new rectangulo (5,3);
        romboide romboideA = new romboide (5,3);
        
        trianguloA.obtenerArea();
        rectanguloA.obtenerArea();
        romboideA.obtenerArea();
        
        figuras.add(romboideA);
        figuras.add(trianguloA);
        figuras.add(rectanguloA);
        
        for (figura figurasg: figuras){
            figurasg.calcularArea();
        }
    }
}
