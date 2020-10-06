import java.util.Scanner;
public class Main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int dia;
        float km, precio, total;
        System.out.println("Calcula el precio del boleto");
        System.out.println("Dias: ");
        dia=s.nextInt();
        System.out.println("Distancia KM");
        km=s.nextFloat();
        System.out.println("Precio: ");
        precio=s.nextFloat();
        total=km*precio;
        if (dia>7 && km>800){
            total=(float) (total*0.7);
        }
        System.out.println("Costo= "+ total);
    }
    
}
