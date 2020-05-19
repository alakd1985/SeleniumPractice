package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class AddRemove {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("alak");
		arr.add("dutta");
		System.out.println(arr);
		arr.add(2, "toma"); // add new person at specified index
		System.out.println(arr);
		arr.add(0, "om");// add person at 0th index
		System.out.println(arr);

		// remove elements

		arr.remove(1);
		System.out.println(arr);
		arr.remove("toma");
		System.out.println(arr);

		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Gregor Clegane");
		alist.add("Khal Drogo");
		alist.add("Cersei Lannister");
		alist.add("Sandor Clegane");
		alist.add("Tyrion Lannister");

		// iteration

		for (String str : alist) {
			System.out.println(str);
		}

		// size of array list

		System.out.println(alist.size());
		System.out.println(arr.size());

		// sorting

		Collections.sort(arr);
		for (String sotrg : arr) {
			System.out.println(sotrg);
		}

		int n = 5;
		ArrayList<Integer> arrinArrayList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arrinArrayList.add(i);
		}
		// printing elements in the list
		System.out.println(arrinArrayList);

		for (int i = 0; i < arrinArrayList.size(); i++) {
			System.out.println(arrinArrayList.get(i) + " ");
		}

		int element = arrinArrayList.get(2);
		System.out.println("The index 3 is:: " + element);

		String element1 = arr.get(1);
		System.out.println("The index 3 is:: " + element1);

	}

}
