package figures;
import java.awt.*;

public class Oval extends Figure {
    int x, y;
    int w, h;

   public Oval (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
     
   public void print () {
	System.out.format( "Elipse com diâmetros de (%d,%d) na posicao (%d,%d).\n",
		this.w, this.h ,this.x ,this.y);
    }
   public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
	      g2d.setColor(new Color(10,200,160));
	      g2d.fillOval(this.x,this.y, this.w,this.h);
	      g2d.setColor(new Color(80,0,0));
              g2d.drawOval(this.x,this.y, this.w,this.h);
    }
}