package Bloque_II_Semana_4.Ejercicio2;

import java.awt.Color;
import java.awt.Graphics;

public class Poligono extends Figura implements Dibujable, Transformable {

    private int lados, radio;
    private double angulo = 0;
    private Color colorRelleno, colorBorde;

    public Poligono(int x, int y, int radio, int lados, Color colorRelleno, Color colorBorde) {
        super(x, y);
        this.radio = radio;
        this.lados = lados;
        this.colorRelleno = colorRelleno;
        this.colorBorde = colorBorde;
    }

    @Override
    public void dibujar(Graphics g) {
        int[] px = new int[lados];
        int[] py = new int[lados];

        for (int i = 0; i < lados; i++) {
            double a = Math.toRadians(angulo + i * 360.0 / lados);
            px[i] = (int) (x + radio * Math.cos(a));
            py[i] = (int) (y + radio * Math.sin(a));
        }

        g.setColor(colorRelleno);
        g.fillPolygon(px, py, lados);
        g.setColor(colorBorde);
        g.drawPolygon(px, py, lados);
    }

    @Override
    public void escalar(double factor) {
        radio = (int)(radio * factor);
    }

    @Override
    public void rotar(double grados) {
        angulo = grados + angulo;
    }
}

