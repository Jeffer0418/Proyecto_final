
package paquete1;

import java.util.Scanner;

public class Vehiculo {
    float consumoBase, valorPasaje, valorPeaje, totPasaje;
    int cupoDisponible;
    public Vehiculo(float consumoBase, float valorPasaje, float valorPeaje, float totPasaje, int cupoDisponible) {
        this.consumoBase = consumoBase;
        this.valorPasaje = valorPasaje;
        this.valorPeaje = valorPeaje;
        this.totPasaje = totPasaje;
        this.cupoDisponible = cupoDisponible;
    } 
    public Vehiculo(){}
    Scanner sc = new Scanner(System.in);
    public float calcularConsumo(float consumoBase, int kmG,float distanciaIda ) {
       
        consumoBase = (16000 / kmG) * kmT;
        return consumoBase;
    }
    public float calcularCostoPeaje(float valorPeaje) {
        valorPeaje = 0;
        float totPeaje = valorPeaje * 2;
        return totPeaje;
    }
    public float calcularValorPasaje(float valorPasaje, int cupoDisponible) {
        totPasaje = valorPasaje * cupoDisponible;
        return totPasaje;
    }
    public float calcularConsumoSubiendo(int cupoDisponible, float consumoBase, float distanciaIda){
         float kmPrimera, kmSegunda, kmTercera, totKm=0,totConsumoMarcha=0;
        do{
        System.out.println("Ingrese la cantidad de kilometros recorridos en primera");
        kmPrimera=sc.nextFloat();
        System.out.println("Ingrese la cantidad de kilometros recorridos en segunda");
        kmSegunda=sc.nextFloat();
        System.out.println("Ingrese la cantidad de kilometros recorridos en tercera");
        kmTercera=sc.nextFloat();
        totKm=kmPrimera+kmSegunda+kmTercera;
        if(totKm>kmT){
            System.out.println("La cantidad total de kilometros no puede ser mayor a la distancia subiendo de"
            +"la ruta");
        }
        }while(totKm>distanciaIda);
        float consumoPrimera=(consumoBase*kmPrimera)*0.03f;
        float consumoSegunda=(consumoBase*kmSegunda)*0.02f;
        float consumoTercera=(consumoBase*kmTercera)*0.01f;
        totConsumoMarcha=consumoPrimera+consumoSegunda+consumoTercera;
        return totConsumoMarcha;
    }
} 
