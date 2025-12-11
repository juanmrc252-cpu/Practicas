package Bloque_II_Semana_4.Ejercicio2;


public abstract class Figura {
    protected int x, y; // posición de la figura

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Dibujamos la figura
    public abstract void dibujar(java.awt.Graphics g);
}
