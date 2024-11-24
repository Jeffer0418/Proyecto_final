package paquete1;

import java.util.Scanner;

public class Simulacion {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
<<<<<<< HEAD
        int seleccion = 0, cupoDisponible = 0, kmG=0, kmT;
        float valorPasaje = 0, valorPeaje=0;
=======
        int seleccion = 0, cupoDisponible = 0, kmG, kmT, distanciaIda, distanciaVuelta;
        float valorPasaje = 0;
>>>>>>> c6c5983bb56c803c5456904001bdd7739dfa3681
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

                    System.out.println("EL valor del pasaje es: " + valorPasaje);
                    break;
                case 2:
<<<<<<< HEAD
                    System.out.println("Seleccionaste Vans");
                    cupoDisponible=10;
                    valorPasaje=15000f;
                    valorPeaje=20500f;
                    kmG=40;
                    System.out.println("El porcentaje vía es: "+van.calcularConsumoTotal(cupoDisponible, valorPasaje, valorPeaje, seleccion));
               
                break;
                case 3:
                
=======
               cupoDisponible = 10;
               valorPasaje = 15000;
               kmG = 40;
               System.out.println("Seleccionaste Van");
                System.out.println(" El consumo es de "+ tx.calcularConsumoBajando(distancia, pasajeros));
               System.out.println("EL valor del pasaje es: " + valorPasaje);
                break;
                case 3:
                cupoDisponible = 15;
                    valorPasaje = 12000;
                    kmG = 30;
                    System.out.println("Seleccionaste Buseta");
>>>>>>> c6c5983bb56c803c5456904001bdd7739dfa3681

                    System.out.println("EL valor del pasaje es: " + valorPasaje);
                break;
                default:
                    System.out.println("Ingrese una opcion valida");

                    break;
            }
        } while (seleccion > 3);
    }
}