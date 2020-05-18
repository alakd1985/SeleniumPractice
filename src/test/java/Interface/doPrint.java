package Interface;

public class doPrint implements Print {
	
	public void print()
	{
		System.out.println("I need to print few pages");
	}

	public static void main(String[] args) {
		doPrint dPrint= new doPrint();
		dPrint.print();

	}

}
