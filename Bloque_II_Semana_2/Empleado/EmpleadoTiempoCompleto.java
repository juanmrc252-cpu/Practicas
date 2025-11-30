package Empleado;

public class EmpleadoTiempoCompleto extends Empleado{
    private double pagasExtras;

    public EmpleadoTiempoCompleto(String nombre, double salarioBase, double pagasExtras){
        super(nombre, salarioBase);
        this.pagasExtras = pagasExtras;
    }

    @Override
    public double calcularSalario(double retenciones, double cotizaciones){
        double salarioGeneral = super.calcularSalario(retenciones, cotizaciones);
        return salarioGeneral + pagasExtras;
    }
}


