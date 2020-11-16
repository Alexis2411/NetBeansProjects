/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasobject;

/**
 *
 * @author alexis
 */
class Nodo
{
  private Object dato;
  private Nodo enlace;
  
  public Nodo(){
      enlace=null;
  }
  
  public Nodo(Object dato,Nodo enlace)
  {
    setDato(dato);
    setEnlance(enlace);
  }
  
  public void setDato(Object dato){
      this.dato=dato;
  }
  
  public Object getDato(){
      return dato;
  }
  
  public void setEnlance(Nodo enlace){
      this.enlace=enlace;
  }
  
  public Nodo getEnlace(){
      return enlace;
  }
}