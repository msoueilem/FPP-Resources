package prog3_2_startup.main;
import prog3_2_startup.AccountType;
import prog3_2_startup.Employee;

import java.util.Scanner;

public class Main {
	Employee emps;
	String decision;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}


	Main() {
		emps = new Employee("Jim Daley", 2000, 9, 4);

		emps.createNewChecking(10500);
		emps.createNewSavings(1000);
		emps.createNewRetirement(9300);
		diplayData();
		emps.setName("soueilem mohamed lemine");
		emps.setHireDate(1995,12,12);
		diplayData();
		emps.withdraw(AccountType.RETIREMENT,500);
		diplayData();
	}

	public void diplayData() {
		System.out.print("See a report of all account balances? (y/n) ");
		decision = sc.nextLine();
		if (decision.equals("y")){
			System.out.println(emps.getFormattedAcctInfo().toString());
		}
		else {
			System.out.println("You didn't select y, so no data to display..");
		}
	}
}


