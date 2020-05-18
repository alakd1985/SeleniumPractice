package PracticeProblem;

import java.util.Scanner;

public class FindingOddOrEvenNumber {

	public static void main(String[] args) {
		
//		Scanner inputScanner = new Scanner(System.in);
//		System.out.println("Please enter your numbers::  ");
//		int number = inputScanner.nextInt();
		int a[] = {1,2,3,4,5};
		int b[] = {33,21,45,67,89,76,12,90};
		
		
		System.out.println("The even numbers are:: ");

		for (int i = 0; i < a.length; i++) {
			
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}

		System.out.println("The odd numbers are:: ");

		for (int i = 0; i < a.length; i++) {
			
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}
		
		
		// Enhanced for loop
		
		System.out.println("The even numbers are:: ");

		for (int even: b) {
			
			if (even % 2 == 0) {
				System.out.println(even);
			}
		}

		System.out.println("The odd numbers are:: ");

		for (int odd: b) {
			
			if (odd%2 != 0) {
				System.out.println(odd);
			}
		}

	}

}
