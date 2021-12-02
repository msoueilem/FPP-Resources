package prog3_2_startup;

class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType ;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		if (deposit<=0){
			return;
		}
		balance += deposit;
	}
	public AccountType getAccountType() {
		return acctType;
	}
	public void setAcctType(AccountType acctType){
		this.acctType = acctType;
	}
	public double getBalance() {
		return  balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}

	public boolean makeWithdrawal(double amount) {
		if (balance<amount) return false;
		balance -= amount;
		return true;
	}
}
