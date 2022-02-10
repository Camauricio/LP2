import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2D2App {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
        frame.setVisible(true);
	frame.getContentPane().setBackground(Color.gray);
		
    }	
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(350, 350);

	
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

       g2d.setPaint(Color.black);
      		g2d.drawOval(84,34,160,220);
      		g2d.fillOval(84,34,160,220);

	int xpoints[] = { 66,262, 164};
	int ypoints[] = { 104, 104, 262};
	int npoints = 3;
	
	g2d.setPaint(Color.orange);
		g2d.drawPolygon(xpoints, ypoints, npoints);
      		g2d.fillPolygon(xpoints, ypoints, npoints);

        g2d.setPaint(Color.black);
      		g2d.drawOval(44,44,120,120);
      		g2d.fillOval(44,44,120,120);
        g2d.setPaint(Color.black);
      		g2d.drawOval(164,44,120,120);
      		g2d.fillOval(164,44,120,120);

        g2d.setPaint(Color.white);
		g2d.drawOval(66,66,60,80);
      		g2d.fillOval(66,66,60,80);
	g2d.setPaint(Color.white);
		g2d.drawOval(204,66,60,80);
      		g2d.fillOval(204,66,60,80);

        g2d.setPaint(Color.orange);
		g2d.drawOval(96,96,30,40);
      		g2d.fillOval(96,96,30,40);
	g2d.setPaint(Color.orange);
		g2d.drawOval(204,96,30,40);
      		g2d.fillOval(204,96,30,40);

	Font font = new Font( "Serif", Font.BOLD, 100 );
	g.setColor(Color.black);
	g2d.setFont(font);
	g2d.drawString("crow",65,320);
	
	
	    
    }
}