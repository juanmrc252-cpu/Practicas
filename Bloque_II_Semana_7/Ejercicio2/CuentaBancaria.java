package Bloque_II_Semana_7.Ejercicio2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria implements Serializable {
    private static final long serialVersionUID = 1L;

    private String iban;
    private double saldo;
    private String titular; // Para simplificar, podemos usar solo el nombre
    private List<Movimiento> movimientos = new ArrayList<>();

    public CuentaBancaria(String iban, double saldo, String titular) {
        this.iban = iban;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void agregarMovimiento(Movimiento m) {
        movimientos.add(m);
    }

    public String getIban() { return iban; }
    public double getSaldo() { return saldo; }
    public String getTitular() { return titular; }
    public List<Movimiento> getMovimientos() { return movimientos; }

    @Override
    public String toString() {
        return "Cuenta: " + iban + ", Titular: " + titular + ", Saldo: " + saldo + ", Movimientos: " + movimientos;
    }
}