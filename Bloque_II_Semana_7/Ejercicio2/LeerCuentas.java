package Bloque_II_Semana_7.Ejercicio2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.List;

public class LeerCuentas {

    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cuentas.dat"))) {

            List<CuentaBancaria> cuentas = (List<CuentaBancaria>) ois.readObject();

            System.out.println("Cuentas recuperadas:");
            for (CuentaBancaria c : cuentas) {
                System.out.println(c);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada: " + e.getMessage());
        }
    }
}
