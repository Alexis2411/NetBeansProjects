import java.util.ArrayList;
import java.util.Iterator;

public class TestUsoIterator {     //Ejemplo uso iterator aprenderaprogramar.com

    public static void main (String [ ] Args) {

        ArrayList <String> listaDeNombres = new ArrayList <> ();

        listaDeNombres.add("Juan Pérez Sánchez");

        listaDeNombres.add("José Alberto Reverón Montes");

        String cadenaBuscar = "Alberto";

        System.out.println ("La cadena que buscamos es " + cadenaBuscar);

 

        Iterator<String> it = listaDeNombres.iterator();    //Creamos el objeto it de tipo Iterator con String

        String tmpAnalizando;

        while ( it.hasNext() ) {           //Utilizamos el método hasNext de los objetos tipo Iterator

            tmpAnalizando = it.next();                //Utilizamos el método next de los objetos tipo Iterator

            System.out.println ("Analizando elemento... " + tmpAnalizando);

            if (tmpAnalizando.contains(cadenaBuscar) ) {

                System.out.println ("Cadena encontrada!!!");  

            } else { }    //else vacío. No hay acciones a ejecutar.

        } //Cierre del while

    } //Cierre del main

} //Cierre de la clase