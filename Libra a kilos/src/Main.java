import java.util.Scanner;

public class Main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        float libra, kilo;
        System.out.println("Conversor de libras a kilos");
        System.out.println("Ingrese numero de libras");
        libra=s.nextFloat();
        kilo = (float)(libra*0.453592);
        System.out.println("Total de kilos: "+ kilo);
        
        
    
    }
    
}
