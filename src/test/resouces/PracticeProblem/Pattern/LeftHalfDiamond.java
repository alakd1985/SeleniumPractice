package PracticeProblem.Pattern;

import java.util.Scanner;

public class LeftHalfDiamond {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of rows::  ");
		int row = input.nextInt();
		
		for (int i = 1; i <=row; i++) 
		{
		for (int j = row; j>=i; j--) 
		{
			System.out.print(" ");
		}	
		for (int k = 1; k <=i; k++) 
		{
			System.out.print("*");
		}
		System.out.println();
		}

	}

}
