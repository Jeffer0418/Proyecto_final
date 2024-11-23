
package paquete1;

import java.util.Scanner;

public class Vehiculo {
    float ConsumoBase, ValorPasaje, ValorPeaje, totPasaje;
    int cupoDisponible, kmG, kmT;
    Scanner sc = new Scanner(System.in);

    public float CalcularConsumo(float ConsumoBase, int kmG, int kmT) {
        kmG = 0;
        kmT = 0;
        ConsumoBase = (16000 / kmG) * kmT;
        return ConsumoBase;
    }

    public float calcularCostoPeaje(float ValorPeaje) {
        ValorPeaje = 0;
        float totPeaje = ValorPeaje * 2;
        return totPeaje;
    }

    public float calcularValorPasaje(float ValorPasaje, int cupoDisponible) {
        totPasaje = ValorPasaje * cupoDisponible;
        return totPasaje;
    }

    public float calcularConsumoSubiendo(int cupoDisponible, int kmT, float ConsumoBase){
         float kmPrimera, kmSegunda, kmTercera, totKm=0;
        do{

        System.out.println("Ingrese la cantidad de kilometros recorridos en primera");
        kmPrimera=sc.nextFloat();
        System.out.println("Ingrese la cantidad de kilometros recorridos en segunda");
        kmSegunda=sc.nextFloat();
        System.out.println("Ingrese la cantidad de kilometros recorridos en tercera");
        kmTercera=sc.nextFloat();
        totKm=kmPrimera+kmSegunda+kmTercera;
        if(totKm>kmT){
            System.out.println("La cantidad total de kilometros debe ser igual a la distancia subiendo de "
            +"la ruta");
        }
        }while(totKm>kmT);
        kmPrimera*=0.03f;
        kmSegunda*=ConsumoBase*0.02f;
        kmTercera*=ConsumoBase*0.01f;
    }

}
