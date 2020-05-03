package PracticeProblem;

public class ArrayAverage {

	public static void main(String[] args) {

		int num[] = { 1, 2, 3, 4, 5 };
		int sum = 0;
		int sum1 = 0;

		for (int i = 0; i < num.length; i++) {
			sum1 = sum1 + num[i];
		}
// 2. Second option
		for (int i : num) {
			sum = sum + i;
		}

		System.out.println("The sum of the numbers are: " + sum);
		System.out.println("The sum of the numbers are: " + sum1);
		double average = sum / num.length;
		System.out.println("The average is :" + average);
	}

}
