package OperacionesBancarias;

public class Deposito extends OperacionBancaria {
    private double cantidad;

    

    public Deposito(double saldo, String usuario, double cantidad) {
        super(usuario, saldo);
        this.cantidad = cantidad;
    }
    

    public void introducirSaldo(double cantidad) {
        setSaldo(getSaldo() + cantidad);
    }

    public void retirarSaldo(double cantidad) {
        setSaldo(getSaldo() - cantidad);
    }

  
}
