package Bloque_II_Semana_4.Ejercicio2;
import java.awt.Color;
import java.awt.Graphics;

public class Linea extends Figura implements Dibujable, Transformable {

    private int x2, y2;
    private Color color;

    public Linea(int x1, int y1, int x2, int y2, Color color) {
        super(x1, y1);
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.drawLine(x, y, x2, y2);
    }

    @Override
    public void escalar(double factor) {
        x2 = x + (int)((x2 - x) * factor);
        y2 = y + (int)((y2 - y) * factor);
    }

    @Override
    public void rotar(double grados) {
        double rad = Math.toRadians(grados);
        int dx = x2 - x;
        int dy = y2 - y;
        int nx = (int)(dx * Math.cos(rad) - dy * Math.sin(rad));
        int ny = (int)(dx * Math.sin(rad) + dy * Math.cos(rad));
        x2 = x + nx;
        y2 = y + ny;
    }
}

