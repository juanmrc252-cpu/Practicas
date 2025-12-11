package Bloque_II_Semana_7.Ejercicio3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Banco que gestiona clientes y cuentas.
 */
public class Banco implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Cliente> clientes = new ArrayList<>();
    private List<CuentaBancaria> cuentas = new ArrayList<>();

    public void crearCliente(String nombre, String dni, String email) {
        Cliente c = new Cliente(nombre, dni, email);
        clientes.add(c);
    }

    public CuentaBancaria abrirCuenta(String iban, String dni) throws ExcepcionBancaria {
        Cliente titular = buscarClientePorDNI(dni);
        if (titular == null) throw new ExcepcionBancaria("Cliente no encontrado: " + dni);
        CuentaBancaria cuenta = new CuentaBancaria(iban, titular);
        cuentas.add(cuenta);
        return cuenta;
    }

    public Cliente buscarClientePorDNI(String dni) {
        for (Cliente c : clientes) {
            if (c.getDni().equalsIgnoreCase(dni)) return c;
        }
        return null;
    }

    public CuentaBancaria consultarCuentaPorDNI(String dni) {
        for (CuentaBancaria c : cuentas) {
            if (c.getTitular().getDni().equalsIgnoreCase(dni)) return c;
        }
        return null;
    }

    public List<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public void guardarDatos(String fichero) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(this);
            System.out.println("Datos del banco guardados en " + fichero);
        } catch (IOException e) {
            System.out.println("Error al guardar datos: " + e.getMessage());
        }
    }

    public static Banco cargarDatos(String fichero) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            return (Banco) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar datos: " + e.getMessage());
            return new Banco();
        }
    }
}
