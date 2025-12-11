package bin;

public abstract interface Vehiculo {
    int PRECIO_BASE = 10000;
    double IVA = 0.21;

    double calcularPrecio();
}


