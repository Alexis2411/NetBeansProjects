
import java.util.Scanner;

public class Main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d, suma, producto;
        float media;
        System.out.println("Programa que calcula la media, producto y suma");
        System.out.println("Num 1");
        a= s.nextInt();
        System.out.println("Num 2");
        b= s.nextInt();
        System.out.println("Num 3");
        c= s.nextInt();
        System.out.println("Num 4");
        d= s.nextInt();
        suma=a+b+c+d;
        producto=a*b*c*d;
        media=suma/4;
        System.out.println("Suma: "+ suma+" Producto:"+ producto + " Media:"+ media);
    }
    
}
