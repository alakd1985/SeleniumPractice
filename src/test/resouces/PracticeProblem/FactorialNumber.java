package PracticeProblem;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a numebr to calculate the factorial:: ");
		int num = input.nextInt();
		long fact = 1;
		
		// in order to debug press F
		for (int i = 1; i <=num; i++) {
			fact= fact*i;
		}
		
		System.out.println("Factorial of the number is : "+ fact);

	}

}
