package prog5_6_startup.case3;

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
		if (this.getClass() != o.getClass()){
			return false;
		}
		return this.getName().equals(((Person) o).getName()) && this.getDateOfBirth().equals(((Person) o).getDateOfBirth());
	}

}
