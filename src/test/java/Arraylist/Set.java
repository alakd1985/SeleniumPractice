package Arraylist;

import java.util.ArrayList;

public class Set {

	public static void main(String[] args) {
		// Creating object of ArrayList<Integer>
		ArrayList<Integer> arrlist = new ArrayList<Integer>();

		// Populating arrlist1
		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(3);
		arrlist.add(4);
		arrlist.add(5);

		System.out.println("Before Creating set::" + arrlist);

		// replacing at index 2

		int newarrList = arrlist.set(2, 40);

		System.out.println("After creating of the set function:: " + arrlist);

	}

}
