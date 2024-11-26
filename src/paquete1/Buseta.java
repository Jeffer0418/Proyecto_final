public class Buseta{
public float consumoMarchas (float primera, float segunda, float tercera, int pasajeros) {
    float incrementoPasajeros = 1 + (pasajeros * 0.04);
    float consumoPrimera = (primera * consumoBase) * incrementoPasajeros * (1 + 0.03);
    float consumoSegunda = (segunda * consumoBase) * incrementoPasajeros * (1 + 0.02);
    float consumoTercera = (tercera * consumoBase) * incrementoPasajeros * (1 + 0.01);
    return consumoPrimera + consumoSegunda + consumoTercera;
}
}