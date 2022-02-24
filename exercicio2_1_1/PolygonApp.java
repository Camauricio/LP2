public class PolygonApp {
    public static void main (String[] args) {
        Polygon p1 = new Polygon(66,104,262,104,164,262,3);
        p1.print();
    }
}
class Polygon {

	int x1points, y1points;
	int x2points, y2points;
	int x3points, y3points;
	int npoints;
    
    Polygon (int x1points, int y1points , int x2points , int y2points , int x3points , int y3points , int npoints) {
        this.x1points = x1points;
        this.y1points = y1points;
	this.x2points = x2points;
	this.y2points = y2points;
	this.x3points = x3points;
	this.y3points = y3points;
	this.npoints = npoints;
    }
    void print () {
        System.out.format("O poligono de vertices (%d,%d), (%d,%d), (%d,%d) possui  %d lados, logo eh um triangulo )\n",
           this.x1points, this.y1points ,this.x2points ,this.y2points,this.x3points ,this.y3points ,this.npoints);
    }
}