package come.tia.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount bank1 = new BankAccount();
		BankAccount bank2 = new BankAccount();
		


		System.out.println(BankAccount.accountCount());
		
		System.out.println("_____________");
		bank1.depositMoney(200, "checking");
		System.out.println(bank1.getCheckingBalance());
		
		System.out.println(bank1.getAccountNumber());
		
		bank1.withdrawMoney(100, "checking");
		System.out.println(bank1.getCheckingBalance());
		
		


	}

}
