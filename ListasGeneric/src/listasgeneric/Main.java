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
public class Main {
    public static void main(String[] arg) {
        String dato;
        boolean bandera = false;
        Lista<Integer> lFinal = new Lista<>();

        do {
            dato = JOptionPane.showInputDialog(null, "Añadir un elemento a la lista:", "Lista con Inserción al Final", JOptionPane.INFORMATION_MESSAGE);
            if (dato == null) {
                JOptionPane.showMessageDialog(null, "La operacion ha sido cancelada.");
            } else {
                lFinal.insertar_final(Integer.parseInt(dato));
            }
            String res = JOptionPane.showInputDialog("Desea agregar otro elemento [Si/No]:");
            if (res == null) {
                JOptionPane.showMessageDialog(null, "La operacion ha sido cancelada.");
                bandera = false;
            } else {
                if (res.toUpperCase().compareTo("SI") == 0) {
                    bandera = true;
                } else {
                    bandera = false;
                }
            }
        } while (bandera == true);

//        bandera=false;     
//        lista lFrente = new lista();
//        
//        do
//        {
//            dato = JOptionPane.showInputDialog(null, "Añadir un elemento a la lista:","Lista con Inserción al Frente",JOptionPane.INFORMATION_MESSAGE);
//            if(dato==null)
//                JOptionPane.showMessageDialog(null, "La operacion ha sido cancelada.");
//            else 
//                lFrente.insertar_frente(Integer.parseInt(dato));
//            String res = JOptionPane.showInputDialog("Desea agregar otro elemento [Si/No]:");
//            if(res==null){
//                JOptionPane.showMessageDialog(null, "La operacion ha sido cancelada.");
//                bandera=false;
//            }
//            else{ 
//                if (res.toUpperCase().compareTo("SI")==0)
//                    bandera=true;
//                else
//                    bandera=false;
//            }
//        }while(bandera==true); 
        lFinal.visualizar();
//        lFrente.visualizar();

        dato = JOptionPane.showInputDialog("Introduce el elmento a buscar:");

        if (dato == null) {
            JOptionPane.showMessageDialog(null, "La operacion ha sido cancelada.");
        } else {
            lFinal.visualizar(Integer.parseInt(dato));
        }
    }
}
