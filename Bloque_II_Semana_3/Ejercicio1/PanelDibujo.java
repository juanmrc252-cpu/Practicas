package Ejercicio1;
import javax.swing.*;
import java.awt.*;

public class PanelDibujo extends JPanel {

    private Circulo circulo;
    private Rectangulo rectangulo;
    public PanelDibujo() {
        circulo = new Circulo(50, 50, 40, Color.RED, Color.BLACK);
        rectangulo = new Rectangulo(60, 70, 50, 60, Color.WHITE, Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        circulo.dibujar(g);    
        rectangulo.dibujar(g);
    }
}
