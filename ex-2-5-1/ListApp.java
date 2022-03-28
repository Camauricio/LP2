import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

class ListApp {
    public static void main (String[] args) {
        ListFrame frame = new ListFrame();
        frame.setVisible(true);
    }
}

class ListFrame extends JFrame {
    ArrayList<Rects> rs = new ArrayList<Rects>();
    ArrayList<Ovals> os = new ArrayList<Ovals>();
    Random rand = new Random();

    ListFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );

        this.addKeyListener (
            new KeyAdapter() {
                public void keyPressed (KeyEvent evt) {
                    if (evt.getKeyChar() == 'r') {
                        int x = rand.nextInt(350);
                        int y = rand.nextInt(350);
                        int w = rand.nextInt(50);
                        int h = rand.nextInt(50);
                        rs.add(new Rects(x,y, w,h));
                        repaint();  // outer.repaint()
                    }
 			if (evt.getKeyChar() == 'e') {
                        int x = rand.nextInt(350);
                        int y = rand.nextInt(550);
                        int w = rand.nextInt(150);
                        int h = rand.nextInt(250);
                        os.add(new Ovals(x,y, w,h));
                        repaint();
                    }
               }
	    }
        );

        this.setTitle("Lista de Formas");
        this.setSize(350, 350);
    }

    public void paint (Graphics g) {
        super.paint(g);
        for (Rects r: this.rs) {
            r.paint(g);
        }
	for (Ovals e: this.os) {
            e.paint(g);
	}
    }
}

class Rects {
    int x, y;
    int w, h;

    Rects (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(this.x,this.y, this.w,this.h);
    }
}

class Ovals {
    int x, y;
    int w, h;

    Ovals (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    void print () {
        System.out.format("Elipse de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    void paint (Graphics g) {
         Graphics2D g2d = (Graphics2D) g;
	 g2d.drawOval(this.x,this.y, this.w,this.h);
    }
}
