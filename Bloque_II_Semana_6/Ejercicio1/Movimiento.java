package Bloque_II_Semana_6.Ejercicio1;

import java.time.LocalDateTime;

/**
 * Representa un movimiento en una cuenta bancaria.
 * Puede ser un ingreso, retirada u otro tipo de transacción.
 * Se puede asociar a una cuenta mediante agregación.
 * 
 * @author Juan
 * @version 1.0
 */
public class Movimiento {

    private LocalDateTime fecha;
    private String tipo;
    private double cantidad;

    /**
     * Constructor de Movimiento.
     * 
     * @param fecha Fecha y hora del movimiento
     * @param tipo Tipo de movimiento (Ingreso, Retirada, etc.)
     * @param cantidad Cantidad del movimiento
     */
    public Movimiento(LocalDateTime fecha, String tipo, double cantidad) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    /**
     * Devuelve la fecha del movimiento.
     * 
     * @return fecha del movimiento
     */
    public LocalDateTime getFecha() { return fecha; }

    /**
     * Devuelve el tipo de movimiento.
     * 
     * @return tipo de movimiento
     */
    public String getTipo() { return tipo; }

    /**
     * Devuelve la cantidad del movimiento.
     * 
     * @return cantidad del movimiento
     */
    public double getCantidad() { return cantidad; }

    @Override
    public String toString() {
        return tipo + " de " + cantidad + " el " + fecha;
    }
}
