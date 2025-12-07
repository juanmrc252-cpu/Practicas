package Ejercicio3;
import java.awt.Color;
import java.awt.Graphics;

public abstract class Figura3D extends Figura implements Dibujable {
    protected int x, y, z;

    public Figura3D(int x, int y, int z, Color color) {
        super(color);
        this.x = x;
        this.y = y;
        this.z = z;
    }
}



class Cubo extends Figura3D {
    private int tamaño;
    public Cubo(int x, int y, int z, int tamaño, Color color) {
        super(x, y, z, color);
        this.tamaño = tamaño;
    }
    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);  // relleno
        g.fillRect(x, y, tamaño, tamaño);
        g.setColor(color);
        g.drawRect(x, y, tamaño, tamaño);
    }
}


class Esfera extends Figura3D {

    private int radio;

    public Esfera(int x, int y, int radio, Color color) {
        super(x, y, radio, color);
        this.radio = radio;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);  
        g.fillOval(x - radio, y - radio, radio * 2, radio * 2);
        g.setColor(color);
        g.drawOval(x - radio, y - radio, radio * 2, radio * 2);
    }
}

