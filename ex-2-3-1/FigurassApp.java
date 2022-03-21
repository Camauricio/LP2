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
        this.r1 = new Rects(150,100,100,10);
	this.o1 = new Ovals(90,190,220,30);
	this.a1 = new Arcoss(35,60,120,120,45,270);
	this.r2 = new Rects(140,280,100,250);
	this.o2 = new Ovals(30,250,290,10);
	this.a2 = new Arcoss(280,280,50,50,90,130);
	
	     
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