package PracticeProblem.Pattern;

import java.util.Scanner;

public class BoxNumber {
	public static void main(String[] args) {

		/*
		 * 111 
		 * 222 
		 * 333
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please input the numebr of rows::   ");
		int row = input.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row; j++) {
				System.out.print("" + i);
			}
			System.out.println("\n");
		}

		/*
		 * 12345
		 * 
		 * 12345
		 * 
		 * 12345
		 * 
		 * 12345
		 * 
		 * 12345
		 * 
		 */

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row; j++) {
				System.out.print("" + j);
			}
			System.out.println("\n");
		}

		/*
	
		 * ****
		 * ****
		 * ****
		 * ****
		 * ****
		 */

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}

	}
}
