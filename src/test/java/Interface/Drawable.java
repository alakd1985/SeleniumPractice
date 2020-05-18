package Interface;

public interface Drawable {

	public void draw();
	default void picture() {
		System.out.println("Monalisa is the creation of De Vinci");
	}
	
}
