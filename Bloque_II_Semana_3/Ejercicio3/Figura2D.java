package Ejercicio3;
import java.awt.Color;
import java.awt.Graphics;

public abstract class Figura2D extends Figura implements Dibujable {
    protected int x, y;

    public Figura2D(int x, int y, Color color) {
        super(color);
        this.x = x;
        this.y = y;
    }
}




class Pentagono extends Figura2D {

    private int radio;

    public Pentagono(int x, int y, int radio, Color color) {
        super(x, y, color);
        this.radio = radio;
    }

    @Override
    public void dibujar(Graphics g) {
        int puntos = 5;
        int[] px = new int[puntos];
        int[] py = new int[puntos];
        double anguloInicial = -90;

        for (int i = 0; i < puntos; i++) {
            double angulo = Math.toRadians(anguloInicial + i * 360.0 / puntos);
            px[i] = (int) (x + radio * Math.cos(angulo));
            py[i] = (int) (y + radio * Math.sin(angulo));
        }

        g.setColor(color);
        g.drawPolygon(px, py, puntos);
    }
}



