package Ejercicio3;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.List;

public class PanelDibujo extends JPanel {

    private List<Dibujable> figuras;

    public PanelDibujo(List<Dibujable> figuras) {
        this.figuras = figuras;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Dibujable f : figuras) {
            f.dibujar(g);
        }
    }
}
