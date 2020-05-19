package Arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		// Creating object of ArrayList<Integer>
		ArrayList<String> arrlist = new ArrayList<String>();

		// adding element to arrlist
		arrlist.add("A");
		arrlist.add("B");
		arrlist.add("C");
		arrlist.add("D");

		// print arrlist
		System.out.println("ArrayList: " + arrlist);

		ListIterator<String> arrireIterator = arrlist.listIterator();
		System.out.println("\nUsing iterator: \n");

		while (arrireIterator.hasNext()) {
			System.out.println("The value is :: " + arrireIterator.next());

		}
		
		
		// iteration starts at index 2
		
		ListIterator<String> indexIterator= arrlist.listIterator(2);
		
		System.out.println("\nUsing iterator from index 2:: \n");
		while (indexIterator.hasNext()) {
			System.out.println("The value is :: "+indexIterator.next());
			
		}

	}

}
