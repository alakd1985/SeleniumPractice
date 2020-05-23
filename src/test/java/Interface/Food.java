package Interface;

public interface Food {
	
	void stapleFood();
	public static int foodPrice(int price) // static key word can be used in the interface in the latest edition
	{
		return price*2;
	}

}
