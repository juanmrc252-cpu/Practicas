package Bloque_II_Semana_7.Ejercicio3;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Representa un movimiento en una cuenta bancaria.
 */
public class Movimiento implements Serializable {
    private static final long serialVersionUID = 1L;

    private LocalDateTime fecha;
    private double cantidad;
    private String tipo; // "Ingreso" o "Retirada"

    public Movimiento(double cantidad, String tipo) {
        this.fecha = LocalDateTime.now();
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return tipo + " de " + cantidad + " € el " + fecha.format(f);
    }
}
