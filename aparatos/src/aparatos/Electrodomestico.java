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
public class Electrodomestico {
    //CONSTANTES
    protected final static int PRECIO_BASE=100;
    protected final static String COLOR_BASE= "blanco";
    protected final static char CONSUMO_ENER= 'F';
    protected final static int PESO_BASE=5;
    
    //ATRIBUTOS
    protected int precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;
    
    //CONSTRUCTOR POR DEFECTO
    public Electrodomestico(){
        this.color=COLOR_BASE;
        this.consumoEnergetico=CONSUMO_ENER;
        this.precio=PRECIO_BASE;
        this.peso=PESO_BASE;
    }
    
    //CONSTRUCTOR CON PRECIO Y PESO
    public Electrodomestico (int precio, int peso){
        this.precio=precio;
        this.peso=peso;
        this.color=COLOR_BASE;
        this.consumoEnergetico=CONSUMO_ENER;
    }
    //CONSTRUCTOR CON TODOS LOS ATRIBUTOS

    public Electrodomestico(int precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }
    
    //METODOS PUBLICOS
    
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public int precioFinal(){
        int aux=0;
        switch (consumoEnergetico){
            case 'A':
                aux+=100;
                break;
            case 'B':
                aux+=80;
                break;
            case 'C':
                aux+=60;
                break;
            case 'D':
                aux+=50;
                break;
            case 'E':
                aux+=30;
                break;
            case 'F':
                aux+=10;
                break;      
        }
        
        if (peso>=0 && peso<=19){
            aux+=10;
        }
        else if (peso>=20 && peso<=49){
            aux+=50;
        }
        else if (peso>=50 && peso<=79){
            aux+=80;
        }
        else{
            aux+=100;
        }
        
        return precio+aux;
   
    }
    
    //METODOS PRIVADOS
    private void comprobarConsumoEnergetico(char letra){
        if ((letra<=65) && (letra>70)){
            this.consumoEnergetico=letra;
        }
        else{
            this.consumoEnergetico=CONSUMO_ENER;
        }
    }
    
    private void comprobarColor(String color){
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        int aux=0;
        for(int i=0; i<colores.length; i++){
            if (colores[i].equals(colores)){
                aux=1;
            }
        }
        if (aux==1){
            this.color=color;
        }
        else{
            this.color=COLOR_BASE;
        }
    }
    
    
}
