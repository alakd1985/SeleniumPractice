package PracticeProblem.Pattern;

import java.util.Scanner;

public class RightHalfDiamond {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of rows::  ");
		int row = input.nextInt();
		
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int i = 1; i <=row; i++) {
			for (int j = row-1; j >=i; j--) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		

	}

}
