package Ejercicio3;
import java.awt.Color;
import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Sistema de dibujo geométrico");
        ventana.setSize(600, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Lista de figuras dibujables
        List<Dibujable> figuras = new ArrayList<>();
        figuras.add(new Pentagono(300, 150, 100, Color.BLUE));
        figuras.add(new Esfera(150, 400, 50, Color.RED));
        figuras.add(new Cubo(400, 400, 0, 80, Color.GREEN));

        // Añadimos panel que dibuja todas las figuras
        ventana.add(new PanelDibujo(figuras));

        ventana.setVisible(true);
    }
}
