package Interface;

public class RicePriceTest {

	public static void main(String[] args) {
		Food food = new Rice();
		food.stapleFood();
		System.out.println(Food.foodPrice(100));
		
	}

}
