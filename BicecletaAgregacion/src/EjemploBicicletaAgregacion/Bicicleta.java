/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBicicletaAgregacion;

import java.util.ArrayList;

/**
 *
 * @author ProDep-1
 */
public class Bicicleta {
    private final ArrayList<Rueda> ruedas = new ArrayList<Rueda>();
    private final int maxR=2;
    
    public Bicicleta(Rueda r1,Rueda r2){
        ruedas.add(r1);
        ruedas.add(r2);
    }
    
    public void cambiarRueda(int pos, Rueda raux){
    if (pos>=0 && pos<maxR){
        ruedas.remove(pos);
        ruedas.add(pos,raux);
    }
    
    }
    
    public ArrayList<Rueda> getRuedas(){
        return ruedas;
    }
}
