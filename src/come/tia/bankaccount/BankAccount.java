package come.tia.bankaccount;

import java.util.Random;

public class BankAccount {
	public String accountNumber;
	public double checkingBalance;
	public double savingBalance;
	public static int numberOfAccounts = 0;
	public static int allTheMoney = 0;
	
	public BankAccount() {
		checkingBalance = 0;
		savingBalance = 0;
		this.accountNumber = createRandomAccountNumber();
		numberOfAccounts ++;
		
	}
	public static int accountCount() {
		return numberOfAccounts;
	}
	public static int allMoney() {
		return allTheMoney;
	}
	
	public static int randomNumber(int n) {
		Random myRandom = new Random();
		return myRandom.nextInt(n);
	}
	
	private static String createRandomAccountNumber() {
		String nums = "";
		for(int i=1; i<=10; i++) {
			nums += String.valueOf(BankAccount.randomNumber(10));
		}
		//System.out.println(nums);
		return nums;
	}
	public double totalMoney() {
		double totalMoney = checkingBalance + savingBalance ;
		return totalMoney;
	}
	public void depositMoney(double n, String account) {
		
		if(account.toLowerCase()=="checking") {
			checkingBalance += n;
			allTheMoney += n;
			
		}
		else if(account.toLowerCase()=="saving") {
			savingBalance += n;
			allTheMoney += n;
			
		}
	}
	public void withdrawMoney(double n, String account) {
		if(account.toLowerCase()=="checking") {
			checkingBalance -= n;
			allTheMoney -= n;
		}
		else if(account.toLowerCase()=="saving") {
			savingBalance -= n;
			allTheMoney -= n;
		}
	}
	public String getAccountNumber() {
		return accountNumber;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public static void setNumberOfAccounts(int numberOfAccounts) {
		BankAccount.numberOfAccounts = numberOfAccounts;
	}
	public static int getAllTheMoney() {
		return allTheMoney;
	}
	public static void setAllTheMoney(int allTheMoney) {
		BankAccount.allTheMoney = allTheMoney;
	}

}
