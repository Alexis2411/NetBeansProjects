import java.util.Scanner;
public class Main {
    public static Scanner s = new Scanner(System.in); 
    public static void main(String[] args) {
       int venta, nventas=0;
       float producto, vsi=0, iva, vci, vtsi=0, vtci=0, tiva=0, promv=0;
       System.out.println("Sistema de ventas");
       System.out.println("Para venta escriba cualquier numero mayor a 0");
       System.out.println("Para salir oprima -1");
       venta=s.nextInt();
       while (venta!=-1){
           System.out.println("Costo del producto");
           producto=s.nextInt();
           while(producto>=0.01){
               vsi=vsi+producto;
               System.out.println("Costo del producto");
               producto=s.nextInt();
           }
           if (vsi!=0){
               nventas=nventas+1;
               iva=(float) (vsi*0.16);
               vci=vsi+iva;
               System.out.println("Venta sin IVA: "+vsi);
               System.out.println("IVA: "+ iva);
               System.out.println("Venta con IVA: "+ vci);
               vtsi=vtsi+vsi;
               vtci=vtci+vci;
               tiva=tiva+iva;
               vsi=0;
           }
           System.out.println("Para venta escriba cualquier numero mayor a 0");
           System.out.println("Para salir oprima -1");
           venta=s.nextInt();
       }
       if (nventas!=0){
           promv=vtci/nventas;
           System.out.println("Ventas totales son IVA: "+ vtsi);
           System.out.println("Total de IVA: "+ tiva);
           System.out.println("Ventas totales con IVA: "+ vtci);
           System.out.println("Promedio por venta: "+ promv);
       }else{
           System.out.println("No se registro ninguna venta");
       }
    }
    
}
