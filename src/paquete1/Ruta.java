
package paquete1;

import java.util.Scanner;

public class Ruta {
    Scanner sc = new Scanner(System.in);
    String  nombre, distanciaIda, distanciaVuelta;
    public float calcularDistanciaTotal(int seleccion) {
        do {
            System.out.println("-------------------------------------------------");
            System.out.println("Seleccione la ruta que va a seguir el vehículo   |");   
            System.out.println("1) Autopista Medellin Bogota                     |");                     
            System.out.println("2) Via Santa Elena                               |");                              
            System.out.println("3) Via Las Palmas                                |");                                
            System.out.println("-------------------------------------------------");
            seleccion = sc.nextInt();
            if (seleccion > 3) {
                System.out.println("Ingrese una opcion valida");
            }      
        switch (seleccion) {
            case 1:
                nombre = "autopistaMedellinBogota";
                break;
            case 2:
                nombre="viaSantaElena";
                break;
            case 3:
                nombre="viaLasPalmas";  
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
        } while (seleccion > 3);
        float calculo=0.5f;
        float calculo2=3.5f;
        float totCalculo=calculo2+calculo;
        return totCalculo;
        }
    }

