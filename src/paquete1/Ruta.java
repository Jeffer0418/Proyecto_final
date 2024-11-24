
package paquete1;

import java.util.Scanner;

public class Ruta {
    Scanner sc = new Scanner(System.in);

    public float calcularDistanciaTotal(int seleccion) {
        String nombre; 
        float distanciaIda, distanciaVuelta, distanciaTotal=0;
        do {
            System.out.println("-------------------------------------------------");
            System.out.println("Seleccione la ruta que va a seguir el vehículo   |");
            System.out.println("1) Autopista Medellin Bogota                     |");
            System.out.println("2) Via Santa Elena                               |");
            System.out.println("3) Via Las Palmas                                |");
            System.out.println("-------------------------------------------------");
            seleccion = sc.nextInt();

            switch (seleccion) {
                case 1:
                    nombre = "autopistaMedellinBogota";
                    System.out.println("La ruta seleccionada es: "+nombre);
                    distanciaIda=45f;
                    distanciaVuelta=45f;
                    distanciaTotal=distanciaIda+distanciaVuelta;
                    break;
                case 2:
                    nombre = "viaSantaElena";
                    System.out.println("La ruta seleccionada es: "+nombre);
                    distanciaIda= 50f;
                    distanciaVuelta=50f;
                    distanciaTotal=distanciaIda+distanciaVuelta;
                    break;
                case 3:
                    nombre = "viaLasPalmas";
                    System.out.println("La ruta seleccionada es: "+nombre);
                    distanciaIda=55f;
                    distanciaVuelta=55f;
                    distanciaTotal=distanciaIda+distanciaVuelta;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (seleccion > 3);
            return distanciaTotal;
    }
}
