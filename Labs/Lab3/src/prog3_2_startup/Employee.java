package prog3_2_startup;

import java.time.LocalDate;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		hireDate=LocalDate.of(yearOfHire ,monthOfHire,dayOfHire);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setHireDate(int yh, int mh, int dh) {
		hireDate=LocalDate.of(yh,mh,dh);
	}
	public LocalDate getHireDate() {
		return hireDate;
	}

	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this,AccountType.CHECKING,startAmount);
	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this,AccountType.SAVINGS,startAmount);
	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this,AccountType.RETIREMENT,startAmount);
	}

	public void deposit(AccountType acctType, double amt) {
		if (amt <=0) {
			return;
		}
		switch (acctType){
			case SAVINGS -> {
				savingsAcct.makeDeposit(amt);
				break;
			}
			case CHECKING -> {
				checkingAcct.makeDeposit(amt);
				break;
			}
			case RETIREMENT -> {
				retirementAcct.makeDeposit(amt);
				break;
			}
		}
	}

	public boolean withdraw(AccountType acctType, double amt) {
		if (amt<=0)
			return false;
		switch (acctType){
			case SAVINGS -> {
				return savingsAcct.makeWithdrawal(amt);
			}
			case CHECKING -> {
				return checkingAcct.makeWithdrawal(amt);
			}
			case RETIREMENT -> {
				retirementAcct.makeWithdrawal(amt);
			}
		}
		return false;
	}

	public String getFormattedAcctInfo() {
		
		String format = "ACCOUNT INFO FOR %s:\n\n" +
				"Account type: %s\n" +
				"Current bal: %.2f\n" +
				"Account type: %S\n" +
				"Current bal: %.2f\n" +
				"Account type: %s\n" +
				"Current bal: %.2f";
		return String.format(format,name,
				checkingAcct.getAccountType(),checkingAcct.getBalance(),
				savingsAcct.getAccountType(),savingsAcct.getBalance(),
				retirementAcct.getAccountType(),retirementAcct.getBalance());
	}
}
