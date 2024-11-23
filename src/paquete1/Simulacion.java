package paquete1;
import java.util.Scanner;

public class Simulacion {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){
        
        Taxi tx=new Taxi();
         int seleccion = 0, cupoDisponible=0;
         float ValorPasaje=0;
        do{
         System.out.println("---------------------");
         System.out.println("Menu");
         System.out.println("1) Taxi");
         System.out.println("2) Vans");
         System.out.println("3) Buseta");
         System.out.println("---------------------");
         seleccion=sc.nextInt();
         if(seleccion>3){
            System.out.println("Ingrese una opcion valida");
         }
         }while(seleccion>3);
         switch(seleccion){
             case 1:
             cupoDisponible=4;
             ValorPasaje=25000;
             System.out.println("Seleccionaste Taxi");
            
            System.out.println("EL valor del pasaje es: "+tx.CalcularConsumom(cupoDisponible, ValorPasaje));
            
         }
    
}
}