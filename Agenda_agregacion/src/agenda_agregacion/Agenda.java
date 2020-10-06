/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_agregacion;

/**
 *
 * @author Alexis Javier Roman
 */
public class Agenda {
    //Atributos
    private Contacto[] contacto;
    private int año;
    private int i;
    
    
    //Metodos
    public Agenda(int año){
        this.año=año;
        contacto=new Contacto[100];
    }
    
    public void añadirContacto(Contacto contacto){
        this.contacto[getPosicion()]=contacto;
        setPosicion(getPosicion()+1);
    }
    
    public void verAgenda() {
      System.out.println("Año: " + this.año );
      for (int j=0;j<getPosicion();j++){
          
       System.out.println("Contacto: " + contacto[j].getNombre()+ "\n" 
        + "Telefono: " + contacto[j].getTelefono()); 
        }
    }    
          
    private void setPosicion(int i){
        this.i = i;
    }
    
    private int getPosicion(){
        return i;
    }   
}
