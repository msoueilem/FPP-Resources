package prog5_6_startup.case2;

import java.time.LocalDate;

public class Person {

	private String name;
	private LocalDate dateOfBirth;
	Person(String name, LocalDate dob) {
		this.name = name;
		dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if (!(o instanceof Person)){
			return false;
		}
		return this.getName().equals(((Person) o).getName()) && this.getDateOfBirth().equals(((Person) o).getDateOfBirth());
	}

}
