/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_agregacion;

/**
 *
 * @author Alexis Javier Roman
 */
public class RutaAutobus {
    
    //Atributos
    private int Ruta;
    private String Chofer;
    private Pasajero[] Pasajero;
    private int i;
    
    //Constructor
    public RutaAutobus(){
        
    }
    
    public RutaAutobus(int Ruta, String Chofer){
        this.Ruta=Ruta;
        this.Chofer=Chofer;
        Pasajero= new Pasajero[20];
    }
    
    //get y set
    public void setRuta(int Ruta){
        this.Ruta=Ruta;
    }
    
    public int getRuta(){
        return Ruta;
    }
    
    public void setChofer(String Chofer){
        this.Chofer=Chofer;
    }
    
    public String getChofer(){
        return Chofer;
    }
    
    private void setPosicion(int i){
        this.i = i;
    }
    
    private int getPosicion(){
        return i;
    }
    
    public void AñadirPasajero(Pasajero Pasajero){
        this.Pasajero[getPosicion()]=Pasajero;
        setPosicion(getPosicion()+1);
    }
    
    public void MostrarPasajeros(){
        System.out.println("Ruta: " + this.Ruta);
        System.out.println("Chofer: " + this.Chofer);
        for (int j=0; j<=getPosicion(); j++){
            System.out.println("Pasajero: " + Pasajero[j].getNombre() + "\n" + "Asiento: " + Pasajero[j].getAsiento() );
        }
    } 
    
        
    
    
    
}
