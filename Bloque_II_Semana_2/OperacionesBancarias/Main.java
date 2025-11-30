package OperacionBancaria;

public class Main {
    public static void main(String[] args) {

// Crear cuentas 
        Deposito cuentaJuan = new Deposito(1000, "Juan", 0);
        OperacionBancaria cuentaAna = new OperacionBancaria("Ana", 500);
// Mostrar saldo 
        cuentaJuan.ejecutar(); // Hola Juan tu saldo es: 1000.0
// Depositar 
        cuentaJuan.introducirSaldo(200);
        cuentaJuan.ejecutar(); // Hola Juan tu saldo es: 1200.0
// Transferir
        cuentaJuan.transferenciaSaldo(200, cuentaAna);
        System.out.println("Se ha retirado de tu cuenta 200.0 y se ha añadido a " + cuentaAna);
// Retirar 
        cuentaJuan.retirarSaldo(100);
        cuentaJuan.ejecutar(); 
    }
}

