package paquete1;
public class Taxi {
     
        // Constructor sin el uso de super()
        public Taxi() {
            // Llamamos manualmente al constructor de la clase base
            Vehiculo vehiculoBase = new Vehiculo(1.0 / 50.0, 4); // Llamada explícita a la clase base
        }
    
        // Otros métodos siguen igual
        public double valorConsumoPasajerosExtra(double km, double pasajeros) {
            return 0;
        }
    
        public double consumoMarchas(double primera, double segunda, double tercera, int pasajeros) {
            double incrementoPasajeros = 1 + (pasajeros * 0.02);
    
            double consumoPrimera = (primera * consumoBase) * incrementoPasajeros * (1 + 0.03);
            double consumoSegunda = (segunda * consumoBase) * incrementoPasajeros * (1 + 0.02);
            double consumoTercera = (tercera * consumoBase) * incrementoPasajeros * (1 + 0.01);
    
            return consumoPrimera + consumoSegunda + consumoTercera;
        }
    
        public double calcularConsumoBajando(double distancia, int pasajeros) {
            double consumoBase = consumoPorKm * distancia;
            double consumoAdicional = consumoBase * 0.02 * pasajeros;
            return consumoBase + consumoAdicional;
        }
    
        public double calcularValorConsumo(double consumo) {
            return consumo * precioGalonGasolina;
        }
    }
    
}