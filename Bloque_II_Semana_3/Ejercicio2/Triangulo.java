package Ejercicio2;
public class Triangulo extends Figura {

    public Triangulo(String color) {
        super(color, "Triángulo");
    }
    @Override
    public void dibujar() {
        System.out.println("Dibujando un " + getNombre() + " de color " + getColor());
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /____\\");
    }
}
