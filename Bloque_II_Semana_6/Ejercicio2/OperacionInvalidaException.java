package Bloque_II_Semana_6.Ejercicio2;

/**
 * Excepción lanzada cuando se realiza una operación bancaria inválida,
 * por ejemplo, ingresar una cantidad negativa.
 */
public class OperacionInvalidaException extends Exception {

    public OperacionInvalidaException(String mensaje) {
        super(mensaje);
    }
}

