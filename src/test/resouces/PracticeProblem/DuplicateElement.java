package PracticeProblem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.formula.functions.Count;

public class DuplicateElement {

	public static void main(String[] args) {
		String[] dupStrings = { "java", "javascript", "javadoc", "javascript", "java" };
		// 1. compare each element this is not the good solution; use 
		// i or j = index of the array
		for (int i = 0; i < dupStrings.length; i++) {
			for (int j = i + 1; j < dupStrings.length; j++) {
				if (dupStrings[i].equalsIgnoreCase(dupStrings[j])) {
					System.out.println("duplicate element is: " + dupStrings[i]);

				}
			}
		}
		
		// 2. property of hashset and using it
		Set<String>store = new HashSet<String>();
		for (String str : dupStrings) 
		{
			if (store.add(str)==false) {
				System.out.println("duplicate element is: " + str);
			} 
			
		}
		
		//3. The following is the third solution
		
		Map<String, Integer> namemap = new HashMap<String, Integer>();
		for (String name : dupStrings) 
		{
			Integer countInteger= namemap.get(name);
			if (countInteger==null) 
			{
				namemap.put(name, 1);
				
			}
			else {
				namemap.put(name,countInteger++);
			}
		}
		
		// get the values from the hasmap
		
		Set<Entry<String, Integer>> entrySet= namemap.entrySet();
		for(Entry<String, Integer> entry: entrySet)
		{
			if (entry.getValue()>1) 
			{
				System.out.println("suplicate element is :"+entry.getKey());
			}
		}

	}

}
