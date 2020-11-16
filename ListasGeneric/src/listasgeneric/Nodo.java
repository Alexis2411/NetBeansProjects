/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasgeneric;

/**
 *
 * @author alexis
 */
public class Nodo<T> 
{  
    private Nodo<T> sig;
    private T dato;
    
    public Nodo(){
        sig=null;
    }
    public Nodo(T dato) {
      this.dato = dato;
    }
    public Nodo(T dato, Nodo<T> sig) {
      this.dato = dato;
      this.sig = sig;
    }
    public void setEnlace(Nodo<T> sig) {
      this.sig = sig;
    }
    public Nodo<T> getEnlace() {
      return sig;
    }
    public T getDato() {
      return dato;
    }
    public void setDato(T dato){
        this.dato=dato;
    }
}


