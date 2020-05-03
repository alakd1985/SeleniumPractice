package PracticeProblem;

public class ArrayIndexElement {

	public static void main(String[] args) {
		int[] myNumber = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		System.out.println("The index of the array is :" + contains(myNumber, 15));
	}

	public static int contains(int[] arr, int NumberInsideArray) {

		int len = arr.length;
		int indexStart = 0;
//		if (arr == null) {
//			return -1;
//		}

		while (indexStart < len) {
			if (arr[indexStart] == NumberInsideArray) {
				return indexStart;
			} else {
				indexStart = indexStart + 1;
			}
		}

		return -1;

	}
}
