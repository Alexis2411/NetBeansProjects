
import java.util.Scanner;
public class Main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int num, c = 0, t, par=0,imp=0, pos=0, neg=0;
        System.out.println("Calcula cantidad de pares e impares y negativos y positivos");
        System.out.println("Cantidad de numeros");
        t=s.nextInt();
        for (c=1; c<=t; c++){
            System.out.println("Escriba un numero");
            num=s.nextInt();
            if (num>=0){
                pos=pos+1;
            }else{
                neg=neg+1;
            }
            if (num%2==0){
                par=par+1;
            }else{
                imp=imp+1;
            }
        }
        System.out.println("Positivos: "+ pos + "Negativos"+ neg + "Pares" + par+ "Impares"+ imp);
       
    }
    
}
