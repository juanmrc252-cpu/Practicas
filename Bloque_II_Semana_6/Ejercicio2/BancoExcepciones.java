package Bloque_II_Semana_6.Ejercicio2;

public class BancoExcepciones {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Juan Pérez", "12345678A", "juan@mail.com");
        CuentaBancaria cuenta = new CuentaBancaria("ES00-111", 500, c1);

        try {
            System.out.println("Saldo inicial: " + cuenta.getSaldo());

            // Intentamos ingresar una cantidad negativa
            cuenta.ingresar(-100);
        } catch (OperacionInvalidaException e) {
            System.out.println("Error al ingresar dinero: " + e.getMessage());
        }

        try {
            // Intentamos retirar más del saldo
            cuenta.retirar(600);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error al retirar dinero: " + e.getMessage());
        } catch (OperacionInvalidaException e) {
            System.out.println("Error en la operación: " + e.getMessage());
        }

        try {
            // Retiro válido
            cuenta.retirar(200);
            System.out.println("Retiro exitoso. Nuevo saldo: " + cuenta.getSaldo());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
