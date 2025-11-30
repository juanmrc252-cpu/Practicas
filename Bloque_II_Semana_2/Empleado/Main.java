package Empleado;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        // Añadir empleados
        empleados.add(new EmpleadoTiempoCompleto("Juan", 1200, 200));
        empleados.add(new EmpleadoPorHoras("Ana", 1000, 50, 30));

        // Polimorfismo: cada objeto ejecuta su propia versión de calcularSalario()
        for (Empleado e : empleados) {
            double salario = e.calcularSalario(120, 50);
            System.out.println("Empleado: " + e.nombre + ", Salario neto: " + salario);
            System.out.println("------------------------");
        }
    }
}
