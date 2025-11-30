package OperacionBancaria;

public class OperacionBancaria {
    private double saldo;
    public String usuario;

    public OperacionBancaria(String usuario, double saldo) {
        this.usuario = usuario;
        this.saldo = saldo;
    }

    public void ejecutar() {
        System.out.println("Hola " + usuario + " tu saldo es: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void transferenciaSaldo(double cantidad, OperacionBancaria destino) {
        setSaldo(getSaldo() - cantidad);                      
        destino.setSaldo(destino.getSaldo() + cantidad); 
             System.out.println("Se ha retirado de tu cuenta " + cantidad + "€" + " y se han añadido a " + destino);
    }

@Override
public String toString() {
    return "Usuario: " + usuario + ", Saldo: " + saldo;
}

}
