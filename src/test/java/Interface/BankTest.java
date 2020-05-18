package Interface;

public class BankTest {

	public static void main(String[] args) {
		Bank bank = new CitiBank();
		System.out.println(bank.interestRate());
		Bank bank1 = new WellsFargo();
		System.out.println(bank1.interestRate());
	}

}
