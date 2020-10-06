import java.util.Scanner;
/**
 *
 * @author DOKIA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int dia = 0, seg = 0;
        System.out.println("Ingrese la cantidad de dias para convertirla a segundos.");
        dia = s.nextInt();
        seg = dia*86400;
        System.out.println("Segundos: "+ seg);
        // TODO code application logic here
    }
    
}
