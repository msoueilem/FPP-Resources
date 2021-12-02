package lesson1.basics.typicalprogram;

/**
 * Represents profile information for an Employee.
 * @author Mei Li
 */

public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	private Address home;
	private Address work;
	public Employee(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getHome() {
		return home;
	}
	public void setHome(Address home) {
		this.home = home;
	}
	public Address getWork() {
		return work;
	}
	public void setWork(Address work) {
		this.work = work;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	/** Provides a string representation of this Employee */
	public String toString() {
		return "[" + firstName + " " + lastName + "]";
	}
}
