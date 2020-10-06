
import java.util.Scanner;
public class Main {
    public static Scanner s = new Scanner(System.in); 
    public static void main(String[] args) {
        int edad=0, anno=0, annon=0;
        System.out.println("Calcula año de nacimiento");
        System.out.println("Edad");
        edad=s.nextInt();
        System.out.println("Año actual");
        anno=s.nextInt();
        annon=anno-edad;
        System.out.println("Año de nacimiento: "+ annon);
    }
    
}
