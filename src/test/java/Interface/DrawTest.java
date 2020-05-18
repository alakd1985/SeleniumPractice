package Interface;

public class DrawTest {

	public static void main(String[] args) {
		Drawable rectangle= new Circle();
		rectangle.draw();
		rectangle.picture();
		Drawable rectangle1= new Rectangle();
		rectangle1.draw();
		rectangle1.picture();
	}

}
