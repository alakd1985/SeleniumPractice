package PracticeProblem;

public class StringManipulation {

	public static void main(String[] args) {
		String charter = "I love bangladesh and India";
		System.out.println("The length is:" + charter.length());
		System.out.println(charter.charAt(6));
		System.out.println(charter.indexOf("b"));
		System.out.println("Third occurance: "+charter.indexOf("a", charter.indexOf("a")+4));
		System.out.println("The index of "+charter.indexOf("and"));
		System.out.println(charter.substring(6,12));
		
		String st = "      I   love  ";
		System.out.println(st.trim());
		System.out.println(st.replace("   ", ""));
		String date = "12-06-2020";
		System.out.println(date.replace("-", "/"));
		
		String sub = "I love bangladesh";
		String[] subspltString = sub.split(" ");
		for (int i = 0; i < subspltString.length; i++) {
			System.out.println(subspltString[i]);
			
			
		}
		
		for (String string : subspltString) {
			System.out.println(string);
			
		}
		
		String x = "Hello";
		String y = "world";
		int a = 100;
		int b = 200;
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		
	}

}
