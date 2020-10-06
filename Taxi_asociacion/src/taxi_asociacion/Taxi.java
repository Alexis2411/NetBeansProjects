/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxi_asociacion;

/**
 *
 * @author Alexis Javier Roman
 */
public class Taxi {
    //Atributos
    private Chofer chofer;
    private String matricula;

    //Metodos
    public Taxi (Chofer chofer, String matricula){
        this.chofer=chofer;
        this.matricula=matricula;
    }
    
    public Chofer getChofer(){
        return chofer;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    @Override
    public String toString() {
        return "El chofer es: " + chofer.getNombre() + " y conduce el taxi con matricula " + matricula;
    }    
}
