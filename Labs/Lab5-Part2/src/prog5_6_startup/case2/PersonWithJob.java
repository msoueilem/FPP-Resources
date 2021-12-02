package prog5_6_startup.case2;

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

	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if (!(o instanceof PersonWithJob)){
			return false;
		}
		return this.getName().equals(((PersonWithJob) o).getName()) &&
				this.getDateOfBirth().equals(((PersonWithJob) o).getDateOfBirth()) &&
				this.getSalary() == ((PersonWithJob) o).getSalary();
	}
}
