package Ejercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Dibujable> figuras = new ArrayList<>();

        figuras.add(new Triangulo("Rojo"));
        figuras.add(new Cuadrado("Azul"));
        figuras.add(new Elipse("Verde"));

        for (Dibujable figura : figuras) {
            figura.dibujar();
            System.out.println();
        }
    }
}
