import java.util.Scanner;
public class Main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int num1, num2, res;
        float resd;
        String signo;
        System.out.println("Calculadora");
        System.out.println("Numero 1");
        num1=s.nextInt();
        System.out.println("Signo");
        signo=s.next();
        System.out.println("Numero 2");
        num2=s.nextInt();
        if ("+".equals(signo)){
            res=num1+num2;
            System.out.println("Suma es "+ res);
        }else if("-".equals(signo)){
            res=num1-num2;
            System.out.println("Resta es "+ res);
        }else if ("*".equals(signo)){
            res=num1*num2;
            System.out.println("Producto es: "+ res);
        }else if ("/".equals(signo)){
            resd=num1/num2;
            System.out.println("Division es: "+ resd);
        }else{
            System.out.println("No se reconoce el operador");
        }
        
        
    }
    
}
