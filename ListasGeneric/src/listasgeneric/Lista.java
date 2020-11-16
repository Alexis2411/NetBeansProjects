/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasgeneric;

import javax.swing.JOptionPane;

/**
 *
 * @author alexis
 */
public class Lista<T> 
{
    private Nodo<T> cabeza;
    private Nodo<T> anterior;

    public Lista() {
        cabeza = null;
    }

    public Lista insertar_final(T entrada) {
        //nodo nuevo=new nodo(entrada,null);
        Nodo<T> nuevo = new Nodo<>();
        nuevo.setDato(entrada);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            anterior.setEnlace(nuevo);
        }

        anterior = nuevo;
        return this;
    }

    public Lista insertar_frente(T entrada) {
        Nodo<T> nuevo = new Nodo<>(entrada, null);
        nuevo.setEnlace(cabeza);
        cabeza = nuevo;
        return this;
    }

    public void visualizar() {
        String datos="";
        if (!ListaVacia()) {
            Nodo<T> n = cabeza;
            n = cabeza;
            while (n != null) {
                
                datos= datos + n.getDato() + " ";
                n = n.getEnlace();
            }
            JOptionPane.showMessageDialog(null, "Elementos de la lista: \n" + datos);
        }
        else
           JOptionPane.showMessageDialog(null, "Lista Vacia."); 
    }

    public void visualizar(T dato) {
        boolean bandera = false;
        if (!ListaVacia()) {
            Nodo<T> n = cabeza;
            while (n != null && bandera == false) {
                if (n.getDato() == dato) {
                    JOptionPane.showMessageDialog(null, "Dato " + n.getDato() + " encontrado en la lista.");
                    bandera = true;
                }
                n = n.getEnlace();
                if(n==null && bandera==false)
                    JOptionPane.showMessageDialog(null, "Dato no encontrado.");
            }
        }
        else
           JOptionPane.showMessageDialog(null, "Lista Vacia."); 
    }

    private boolean ListaVacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }       
}
