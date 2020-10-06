/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipofutbol;

import java.util.ArrayList;

/**
 *
 * @author Alexis Javier Roman
 */
public class EquipoFutbol {
public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entrenador delBosque = new Entrenador("284EZ89", 1, "Vicente", "Del Bosque", 60);
        Futbolista iniesta = new Futbolista (6, "Interior Derecho", 2, "Andres", "Iniesta", 29);
        Masajista raulMartinez = new Masajista("Licenciado en Fisioterapia", 18, 3, "Raúl", "Martínez", 41);
        
        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);
        
        //CONCENTRACIÓN
        System.out.println("Todos los integrantes comienzan una concentracíón. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes){
            System.out.println(integrante.getNombre()+ " "+ integrante.getApellidos() + "-->");
            integrante.Concentrarse();
        }
        
        //VIAJE
        System.out.println("Todos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes){
            System.out.println(integrante.getNombre()+ " "+ integrante.getApellidos() + "-->");
            integrante.Viajar();
        }
        
        //ENTRENAMIENTO
        System.out.println("Entrenamiento: Solamente el entrenador y el futbolista tienen métodos para entrenar:");
        System.out.println(delBosque.getNombre()+ " "+ delBosque.getApellidos()+"-->");
        delBosque.dirigirEntrenamiento();
        System.out.println(iniesta.getNombre()+" "+iniesta.getApellidos()+ "-->");
        iniesta.entrenar();
        
        //MASAJE
        System.out.println("Masaje: Solo el masajista tiene el método para dar un masaje");
        System.out.println(raulMartinez.getNombre()+" "+ raulMartinez.getApellidos()+"-->");
        raulMartinez.darMasaje();
        
        //PARTIDO DE FUTBOL
        System.out.println("Partido de Fútbol: Solamente el entrenador y el futbolista tienen los métodos para el partido de fútbol:");
        System.out.println(delBosque.getNombre()+ " " + delBosque.getApellidos()+"-->");
        delBosque.dirigirPartido();
        System.out.println(iniesta.getNombre()+ " " + iniesta.getApellidos()+ "-->");
        iniesta.jugarPartido();
    }
    
}
