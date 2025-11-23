public class Persona {
    String nombre = "Juan";
    int edad;
    String ciudad = "Madrid";

    void saludar() {
        System.out.println("Hola, soy " + nombre + " de " + ciudad);
    }

    public Persona() {
        saludar();
    }

    public static void main(String[] args) {
        Persona p = new Persona();
        p.saludar();
    }
}
