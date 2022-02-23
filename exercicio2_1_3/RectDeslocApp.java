import java.util.Random;
import java.util.Random;

public class RectDeslocApp {
    public static void main (String[] args) {
       Rect r1 = new Rect();
       r1.imprimir();
      }
}
class Rect {
    Random rand = new Random();
    int x = rand.nextInt(100);
    int y = rand.nextInt(100);
    int w = rand.nextInt(350);
    int h = rand.nextInt(350);
    int x1 = rand.nextInt(350);
    int y1 = rand.nextInt(350);
    int novox = x+x1;
    int novoy = y+y1;
 
  void imprimir () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d) sofreu um deslocamento de (%d,%d) e foi posicionado em (%d,%d).\n",            
            this.w, this.h, this.x, this.y , this.x1 , this.y1, this.novox , this.novoy );
 }
}