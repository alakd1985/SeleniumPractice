package PracticeProblem.Pattern;

import java.util.Scanner;

public class StarPattern {
	
//	*
//	**
//	***
//	###
//	##
//	#
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows:: ");
		int number = input.nextInt();
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		
		// Second Pattern 
		
		for (int i = 1; i <=number; i++) {
			for (int j = number; j>=i; j--) {
				System.out.print("#");
			}
			System.out.println("");
		}
		
		
	}
}
