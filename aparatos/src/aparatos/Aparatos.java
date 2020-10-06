/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparatos;

import java.util.ArrayList;

/**
 *
 * @author Alexis Javier Roman
 */
public class Aparatos {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Electrodomestico> Electrodomesticos = new ArrayList<Electrodomestico>();
    public static void main(String[] args) {
       
        Lavadora lavadora1= new Lavadora();
        Lavadora lavadora2= new Lavadora(80, 25);
        Lavadora lavadora3=new Lavadora(65, "negro", 'B', 40, 15);
        Lavadora lavadora4= new Lavadora();
        Television television1=new Television();
        Television television2=new Television(50, 35);
        Television television3=new Television (100, "azul", 'F', 20, 50, true);
        Television television4 = new Television(55, 90);
        Television television5 = new Television(75, "amarillo", 'G', 60, 50, false);
        Television television6 = new Television();
        
        Electrodomesticos.add(lavadora1);
        Electrodomesticos.add(lavadora2);
        Electrodomesticos.add(lavadora3);
        Electrodomesticos.add(lavadora4);
        Electrodomesticos.add(television1);
        Electrodomesticos.add(television2);
        Electrodomesticos.add(television3);
        Electrodomesticos.add(television4);
        Electrodomesticos.add(television5);
        Electrodomesticos.add(television6);
        
        int sumaTotalLavadora=0;
        int sumaTotalTelevision=0;
        int sumaTotal=0;
        
        for (Electrodomestico aux: Electrodomesticos){
            if (aux instanceof Lavadora){
                sumaTotalLavadora+=aux.precioFinal();
            }
            if (aux instanceof Television){
                sumaTotalTelevision+=aux.precioFinal();
            }
        }
        
        sumaTotal=sumaTotalLavadora+sumaTotalTelevision;
        
        System.out.println("El precio total de los electrodomesticos es de: " + sumaTotal);
        System.out.println("El precio total de las lavadora es de: " + sumaTotalLavadora);
        System.out.println("El precio total de las televisiones es de : " + sumaTotalTelevision);
    }
    
}
