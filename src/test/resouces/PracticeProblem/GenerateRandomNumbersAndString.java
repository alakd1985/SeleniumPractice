package PracticeProblem;

import java.util.Random;

public class GenerateRandomNumbersAndString {

	public static void main(String[] args) {
		Random ran = new Random();
		int randomInt= ran.nextInt(1000);
		double randomd= ran.nextDouble(); // range between 0.0 and 1.0
		System.out.println(randomInt);
		System.out.println(randomd);
		
		
		// using math class
		
		System.out.println(Math.random());
		
		
		
		

	}

}
