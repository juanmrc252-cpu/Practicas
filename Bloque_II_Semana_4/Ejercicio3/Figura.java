package Bloque_II_Semana_4.Ejercicio3;

import java.awt.Color;
import java.awt.Graphics;

//Clase base
public abstract class Figura implements Dibujable {
    protected int x, y;        // posición
    protected Color colorRelleno;
    protected Color colorBorde;

    public Figura(int x, int y, Color colorRelleno, Color colorBorde) {
        this.x = x;
        this.y = y;
        this.colorRelleno = colorRelleno;
        this.colorBorde = colorBorde;
    }
}
