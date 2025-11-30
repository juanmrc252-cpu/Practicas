package Producto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new ProductoFisico("Ordenador", 1000, 2.5));
        productos.add(new ProductoDigital("Antivirus", 30));

        // Polimorfismo: cada objeto ejecuta su propia versión de mostrarInfo()
        for (Producto p : productos) {
            p.mostrarInfo();
            System.out.println("------------------------");
        }
    }
}

