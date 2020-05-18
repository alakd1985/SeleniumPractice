package PracticeProblem.Pattern;

import java.util.Scanner;

public class BoxPattern {

	public static void main(String[] args) {

		/*
		 * 
		 * 55555
		 * 
		 * 44444
		 * 
		 * 33333
		 * 
		 * 22222
		 * 
		 * 11111
		 * 
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of rows::  ");
		int row = input.nextInt();

		for (int i = row; i >= 1; i--) {
			for (int j = row; j >= 1; j--) {
				System.out.print("" + i);
			}
			System.out.println("\n");
		}

		// another
		/*
		 * 54321
		 * 
		 * 54321
		 * 
		 * 54321
		 * 
		 * 54321
		 * 
		 * 54321
		 * 
		 * 
		 */

		for (int i = row; i >= 1; i--) {
			for (int j = row; j >= 1; j--) {
				System.out.print("" + j);
			}
			System.out.println("\n");
		}
	}

}
