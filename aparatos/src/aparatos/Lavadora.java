/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparatos;

/**
 *
 * @author Alexis Javier Roman
 */
public class Lavadora extends Electrodomestico {
    //CONSTANTES
    private static final int CARGA=5;
    
    //ATRIBUTOS
    private int carga;
    
    //CONSTRUCTOR POR DEFECTO
    public Lavadora() {
        super();
        this.carga=CARGA;
    }
    //CONSTRUCTOR CON PRECIO Y PESO
    public Lavadora(int precio, int peso){
        super(precio, peso);
        this.carga=CARGA;
    }
    //CONSTRUCTOR CON LA CARGA Y ATRIBUTOS HEREDADOS
    public Lavadora(int precio, String color, char consumoEnergetico, int peso, int carga){
        super(precio, color, consumoEnergetico, peso);
        this.carga=carga;
    }
    
    //METODOS PUBLICOS
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public int precioFinal(){
        int aux=super.precioFinal();
        
        if (carga>30){
            aux+=50;
        }
        
        return aux;
    }

}
