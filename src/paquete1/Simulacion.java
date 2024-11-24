package paquete1;

import java.util.Scanner;

public class Simulacion {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int seleccion = 0, cupoDisponible = 0, kmG=0, kmT;
        float valorPasaje = 0, valorPeaje=0;
        String nombre="";
        Taxi tx = new Taxi();
        Van van=new Van();
        Ruta rt=new Ruta();
        do {
            System.out.println("---------------------");
            System.out.println("Menu                 |");               
            System.out.println("1) Taxi              |");
            System.out.println("2) Vans              |");
            System.out.println("3) Buseta            |");
            System.out.println("---------------------");
            seleccion = sc.nextInt();
            switch (seleccion) {
                case 1:
                    cupoDisponible = 4;
                    valorPasaje = 25000f;
                    kmG = 50;
                    System.out.println("Seleccionaste Taxi");

                    System.out.println("EL valor del pasaje es: " + tx.calcularConsumo(cupoDisponible, valorPasaje));
                    break;
                case 2:
                    System.out.println("Seleccionaste Vans");
                    cupoDisponible=10;
                    valorPasaje=15000f;
                    valorPeaje=20500f;
                    kmG=40;
                    System.out.println("El porcentaje vía es: "+van.calcularConsumoTotal(cupoDisponible, valorPasaje, valorPeaje, seleccion));
               
                break;
                case 3:
                

                break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (seleccion > 3);
    }
}