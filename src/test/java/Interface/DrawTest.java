package Interface;

public class DrawTest implements Drawable {

	public static void main(String[] args) {
		Drawable rectangle= new DrawTest();
		Drawable.draw();
		rectangle.picture();
		Drawable rectangle1= new Rectangle();
		Drawable.draw();
		rectangle1.picture();
	}

}
