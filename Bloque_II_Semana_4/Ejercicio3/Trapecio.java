package Bloque_II_Semana_4.Ejercicio3;

import java.awt.Color;
import java.awt.Graphics;

public class Trapecio extends Figura {

    private int baseMayor, baseMenor, altura;

    public Trapecio(int x, int y, int baseMayor, int baseMenor, int altura, Color colorRelleno, Color colorBorde) {
        super(x, y, colorRelleno, colorBorde);
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public void dibujar(Graphics g) {
        int[] px = new int[4];
        int[] py = new int[4];
        int diff = (baseMayor - baseMenor) / 2;
        px[0] = x;              py[0] = y;
        px[1] = x + baseMayor;  py[1] = y;
        px[2] = x + baseMayor - diff; py[2] = y + altura;
        px[3] = x + diff;       py[3] = y + altura;

        g.setColor(colorRelleno);
        g.fillPolygon(px, py, 4);
        g.setColor(colorBorde);
        g.drawPolygon(px, py, 4);
    }
}
