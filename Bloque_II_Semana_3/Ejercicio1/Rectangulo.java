package Ejercicio1;
import java.awt.Color;
import java.awt.Graphics;

class Rectangulo implements Dibujable {
    private int ancho, alto,x,y;
    private Color colorFondo,colorTrazo;

    public Rectangulo(int x, int y, int ancho, int alto, Color colorFondo, Color colorTrazo) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(colorFondo);
        g.fillRect(x, y, ancho, alto); // relleno
        g.setColor(colorTrazo);
        g.drawRect(x, y, ancho, alto); // borde
}
}
