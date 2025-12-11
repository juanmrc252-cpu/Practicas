package Bloque_II_Semana_4.Ejercicio3;

import java.awt.Color;
import java.awt.Graphics;

public class Estrella extends Figura {

    private int radio;

    public Estrella(int x, int y, int radio, Color colorRelleno, Color colorBorde) {
        super(x, y, colorRelleno, colorBorde);
        this.radio = radio;
    }

    @Override
    public void dibujar(Graphics g) {
        int[] px = new int[10];
        int[] py = new int[10];

        int r1 = radio;      // radio exterior
        int r2 = radio / 2;  // radio interior

        for (int i = 0; i < 10; i++) {
            double a = Math.toRadians(i * 36);
            int r = (i % 2 == 0) ? r1 : r2;  //Esto lo he buscado en internet porque no sabia hacerlo
            px[i] = (int) (x + r * Math.cos(a));
            py[i] = (int) (y + r * Math.sin(a));
        }

        g.setColor(colorRelleno);
        g.fillPolygon(px, py, 10);
        g.setColor(colorBorde);
        g.drawPolygon(px, py, 10);
    }
}
