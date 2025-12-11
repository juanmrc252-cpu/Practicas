package Bloque_II_Semana_7.Ejercicio1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GuardarClientes {

    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Juan Miguel", "12345678A", "juan@mail.com"));
        clientes.add(new Cliente("Javier Puerto", "87654321B", "javier@mail.com"));
        String nombreFichero = "clientes.txt";
        try (FileWriter writer = new FileWriter(nombreFichero)) {

            for (Cliente c : clientes) {
                writer.write(c.toString() + "\n");
            }
            System.out.println("Datos guardados correctamente en " + nombreFichero);
        } catch (IOException e) {
            System.out.println("Error al escribir el fichero: " + e.getMessage());
        }
    }
}

