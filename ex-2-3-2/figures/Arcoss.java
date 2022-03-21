package figures ; 
import java.awt.*;

public class Arcoss {
    int x, y;
    int w, h;
    int angini, angarc;
    Color bordColor;

   public Arcoss (int x, int y, int w, int h,int angini,int angarc, Color bordColor) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
	this.angini = angini;
	this.angarc = angarc;
	this.bordColor = bordColor;
    }
   public void print () {
	System.out.format("Setor circular com angulo (%d) na posicao (%d,%d).\n",
		this.angarc, this.x , this.y);
    }
   
   public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
	g2d.setColor(this.bordColor);
	g2d.drawArc(this.x,this.y, this.w,this.h,this.angini,this.angarc);
		
    }
}