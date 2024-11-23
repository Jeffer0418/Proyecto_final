package paquete1;

import java.util.Scanner;

public class Simulacion {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int seleccion = 0, cupoDisponible = 0, kmG, kmT, distancia, distanciaVuelta;
        float valorPasaje = 0;
        String nombre="";
        Taxi tx = new Taxi();
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
                    valorPasaje = 25000;
                    kmG = 50;
                    System.out.println("Seleccionaste Taxi");

                    System.out.println("EL valor del pasaje es: " + tx.calcularConsumo(cupoDisponible, valorPasaje));
                    break;
                case 2:
               
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