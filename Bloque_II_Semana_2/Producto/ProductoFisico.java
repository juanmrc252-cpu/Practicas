package Producto;

public class ProductoFisico extends Producto {

    private double peso; 

    public ProductoFisico(String nombre, double precio, double peso) {
        super(nombre, precio);
        this.peso = peso;
    }

    public double calcularEnvio() {
        return peso * 1.5; 
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Costo de envío: " + calcularEnvio());
    }
}