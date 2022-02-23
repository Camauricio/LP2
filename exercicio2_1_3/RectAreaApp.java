import java.util.Random;
import java.util.Random;

public class RectAreaApp {
    public static void main (String[] args) {
       Area a1 = new Area();
        a1.area();
    }
}
class Area {
    Random rand = new Random();
    int s = rand.nextInt(100);
    int a = rand.nextInt(100);
    int arearetangulo = s*a;
        
     void area () {
        System.out.format("A area do retangulo de %d de altura com %d de comprimento possui area de (%d).\n",
            this.s, this.a, this.arearetangulo );
     }
}