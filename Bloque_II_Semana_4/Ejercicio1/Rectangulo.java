package Bloque_II_Semana_4.Ejercicio1;
/*Creamos un rectángulo con escalar y rotar.*/
public class Rectangulo implements Transformable{
    private double ancho;
    private double alto;
    private double angulo;

    public Rectangulo(double ancho,double alto,double angulo) {
        this.ancho = ancho;
        this.alto = alto;
        this.angulo = angulo;
    }
// Modificamos escalar
    @Override
        public void escalar(double factor){
            System.out.println("Valores originales del Rectángulo: ");
            System.out.println("Ancho: " + ancho);
            System.out.println("Alto: "+ alto);
            System.out.println("Valores tras el cambio: ");
            System.out.println("Ancho: " + ancho*factor);
            System.out.println("Alto: "+ alto*factor);
        }
        //Modificamos rotar
        @Override
        public void rotar(double grados){
            System.out.println("Valores originales del Rectángulo: ");
            System.out.println("Grados: " + angulo);
            System.out.println("Valores tras el cambio: ");
            double cambio=grados+angulo;
            System.out.println("Alto: "+ cambio);
        }
}
