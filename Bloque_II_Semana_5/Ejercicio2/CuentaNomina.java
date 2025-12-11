package Bloque_II_Semana_5.Ejercicio2;

public class CuentaNomina extends CuentaBancaria {

    private String empresa;

    public CuentaNomina(String iban, double saldo, Cliente titular, String empresa) {
        super(iban, saldo, titular);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void recibirNomina(double cantidad) {
        setSaldo(getSaldo() + cantidad);
    }

    @Override
    public String toString() {
        return "CuentaNomina: " + super.toString() + ", empresa=" + empresa;
    }
}
