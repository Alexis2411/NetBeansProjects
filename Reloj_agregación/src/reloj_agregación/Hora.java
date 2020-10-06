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
public class Hora {
    //Atributos
    private int hora;
    private int minutos;
    private int segundos;
    
    //Metodos
    
    public Hora (int hora, int minutos, int segundos){
        this.hora=hora;
        this.minutos=minutos;
        this.segundos=segundos;
    }
    
    public int getHora(){
        return minutos;
    }
    
    public int getMinutos(){
        return minutos;
    }
    
    public int getSegundos(){
        return segundos;
    }
}
