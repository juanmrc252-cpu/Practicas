package Bloque_II_Semana_5.Ejercicio2;

import java.util.ArrayList;

public class BancoHerencia {

    public static void main(String[] args) {
        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
        Cliente c1 = new Cliente("Juan Miguel", "12345678A", "juan@mail.com");
        Cliente c2 = new Cliente("Javier Puerto", "87654321B", "ana@mail.com");
        cuentas.add(new CuentaAhorro("ES00-111", 1500, c1, 1300));
        cuentas.add(new CuentaNomina("ES00-222", 500, c2, "Empresa XYZ"));
        for (CuentaBancaria cuenta : cuentas) {
            System.out.println("\nProcesando: " + cuenta.getClass().getSimpleName());
            System.out.println(cuenta);
            if (cuenta instanceof CuentaAhorro ahorro) {
                double interes = ahorro.calcularInteres();
                System.out.println("Interés generado: " + interes);
            }
            if (cuenta instanceof CuentaNomina nomina) {
                System.out.println("Recibiendo nómina de 1200€...");
                nomina.recibirNomina(1200);
                System.out.println("Nuevo saldo: " + nomina.getSaldo());
            }
        }
    }
}
