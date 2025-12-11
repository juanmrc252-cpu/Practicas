package Bloque_II_Semana_5.Ejercicio2;

public class CuentaBancaria {

    private String iban;
    private double saldo;
    private Cliente titular;

    public CuentaBancaria(String iban, double saldo, Cliente titular) {
        this.iban = iban;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getIban() { return iban; }
    public double getSaldo() { return saldo; }
    public Cliente getTitular() { return titular; }

    public void setSaldo(double saldo) { this.saldo = saldo; }

    @Override
    public String toString() {
        return "Cuenta IBAN=" + iban + ", saldo=" + saldo + ", titular=" + titular;
    }
}
