package Bloque_II_Semana_7.Ejercicio3;

/**
 * Excepción personalizada para operaciones bancarias inválidas.
 */
public class ExcepcionBancaria extends Exception {
    public ExcepcionBancaria(String mensaje) {
        super(mensaje);
    }
}
