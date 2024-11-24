

package paquete1;
import java.util.Scanner;
public class Van {
    Scanner sc=new Scanner(System.in);
    public float calcularConsumoBajandoVan(int cupoDisponible, float valorPasaje, float totConsumoMarcha, int seleccion, float distanciaTotal) {
        float consumoVan = 0, porcentajeVia = 0, totConsumoVan;
        int rutaVan;
        Ruta rt = new Ruta();
        Vehiculo vh = new Vehiculo();
        consumoVan = vh.calcularConsumo(valorPasaje, cupoDisponible, seleccion); //Consumo base
        rt.calcularDistanciaTotal(seleccion);//Seleccion de ruta
        if (seleccion == 1) {//Autopista medellin Bogota
            porcentajeVia = consumoVan * 0.08f;
        } else if (seleccion == 2) {//Via Santa Elena
            porcentajeVia = consumoVan * 0.11f;
        } else {//Via las palmas
            porcentajeVia = consumoVan * 0.11f;
        }
        consumoVan += porcentajeVia;//Consumo base mas incremento via
        System.out.println("Ingrese la cantidad de pasajeros con la que inicia el vehiculo");
        cupoDisponible=sc.nextInt();
        do{

        }while( )

    }

    public float calcularConsumoTotal(int cupoDisponible, float valorPasaje, float totConsumoMarcha, int seleccion, float distanciaTotal) {

        vh.calcularConsumoSubiendo(cupoDisponible, consumoVan, distanciaTotal);
    }

}
