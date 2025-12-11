package Bloque_II_Semana_7.Ejercicio2;

import java.io.Serializable;


public class Movimiento implements Serializable {
    private static final long serialVersionUID = 1L;

    private String tipo;
    private double cantidad;

    public Movimiento(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getTipo() { return tipo; }
    public double getCantidad() { return cantidad; }

    @Override
    public String toString() {
        return tipo + ": " + cantidad;
    }
}


