package Ejercicio1;
import java.awt.Color;
import java.awt.Graphics;

public class Circulo implements Dibujable {
    private int x, y, radio;
    private Color colorRelleno;
    private Color colorBorde;

    public Circulo(int x, int y, int radio, Color colorRelleno, Color colorBorde) {
        this.x = x;
        this.y = y;
        this.radio = radio;
        this.colorRelleno = colorRelleno;
        this.colorBorde = colorBorde;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(colorRelleno);
        g.fillOval(x, y, radio * 2, radio * 2);
        g.setColor(colorBorde);
        g.drawOval(x, y, radio * 2, radio * 2);
    }
}
