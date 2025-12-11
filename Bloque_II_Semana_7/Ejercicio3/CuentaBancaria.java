package Bloque_II_Semana_7.Ejercicio3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa una cuenta bancaria.
 */
public class CuentaBancaria implements Serializable {
    private static final long serialVersionUID = 1L;

    private String iban;
    private double saldo;
    private Cliente titular;
    private List<Movimiento> movimientos = new ArrayList<>();

    public CuentaBancaria(String iban, Cliente titular) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void ingresar(double cantidad) throws ExcepcionBancaria {
        if (cantidad <= 0) throw new ExcepcionBancaria("Cantidad a ingresar debe ser positiva.");
        saldo += cantidad;
        movimientos.add(new Movimiento(cantidad, "Ingreso"));
    }

    public void retirar(double cantidad) throws ExcepcionBancaria {
        if (cantidad <= 0) throw new ExcepcionBancaria("Cantidad a retirar debe ser positiva.");
        if (cantidad > saldo) throw new ExcepcionBancaria("Saldo insuficiente.");
        saldo -= cantidad;
        movimientos.add(new Movimiento(cantidad, "Retirada"));
    }

    @Override
    public String toString() {
        return "Cuenta IBAN: " + iban + ", Titular: " + titular + ", Saldo: " + saldo + " €";
    }
}
