package Bloque_II_Semana_4.Ejercicio3;

import java.awt.Color;
import java.awt.Graphics;

//He reutilizado el codigo de poligono para el caso del hexagono 
public class Hexagono extends Figura {

    private int radio;

    public Hexagono(int x, int y, int radio, Color colorRelleno, Color colorBorde) {
        super(x, y, colorRelleno, colorBorde);
        this.radio = radio;
    }

    @Override
    public void dibujar(Graphics g) {
        int[] px = new int[6];
        int[] py = new int[6];

        for (int i = 0; i < 6; i++) {
            double a = Math.toRadians(i * 60);
            px[i] = (int) (x + radio * Math.cos(a));
            py[i] = (int) (y + radio * Math.sin(a));
        }

        g.setColor(colorRelleno);
        g.fillPolygon(px, py, 6);
        g.setColor(colorBorde);
        g.drawPolygon(px, py, 6);
    }
}
