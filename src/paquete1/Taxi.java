package paquete1;
public class Taxi {
    public float calcularConsumoBajando(int distancia, int pasajeros) {
        float consumoBase = consumoBase * distancia;
        float consumoAdicional = consumoBase * 0.02f * pasajeros;
        return consumoBase + consumoAdicional;
    }
        
    }
