/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBicicletaComposicion;

import java.util.ArrayList;

/**
 *
 * @author ProDep-1
 */
public class Bicicleta {
    private ArrayList<Rueda> ruedas = new ArrayList<Rueda>();
    private final int maxR=2;
    
    public Bicicleta(String d,String t){
        ruedas.add(new Rueda(d));
        ruedas.add(new Rueda(t));
    }
    
    public void cambiarRueda(int pos, String nombre){
    if (pos>=0 && pos<maxR)
    {
        ruedas.remove(pos);
        ruedas.add(pos,new Rueda(nombre));
    }
    }
    
    public ArrayList<Rueda> getRuedas(){
        return ruedas;
    }
}
