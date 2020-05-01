package PracticeProblem;

public class ReverseInt {
	public static void main(String[] args) {
		
		int num = 568098609;
		long num1 = 67432009;
		int rev = 0;
		while (num !=0) 
		{
			rev = rev * 10 + num%10;
			num = num/10;
		}
		System.out.println("The reverse value is "+ rev);
		
		//2. This is the second method of reversal
		
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
	}

}
