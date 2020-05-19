package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class subList {

	public static void main(String[] args) {
		 // Creating object of ArrayList<Integer> 
        ArrayList<String> 
            arrlist = new ArrayList<String>(); 

        // Populating arrlist1 
        arrlist.add("A"); 
        arrlist.add("B"); 
        arrlist.add("C"); 
        arrlist.add("D"); 
        arrlist.add("E"); 

        // print arrlist 
        System.out.println("Original arrlist: "
                           + arrlist); 
        
        // creation of sublist
        
       List<String> strings= arrlist.subList(0, 2);
       
       System.out.println(strings);
        

	}

}
