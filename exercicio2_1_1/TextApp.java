class Text {
	String colorFont;
	String fontType;
	String fontStyle;
	int x,y;	

	Text( String colorFont, String fontType, String fontStyle,  int x, int y) {
		this.colorFont = colorFont;
		this.fontType = fontType;
		this.fontStyle = fontStyle;
		this.x = x;
		this.y = y;		
}

	void Print() {
		System.out.format("Texto escrito na cor %s na fonte %s com estilo %s.\n" , this.colorFont ,this.fontType ,this.fontStyle );
		System.out.format("A partir da coordenada (%d, %d )." , this.x , this.y);
	}
}

public class TextApp {
    public static void main (String[] args) {
        Text t = new Text ( "azul" , " Times New Roman " , " Bold ", 60, 250);
	t.Print();
	}
}