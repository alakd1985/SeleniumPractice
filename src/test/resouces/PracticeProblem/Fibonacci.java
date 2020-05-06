package PracticeProblem;

import java.util.Scanner;

public class Fibonacci {

	//  reference https://www.youtube.com/watch?v=vwjhT_OTp1w&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=11
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number for fibonacci series::  ");
		int userInput = input.nextInt();
		for (int i = 2; i < userInput; i++) {
			sum = n1 + n2;
			System.out.println(sum);
			n1 = n2;
			n2 = sum;

		}

	}

}
