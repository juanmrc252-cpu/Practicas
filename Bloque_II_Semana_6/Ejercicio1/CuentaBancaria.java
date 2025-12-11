package Bloque_II_Semana_6.Ejercicio1;

/**
 * Representa una cuenta bancaria genérica.
 * Contiene información sobre IBAN, saldo y titular.
 * Relación de composición: cada cuenta tiene un Cliente como titular.
 * 
 * @author Juan
 * @version 1.0
 */
public class CuentaBancaria {

    private String iban;
    private double saldo;
    private Cliente titular;

    /**
     * Constructor de CuentaBancaria.
     * 
     * @param iban IBAN de la cuenta
     * @param saldo Saldo inicial
     * @param titular Cliente titular de la cuenta
     */
    public CuentaBancaria(String iban, double saldo, Cliente titular) {
        this.iban = iban;
        this.saldo = saldo;
        this.titular = titular;
    }
    /**
     * Devuelve el IBAN de la cuenta.
     * 
     * @return IBAN de la cuenta
     */
    public String getIban() { return iban; }
    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return saldo de la cuenta
     */
    public double getSaldo() { return saldo; }
    /**
     * Devuelve el titular de la cuenta.
     * 
     * @return Cliente titular
     */
    public Cliente getTitular() { return titular; }
    /**
     * Actualiza el saldo de la cuenta.
     * 
     * @param saldo Nuevo saldo
     */
    public void setSaldo(double saldo) { this.saldo = saldo; }
    @Override
    public String toString() {
        return "Cuenta IBAN=" + iban + ", saldo=" + saldo + ", titular=" + titular;
    }
}

