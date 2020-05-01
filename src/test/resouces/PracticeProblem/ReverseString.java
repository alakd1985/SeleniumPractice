package PracticeProblem;

public class ReverseString {

	
	// what is the difference between string and string buffer
	// string is immutable whereas st buffer is mutable
	public static void main(String[] args) {
		String str = "Bangladesh";
		int lengthOfString = str.length();// 10
		String rev = "";
		for (int index = lengthOfString - 1; index >= 0; index--) {
			rev = rev + str.charAt(index);
		}
		System.out.println(rev);
		
		
		// The following is the second way
		StringBuffer sBuffer = new StringBuffer(str);
		System.out.println("Reverse in the Stringbuffer way"+sBuffer.reverse());
		
	}

}
