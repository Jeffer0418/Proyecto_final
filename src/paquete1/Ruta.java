
package paquete1;
import java.util.Scanner;
public class Ruta {
 Scanner sc=new Scanner(System.in);
 public void menu(int seleccion){
    String nombre, distanciaIda, distanciaVuelta;
    do{
    System.out.println("---------------------");
    System.out.println("Seleccione la ruta que va a seguir el vehículo");
    System.out.println("1) Autopista Medellin Bogota");
    System.out.println("2) Via Santa Elena ");
    System.out.println("3) Via Las Palmas");
    System.out.println("---------------------");
    seleccion=sc.nextInt();
    if (seleccion>3) {
        System.out.println("Ingrese una opcion valida");
    }
    }while (seleccion>3); 
    switch (seleccion) {    
        case 1:
            
            break;
    
        default:
            break;
    }
    
 }
}
