package prog5_6_startup.case1;

import java.time.LocalDate;

public class PersonWithJob extends Person {
	private double salary;
	PersonWithJob(String name, LocalDate dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
}
