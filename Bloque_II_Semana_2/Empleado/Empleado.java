package Empleado;

public class Empleado {
    public String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(double retenciones, double cotizaciones){
        return salarioBase - retenciones - cotizaciones;
    }
}
