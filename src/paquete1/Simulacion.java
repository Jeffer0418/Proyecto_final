package paquete1;
import java.util.Scanner;

public class Simulacion {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){
         int seleccion = 0;
        do{
         System.out.println("---------------------");
         System.out.println("Menu");
         System.out.println("1) Taxi");
         System.out.println("2) Vans");
         System.out.println("3) Buseta");
         System.out.println("---------------------");
        
         seleccion=sc.nextInt();
         switch(seleccion){
             case 1:
            
         }
    }while(seleccion>3);
}
}