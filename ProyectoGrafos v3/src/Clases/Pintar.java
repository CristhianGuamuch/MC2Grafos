package Clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Pintar {

    public Pintar() {

    }

    public static void pintarCirculo(Graphics g, int x, int y, String n) {
        int r = 12;
        ((Graphics2D) g).setColor(Color.red);
        ((Graphics2D) g).setStroke(new BasicStroke(4));//leda el grosor al circulo        
        ((Graphics2D) g).fillOval(x-r/2, y-r/2, 2*r, 2*r);
        ((Graphics2D) g).setColor(Color.BLACK);
        ((Graphics2D) g).drawOval(x-r/2, y-r/2, 2*r, 2*r);

        ((Graphics2D) g).setColor(Color.black);
        Font fuente = new Font("Monospaced", Font.BOLD, 16);
        g.setFont(fuente);
        ((Graphics2D) g).drawString(n, x, y-10);

    }

    public static void pintarLinea(Graphics g, int x1, int y1, int x2, int y2, int tam) {
        int xAux = 0;
        int yAux = 0;
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        ((Graphics2D) g).setStroke(stroke);
        ((Graphics2D) g).drawLine(x1 + 10, y1 + 10, x2 + 10, y2 + 10);
        if (x1 <= x2) {
            xAux = ((x2 - x1) / 2) + x1;
        }
        if (x1 > x2) {
            xAux = ((x1 - x2) / 2) + x2;
        }
        if (y1 < y2) {
            yAux = ((y2 - y1) / 2) + y1;
        }
        if (y1 >= y2) {
            yAux = ((y1 - y2) / 2) + y2;
        }
        ((Graphics2D) g).drawString("", xAux, yAux);
    }

    public static void pintarCamino(Graphics g, int x1, int y1, int x2, int y2, Color color) {
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        ((Graphics2D) g).setStroke(stroke);
        g.setColor(color);
        g.drawLine(x1 + 10, y1 + 10, x2 + 10, y2 + 10);
    }

    public static void clickSobreNodo(Graphics g, int x, int y, String n, Color co) {
        int r = 12;
        ((Graphics2D) g).setColor(co);
        ((Graphics2D) g).setStroke(new BasicStroke(4));//leda el grosor al circulo        
        ((Graphics2D) g).fillOval(x-r/2, y-r/2, 2*r, 2*r);
        ((Graphics2D) g).setColor(Color.BLACK);
        ((Graphics2D) g).drawOval(x-r/2, y-r/2, 2*r, 2*r);

    }
}
