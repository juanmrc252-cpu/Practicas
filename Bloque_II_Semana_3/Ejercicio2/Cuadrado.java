package Ejercicio2;

public class Cuadrado extends Figura {

    public Cuadrado(String color) {
        super(color, "Cuadrado");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un " + getNombre() + " de color " + getColor());  //No sabía exactamente si lo que se pide es
        System.out.println(" ______");                                               //dibujarlo o representarlo así que lo he representado
        System.out.println("|      |");                                              //porque de todas formas en el ejercicio 3 pide dibujar todo
        System.out.println("|______|");
    }
}
