/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productosmercado;

import javax.swing.JOptionPane;

/**
 *
 * @author alexis
 */
public class ListaEnlazada<T> {
    private Nodo<T> cabeza;
    private Nodo<T> anterior;
    private int tamaño=0;

    public ListaEnlazada() {
        cabeza = null;
    }

    public ListaEnlazada insertar_final(T entrada) {
        //nodo nuevo=new nodo(entrada,null);
        Nodo<T> nuevo = new Nodo<>();
        nuevo.setDato(entrada);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            anterior.setEnlace(nuevo);
        }
        tamaño+=1;
        anterior = nuevo;
        return this;
    }

    public ListaEnlazada insertar_frente(T entrada) {
        Nodo<T> nuevo = new Nodo<>(entrada, null);
        nuevo.setEnlace(cabeza);
        cabeza = nuevo;
        tamaño+=1;
        return this;
    }

    public String visualizar() {
        String datos="";
        Nodo<T> n = cabeza;
        n = cabeza;
        while (n != null) {
            datos= datos + n.getDato() + " ";
            n = n.getEnlace();
        }
        return datos;
    }

    public boolean ListaVacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }
        
    public T devolverDato(int n) {
        if (cabeza==null){
            return null;
        }
        else{
            Nodo puntero = cabeza;
            int contador=0;
            while(contador<n && puntero.getEnlace() != null){
                puntero=puntero.getEnlace();
                contador++;
            }
            if (contador!=n){
                return null;
            }
            else{
                return (T) puntero.getDato();
            }
        }
    }
    
        
    public int getTamaño(){
        return tamaño;
    }
}
