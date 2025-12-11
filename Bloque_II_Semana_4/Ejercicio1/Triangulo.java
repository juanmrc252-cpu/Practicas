package Bloque_II_Semana_4.Ejercicio1;

/*Creamos un triángulo con escalar y rotar.*/
public class Triangulo implements Transformable {

    private double lado1;
    private double lado2;
    private double lado3;
    private double angulo;


    public Triangulo(double l1, double l2, double l3) {
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
        this.angulo = 0;
    }

// Modificamos escalar
    @Override
    public void escalar(double factor) {
        lado1 = factor*lado1;
        lado2 = factor*lado2;
        lado3 = factor*lado3;

        System.out.println("Escalando triángulo por factor " + factor);
        System.out.println("Nuevos lados: " + lado1 + ", " + lado2 + ", " + lado3);
    }

    //Modificamos rotar
    @Override
    public void rotar(double grados) {
        angulo = grados+angulo;

        System.out.println("Rotando triángulo " + grados + " grados");
        System.out.println("Ángulo actual: " + angulo);
    }

}
