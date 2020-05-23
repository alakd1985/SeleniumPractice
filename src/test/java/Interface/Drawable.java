package Interface;

public interface Drawable {

	public static void draw() {
	}

	default void picture() {
		System.out.println("Monalisa is the creation of De Vinci");
	}
	
}
