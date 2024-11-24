package paquete1;

public class Taxi {
    
    public float calcularConsumo(int cupoDisponible, float ValorPasaje){
        float totValPasaje=0;
        Vehiculo vh=new Vehiculo();
        totValPasaje=vh.calcularValorPasaje(ValorPasaje, cupoDisponible);
        return totValPasaje;
    }
}