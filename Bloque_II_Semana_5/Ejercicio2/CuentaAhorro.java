package Bloque_II_Semana_5.Ejercicio2;

public class CuentaAhorro extends CuentaBancaria {

    private double saldoMedio;   
    public CuentaAhorro(String iban, double saldo, Cliente titular, double saldoMedio) {
        super(iban, saldo, titular);
        this.saldoMedio = saldoMedio;
    }

    public double getSaldoMedio() {
        return saldoMedio;
    }

    public void setSaldoMedio(double saldoMedio) {
        this.saldoMedio = saldoMedio;
    }

    public double calcularInteres() {
        return saldoMedio * 0.02; 
    }

    @Override
    public String toString() {
        return "CuentaAhorro: " + super.toString() + ", saldo medio=" + saldoMedio;
    }
}
