import java.util.Scanner;
public class Main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Calcula el numero central");
        System.out.println("Ingrese a");
        a=s.nextInt();
        System.out.println("Ingrese b");
        b=s.nextInt();
        System.out.println("Ingrese c");
        c=s.nextInt();
        if (a==b ||a==c || b==c){
            System.out.println("No exite un numero central");
        }
        if (a<b){
            if (b<c){
                System.out.println(b);
            }else if (c<a){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else{
            if (b<a){
                System.out.println(a);
            }else if (c<b){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    }
    
}
