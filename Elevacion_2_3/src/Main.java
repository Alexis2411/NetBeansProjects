
import java.util.Scanner;

/**
 *
 * @author DOKIA
 */
public class Main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int num = 0, cua = 0, cub = 0;
        System.out.println("Ingrese un numero para obtener su cuadrado y cubo");
        num = s.nextInt();
        cua=num*num;
        cub=cua*num;
        System.out.println("Cuadrado:"+ cua+ " Cubo:"+ cub);
    }
    
}
