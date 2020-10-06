import java.util.Scanner;
public class Main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int seg, min=0, hrs=0;
        System.out.println("Conversos de segundos a horas y minutos");
        System.out.println("Ingrese segundos");
        seg=s.nextInt();
        while (seg >=60){
            if (seg>=3600){
                seg=seg-3600;
                hrs=hrs+1;
            }else{
                seg=seg-60;
                min=min+1;
            }
        }
        System.out.println("Horas "+ hrs+ " Minutos "+ min+ " Segundos "+ seg);
    }
    
}
