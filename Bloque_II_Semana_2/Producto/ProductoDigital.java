package Producto;
import java.util.UUID; //Con UUID podemos generar identificadores únicos, por lo que lo usaremos para lo de la licencia
public class ProductoDigital extends Producto {
    public ProductoDigital(String nombre, double precio) {
        super(nombre, precio);
    }
    public String generarLicencia() {
        return UUID.randomUUID().toString();
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Licencia generada: " + generarLicencia());
    }
}