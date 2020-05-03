package PracticeProblem;

public class LargeandSmallNumber {

	public static void main(String[] args) {
		int[] string = { -40, -60, 0, 56, 3, 7, 90, 32 };
		int large = string[0];
		int small = string[0];

		for (int i = 1; i < string.length; i++) {

			if (string[i] > large) {
				large = string[i];
			} else if (string[i] < small) {
				small = string[i];

			}

		}

		System.out.println("The largest number is :" + large);
		System.out.println("The largest number is :" + small);
	}

}
