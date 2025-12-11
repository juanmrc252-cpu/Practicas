package Bloque_II_Semana_6.Ejercicio2;

/**
 * Excepción lanzada cuando se intenta retirar más dinero del disponible en la cuenta.
 */
public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
