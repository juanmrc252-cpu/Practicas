package Bloque_II_Semana_4.Ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void transformarFiguras(List<Transformable> figuras, double factor, double grados) {
            for (Transformable f : figuras) {
                f.escalar(factor);
                f.rotar(grados);
            }
        }
    public static void main(String[] args) {


        List<Dibujable> figuras = new ArrayList<>();
        List<Transformable> transformables = new ArrayList<>();

    

        Circulo c = new Circulo(200, 200, 50, Color.CYAN, Color.BLUE);
        Poligono p = new Poligono(400, 200, 50, 6, Color.MAGENTA, Color.BLACK);
        Linea l = new Linea(100, 400, 200, 500, Color.RED);

        figuras.add(c); figuras.add(p); figuras.add(l);
        transformables.add(c); transformables.add(p); transformables.add(l);

        // Crear ventana
        JFrame ventana = new JFrame("Sistema de Figuras Dinámicas");
        ventana.setSize(600, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(new PanelDibujo(figuras));
        ventana.setVisible(true);

        // Aplicar transformaciones (ejemplo)
        transformarFiguras(transformables, 1.5, 45);

        // Redibujar después de transformar
        ventana.repaint();
    }
}

