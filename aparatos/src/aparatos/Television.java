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
public class Television extends Electrodomestico{
    //CONSTANTES
    private final static int RESOLUCION=20;
    private final static boolean SINTONIZADOR=false;
    
    //ATRIBUTOS
    private int resolucion;
    private boolean sintonizador;
    
    //CONSTRUCTOR POR DEFECTO
    public Television(){
        super();
        this.resolucion=RESOLUCION;
        this.sintonizador=SINTONIZADOR;
    }
    
    //CONSTRUCTOR CON PRECIO Y PESO
    public Television(int precio, int peso){
        super(precio, peso);
        this.resolucion=RESOLUCION;
        this.sintonizador=SINTONIZADOR;
    }
    
    //CONSTRUCTOR CON TODOS LOS ATRIBUTOS
    public Television(int precio, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizador) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }
    
    //METODOS PUBLICOS
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    public int precioFinal(){
        int aux=super.precioFinal();
        if (resolucion>40){
            aux+=(aux*0.3);
        }
        if (sintonizador==true){
            aux+=50;
        }
        return aux;
    }
}
