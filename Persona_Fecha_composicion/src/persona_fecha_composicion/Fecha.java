/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona_fecha_composicion;

/**
 *
 * @author Alexis Javier Roman
 */
public class Fecha {
    //Atributos 
    private int dia;
    private int mes;
    private int año;
    
    //Metodos
    public Fecha(int dia, int mes, int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }

    public Fecha() {
    }
    
    public void setDia(int dia){
        this.dia=dia;
    }
    
    public int getDia(){
        return dia;
    }
    
    public void setMes(int mes){
        this.mes=mes;
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setAño(int año){
        this.año=año;
    }
    
    public int getAño(){
        return año;
    }
    
}
