
import java.util.Scanner;
public class Main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int m, n, o;
        System.out.println("Compara tres numeros");
        System.out.println("Numero 1");
        m=s.nextInt();
        System.out.println("Numero 2");
        n=s.nextInt();
        System.out.println("Numero 3");
        o=s.nextInt();
        
        if (m==n && m==o){
            System.out.println("Son iguales");
        }
        else{
            if (m==n || m==o || n==o){
                System.out.println("Hay dos iguales");
            }
            else {
                System.out.println("Son diferentes");
            }
        }
    }
    
}
