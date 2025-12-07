package Ejercicio1;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
               JFrame ventana = new JFrame("Dibujo");
        ventana.setSize(300, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(new PanelDibujo());
        ventana.setVisible(true);
    }
}
