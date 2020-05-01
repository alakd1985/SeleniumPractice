package PracticeProblem;

public class Arrays {

	public static void main(String[] args) {

		// 1. Anonymous arrays are declared similarly to regular arrays
		int array1[] = { 1, 2, 3, 4, 5 };
		for (int array : array1) {
			System.out.println("The numbers are : " + array);

		}
		// 2.To reference the components of an array

		String[] n = new String[4];
		n[0] = "I eat rice";
		System.out.println("The value of :" + n[0]);

		// 3. Copy into a new array

		int[] number = { 1, 2, 3 };
		int[] temp = new int[4];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = number[i];
		}
		number = temp;

	}

}
