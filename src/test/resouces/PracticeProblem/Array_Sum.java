package PracticeProblem;

import java.util.Scanner;

public class Array_Sum {

	public static void main(String[] args) {

//		Scanner input = new Scanner(System.in);
//		System.out.println("Please enter couple of integers in the array::  ");
//		int a = input.nextInt();
//		int[] userInput = new int[a];
//		// int array1[] = { 1, 2, 3, 4, 5 };
//		int sum = 0;
//		for (int i = 0; i < a; i++)
//
//		{
//
//			userInput[i] = input.nextInt();
//
//			sum = sum + userInput[i];
//
//		}
//
//		System.out.println("Sum:" + sum);
//
//	}
        int n, sum = 0;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements you want in array:");

        n = s.nextInt();

        int a[] = new int[n];

        System.out.println("Enter all the elements:");

        for(int i = 0; i < n; i++)

        {

            a[i] = s.nextInt();

            sum = sum + a[i];

        }

        System.out.println("Sum:"+sum);

    }

}
