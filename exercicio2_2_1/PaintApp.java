import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PaintApp {
    public static void main (String[] args) {
        PaintFrame frame = new PaintFrame();
        frame.setVisible(true);
    }
}

class PaintFrame extends JFrame {
    Rect r1;
    Rect r2;
    Rect r3;
    Rect r4;

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
        this.r1 = new Rect(50,50, 30,250, Color.GREEN, Color.YELLOW);
        this.r2 = new Rect(280,15,50,50, Color.BLUE, Color.RED);
        this.r3 = new Rect(150,150,10,90, Color.GRAY, Color.WHITE);
        this.r4 = new Rect(190,180,120,40, Color.BLACK, Color.GREEN);
    }

    public void paint (Graphics g) {
        super.paint(g);

        this.r1.paint(g);
	this.r2.paint(g);
	this.r3.paint(g);
	this.r4.paint(g);
    }
}

class Rect {
    int x, y;
    int w, h;
    Color FillColor;
    Color BoardColor;

    Rect (int x, int y, int w, int h, Color FillColor, Color BoardColor) {
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
	g2d.fillRect(this.x,this.y, this.w,this.h);
	g2d.setColor(this.FillColor);
        g2d.drawRect(this.x,this.y, this.w,this.h);
    }
}