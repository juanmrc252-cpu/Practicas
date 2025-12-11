package Bloque_II_Semana_6.Ejercicio2;

/**
 * Representa una cuenta bancaria genérica con operaciones de ingreso y retiro.
 */
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

    /**
     * Retira una cantidad de la cuenta.
     * 
     * @param cantidad Cantidad a retirar
     * @throws SaldoInsuficienteException si el saldo es menor que la cantidad
     * @throws OperacionInvalidaException si la cantidad es negativa o cero
     */
    public void retirar(double cantidad) throws SaldoInsuficienteException, OperacionInvalidaException {
        if (cantidad <= 0) {
            throw new OperacionInvalidaException("La cantidad a retirar debe ser positiva.");
        }
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Disponible: " + saldo);
        }
        saldo -= cantidad;
    }

    /**
     * Ingresa una cantidad en la cuenta.
     * 
     * @param cantidad Cantidad a ingresar
     * @throws OperacionInvalidaException si la cantidad es negativa o cero
     */
    public void ingresar(double cantidad) throws OperacionInvalidaException {
        if (cantidad <= 0) {
            throw new OperacionInvalidaException("La cantidad a ingresar debe ser positiva.");
        }
        saldo += cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta IBAN=" + iban + ", saldo=" + saldo + ", titular=" + titular;
    }
}
