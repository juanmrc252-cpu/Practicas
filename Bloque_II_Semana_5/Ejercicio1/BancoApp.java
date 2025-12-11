package Bloque_II_Semana_5.Ejercicio1;

import java.util.ArrayList;

public class BancoApp {

    public static void main(String[] args) {
        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
        Cliente c1 = new Cliente("Juan Miguel", "12345678A", "juanmiguel@mail.com");
        Cliente c2 = new Cliente("Javier Puerto", "87654321B", "javier@mail.com");
        cuentas.add(new CuentaBancaria("ES001122334455", 1200.0, c1));
        cuentas.add(new CuentaBancaria("ES009988776655", 2500.0, c2));
        String dniBuscado = "12345678A";
        CuentaBancaria cuentaEncontrada = buscarCuentaPorDni(cuentas, dniBuscado);
        if (cuentaEncontrada != null) {
            System.out.println("Cuenta encontrada:");
            System.out.println(cuentaEncontrada);
        } else {
            System.out.println("No existe una cuenta con el DNI: " + dniBuscado);
        }
    }
    public static CuentaBancaria buscarCuentaPorDni(ArrayList<CuentaBancaria> lista, String dni) {
        for (CuentaBancaria c : lista) {
            if (c.getTitular().getDni().equalsIgnoreCase(dni)) {
                return c;
            }
        }
        return null;
    }
}
