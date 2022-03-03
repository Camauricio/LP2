import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PaintAppOval {
    public static void main (String[] args) {
        PaintFrame frame = new PaintFrame();
        frame.setVisible(true);
    }
}

class PaintFrame extends JFrame {
    Oval o1;
    Oval o2;
    Oval o3;
    Oval o4;

    PaintFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Painting Figures");
        this.setSize(350, 350);
        this.o1 = new Oval(50,50, 30,250, Color.GREEN, Color.YELLOW);
        this.o2 = new Oval(280,15,50,50, Color.BLUE, Color.RED);
        this.o3 = new Oval(150,150,10,90, Color.GRAY, Color.WHITE);
        this.o4 = new Oval(190,180,120,40, Color.BLACK, Color.GREEN);
    }

    public void paint (Graphics g) {
        super.paint(g);

        this.o1.paint(g);
	this.o2.paint(g);
	this.o3.paint(g);
	this.o4.paint(g);
    }
}

class Oval {
    int x, y;
    int w, h;
    Color FillColor;
    Color BoardColor;

    Oval (int x, int y, int w, int h, Color FillColor, Color BoardColor) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
 	this.FillColor = FillColor;
        this.BoardColor = BoardColor;
    }
        void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
	g2d.setColor(this.BoardColor);
	g2d.fillOval(this.x,this.y, this.w,this.h);
	g2d.setColor(this.FillColor);
        g2d.drawOval(this.x,this.y, this.w,this.h);
    }
}