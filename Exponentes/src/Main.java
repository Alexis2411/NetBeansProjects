import java.util.Scanner;
public class Main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int x, i, y, resultado=1;
        System.out.println("Progrma que calcula potencias");
        System.out.println("Numero");
        x=s.nextInt();
        System.out.println("Potencia");
        y=s.nextInt();
        for (i=1; i<=y; i++){
            resultado=resultado*x;
        }
        
        System.out.println("Resultado "+ resultado);

    }
    
}
