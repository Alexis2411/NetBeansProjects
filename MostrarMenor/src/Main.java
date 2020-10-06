import java.util.Scanner;
public class Main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Calcula el mayor y el menor");
        System.out.println("Numero 1");
        num1=s.nextInt();
        System.out.println("Numero 2");
        num2=s.nextInt();
        if (num1>num2){
            System.out.println(num1 +"Es mayor y "+ num2 + "Es menor");
        }
        if (num1<num2){
            System.out.println(num2 +"Es mayor y "+ num1 + "Es menor");
        }
        else {
            System.out.println("Son iguales");
        }
        
        
    }
    
}
