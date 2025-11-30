package Empleado;

public class EmpleadoPorHoras extends Empleado{
    private double horasExtras;
    private double nocturnidad;

    public EmpleadoPorHoras(String nombre, double salarioBase, double horasExtras, double nocturnidad){
        super(nombre, salarioBase);
        this.horasExtras = horasExtras;
        this.nocturnidad = nocturnidad;
    }

    @Override
    public double calcularSalario(double retenciones, double cotizaciones){
        double salarioGeneral = super.calcularSalario(retenciones, cotizaciones);
        return salarioGeneral + horasExtras + nocturnidad;
    }
}
