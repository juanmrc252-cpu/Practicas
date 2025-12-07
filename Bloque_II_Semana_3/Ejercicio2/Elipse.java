package Ejercicio2;

public class Elipse extends Figura {

    public Elipse(String color) {
        super(color, "Elipse");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando una " + getNombre() + " de color " + getColor());
        System.out.println("  ____");
        System.out.println(" /    \\");
        System.out.println(" \\____/");
    }
}
