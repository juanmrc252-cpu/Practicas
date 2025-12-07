package Ejercicio3;
import java.awt.Color;

import javax.swing.JPanel;

public class Figura extends JPanel{
    public Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Figura(Color color) {
        this.color = color;
    }
}

