package figures;
import java.awt.*;

public class Ovals {
    int x, y;
    int w, h;
    Color bordColor , fillColor;

   public Ovals (int x, int y, int w, int h, Color bordColor , Color fillColor) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
	this.bordColor = bordColor;
        this.fillColor = fillColor;
    }
     
   public void print () {
	System.out.format( "Elipse com diâmetros de (%d,%d) na posicao (%d,%d).\n",
		this.w, this.h ,this.x ,this.y);
    }
   public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
	    g2d.setColor(this.bordColor);
	    g2d.drawOval(this.x,this.y, this.w,this.h);
	    g2d.setColor(this.fillColor);
	    g2d.fillOval(this.x,this.y, this.w,this.h);
	    
    }
}