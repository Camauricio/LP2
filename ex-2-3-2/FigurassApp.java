import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import figures.*;

class FigurassApp {
    public static void main (String[] args) {
        PackFrame frame = new PackFrame();
        frame.setVisible(true);
    }
}

class PackFrame extends JFrame {
    Rects r1;    Rects r2;
    Ovals o1;    Ovals o2;
    Arcoss a1;   Arcoss a2;
    


    PackFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Painting Figures");
        this.setSize(350, 350);
        this.r1 = new Rects(30,200,200,35,Color.BLUE,Color.yellow);
	this.o1 = new Ovals(180,20,100,250,Color.YELLOW, Color.RED);
	this.a1 = new Arcoss(60,60,120,120,45,270,Color.BLACK);
	this.r2 = new Rects(170,260,50,30,Color.MAGENTA, Color.blue);
	this.o2 = new Ovals(30,100,290,10,Color.BLUE,Color.GREEN);
	this.a2 = new Arcoss(60,60,50,50,90,130, Color.WHITE);
	
	     
    }

    public void paint (Graphics g) {

        super.paint(g);
        this.r1.paint(g);
 	this.o1.paint(g);
	this.a1.paint(g);
        this.r2.paint(g);
 	this.o2.paint(g);
	this.a2.paint(g);
	
	
	
    }
}