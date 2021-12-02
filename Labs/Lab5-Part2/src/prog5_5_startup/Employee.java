package prog5_5_startup;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;


public class Employee implements Comparable{
	private String name;
	private int salary;
	private LocalDate hireDate;

	public Employee(String name, int salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		hireDate = LocalDate.of(year, month, day);
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}


	@Override
	public int compareTo(Object o) {
		Employee emps = (Employee) o;
		if (this.name.equals(emps.name)){
			if (this.salary == emps.salary) {
				if (this.hireDate.equals(emps.hireDate)) {
					return 0;
				}
				else{
					return this.hireDate.compareTo(emps.hireDate);
				}
			}else
				return (this.salary > emps.salary)? 1 : -1;
		}
		else return this.name.compareTo(emps.name);
	}
	public String toString(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
		//String dateFormat = this.hireDate.getMonthValue()+"/"+this.hireDate.getDayOfMonth()+"/"+this.hireDate.getYear();
		String format= "<name:"+this.name+" salary: "+this.salary+" hire date: "+this.hireDate.format(formatter)+">";
		return format;
	}
}
