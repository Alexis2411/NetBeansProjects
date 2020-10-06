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
public class Reloj {
    //Atributos
    private Display display;
    private Hora hora;
    
    //Metodos
    
   public Reloj(Hora hora, String tipo){
       this.hora=hora;
       Display display = new Display (tipo);
       
   }
   
   public void Start(){
       System.out.println(hora.getHora()+":"+hora.getMinutos()+":"+hora.getSegundos());   
   }
     
}
