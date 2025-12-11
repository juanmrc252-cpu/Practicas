package Bloque_II_Semana_4.Ejercicio2;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo extends Figura implements Dibujable, Transformable {

    private int radio;
    private Color colorRelleno, colorBorde;
    private double angulo = 0;

    public Circulo(int x, int y, int radio, Color colorRelleno, Color colorBorde) {
        super(x, y);
        this.radio = radio;
        this.colorRelleno = colorRelleno;
        this.colorBorde = colorBorde;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(colorRelleno);
        g.fillOval(x - radio, y - radio, radio * 2, radio * 2);
        g.setColor(colorBorde);
        g.drawOval(x - radio, y - radio, radio * 2, radio * 2);
    }

    @Override
    public void escalar(double factor) {
        radio = (int)(radio * factor);
    }

    @Override
    public void rotar(double grados) {
        // El círculo no cambia al rotar
    }
}
