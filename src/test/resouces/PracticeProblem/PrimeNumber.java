package PracticeProblem;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number to check if it is a prime number ::  ");
		int number = input.nextInt();
	
		
		int count = 0;
		
		if (number>1) {
			
			for (int i = 1; i <=number; i++) {
				if (number%i==0) {
					count++;
				}
			}
			
			if (count==2) {
				System.out.println("prime number");
			}
			else {
				System.out.println("not a prime number");
			}
			
		}
		else {
			System.out.println("this is not a prime number");
		}
		
	}

}
