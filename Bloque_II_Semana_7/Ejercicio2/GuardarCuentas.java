package Bloque_II_Semana_7.Ejercicio2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GuardarCuentas {

    public static void main(String[] args) {
        List<CuentaBancaria> cuentas = new ArrayList<>();
        CuentaBancaria c1 = new CuentaBancaria("ES001", 1000, "Juan Miguel");
        c1.agregarMovimiento(new Movimiento("Ingreso", 1000));
        CuentaBancaria c2 = new CuentaBancaria("ES002", 2000, "Javier Puerto");
        c2.agregarMovimiento(new Movimiento("Ingreso", 2000));

        cuentas.add(c1);
        cuentas.add(c2);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cuentas.dat"))) {
            oos.writeObject(cuentas);
            System.out.println("Cuentas guardadas correctamente en cuentas.dat");
        } catch (IOException e) {
            System.out.println("Error al guardar cuentas: " + e.getMessage());
        }
    }
}
