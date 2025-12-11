package Bloque_II_Semana_7.Ejercicio3;

public class SistemaBancarioApp {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.crearCliente("Juan Miguel", "12345678A", "juan@mail.com");
        banco.crearCliente("Javier Puerto", "87654321B", "javier@mail.com");

        try {
            CuentaBancaria c1 = banco.abrirCuenta("ES001", "12345678A");
            CuentaBancaria c2 = banco.abrirCuenta("ES002", "87654321B");

            c1.ingresar(1000);
            c2.ingresar(2000);
            c1.retirar(200);

        } catch (ExcepcionBancaria e) {
            System.out.println("Error: " + e.getMessage());
        }

        Banco bancoRecuperado = Banco.cargarDatos("banco.dat");

        CuentaBancaria cuenta = bancoRecuperado.consultarCuentaPorDNI("12345678A");
        if (cuenta != null) {
            System.out.println("Cuenta recuperada: " + cuenta);
            System.out.println("Movimientos de la cuenta:");
            for (Movimiento m : cuenta.getMovimientos()) {
                System.out.println(m);
            }
        } else {
            System.out.println("Cuenta no encontrada.");
        }
        
    }
}
