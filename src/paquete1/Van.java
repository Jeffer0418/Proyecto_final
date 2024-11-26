
package paquete1;

import java.util.Scanner;

public class Van {
    Scanner sc = new Scanner(System.in);

    public float calcularConsumoBajandoVan(int cupoDisponible, float valorPasaje, float totConsumoMarcha, int seleccion, float distanciaTotal) {
        Vehiculo vn = new Vehiculo(15000f, 20500f, 0, 40);
        float consumoVan = 0, porcentajeVia = 0, totConsumoVanBa=0;
        int rutaVan = 0, ingPasajeros;

        Ruta rt = new Ruta();
        consumoVan = vn.calcularConsumo(totConsumoVanBa, seleccion, distanciaTotal); // Consumo base
        rutaVan = rt.calcularDistanciaTotal(seleccion);// Seleccion de ruta
        if (rutaVan == 1) {// Autopista medellin Bogota
            porcentajeVia = consumoVan * 0.08f;
        } else if (rutaVan == 2) {// Via Santa Elena
            porcentajeVia = consumoVan * 0.11f;
        } else {// Via las palmas
            porcentajeVia = consumoVan * 0.11f;
        }
        consumoVan += porcentajeVia;// Consumo base mas incremento via
        System.out.println("Ingrese la cantidad de pasajeros con la que inicia el vehiculo");
        cupoDisponible = sc.nextInt();
        do {// Se realiza el llenado de la Van
            do {
                System.out.println("¿Desea ingresar pasajeros?");
                System.out.println("1) Si\n2) No");
                ingPasajeros = sc.nextInt();
                switch (ingPasajeros) {
                    case 1:
                        cupoDisponible += 1;
                        if (cupoDisponible == 10) {
                            System.out.println("El cupo de la Van no puede superar los 10 pasajeros");
                        }
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;
                }
            } while (ingPasajeros > 2);

        } while (cupoDisponible <= 10 && ingPasajeros == 1); 
        totConsumoVanBa=consumoVan*cupoDisponible;
        return totConsumoVanBa;
    }

    public float calcularConsumoTotal(int cupoDisponible, float valorPasaje, float totConsumoMarcha, int seleccion,float distanciaTotal) {
            float totConsumoVan=0, consMarch=0, consumoIda=0;
            Vehiculo vn = new Vehiculo(15000f, 20500f, 0, 40);
        Van va=new Van();
        consumoIda=va.calcularConsumoBajandoVan(cupoDisponible, valorPasaje, totConsumoMarcha, seleccion, distanciaTotal);
        consMarch=vn.calcularConsumoSubiendo(cupoDisponible, totConsumoVan, distanciaTotal);
        totConsumoVan=consumoIda+consMarch;
        return totConsumoVan;
    }

}
