import java.util.Scanner;
public class Main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int i;
        float[] cal=new float [5];
        float suma=0, promedio;
        System.out.println("Calculadora de promedio");
        for (i=0; i<=4; i++){
            System.out.println("Escriba la calificaion");
            cal[i]=s.nextFloat();
            suma=suma+cal[i];
        }
        promedio= suma/5;
        System.out.println("Promedio"+ promedio);
   }
}
