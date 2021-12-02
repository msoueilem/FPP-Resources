package lesson1.basics.typicalprogram;

import java.util.Arrays;

/**
 * Creates a few Employees, stores them in an array.
 * Then locates all Employees with first name Bill
 *
 * @author Mei Li
 * @editor Soueilem Mohamed Lemine
 *
 */
public class Main {

	public static void main(String[] args) {
		Address add1A = new Address("10 Adams", "Chicago", "IA", "52556");
		Address add1B = new Address("110 Burlington", "Fairfield", "IA", "52556");
		Address add2A = new Address("322 Harrison", "Chicago", "IA", "52556");
		Address add2B = new Address("2210 Burlington", "Fairfield", "IA", "52556");

		Customer customer1 = new Customer("Mls","Lemine","332-221-4444");
		customer1.setShippingAddress(add1A);
		customer1.setBillingAddress(add2A);

		Customer customer2 = new Customer("Joe","Smith","332-221-4444");
		customer2.setShippingAddress(add1B);
		customer2.setBillingAddress(add2B);



		Employee e1 = new Employee("Bill", "Lemine");
		e1.setSalary(100000);
		e1.setHome(add1A);
		e1.setWork(add1B);

		Employee e2 = new Employee("Soueilem", "Mohamed");
		e2.setSalary(120000);
		e2.setHome(add2A);
		e2.setWork(add2B);

		//print info about Employee 1
		System.out.println(e1);
		System.out.println("Home address: " + e1.getHome());
		System.out.println("Work address: " + e1.getWork());

		System.out.println(customer1);

		//Create an Employee array of length 2
		Employee[] empArray = new Employee[2];
		empArray[0] = e1;
		empArray[1] = e2;

		Customer[] cusArray = new Customer[2];
		cusArray[0] = customer1;
		cusArray[1] = customer2;

		//Search the array for an Employee having first name "Bill"
		//If found, print out the Employee's full name
		if (empArray.length == 0){
			return;
		}
		else {
			for (int i = 0; i < empArray.length; i++) {
				String firstName = empArray[i].getFirstName();
				if (firstName.equals("Bill")) {
					System.out.println("Found Bill! " + empArray[i]);
				}
			}
		}

		if (cusArray.length==0){
			return;
		}
		else {
			for (int i = 0; i < cusArray.length; i++) {
				String city = cusArray[i].getShippingAddress().getCity();
				if (city.equals("Chicago")) {
					System.out.println("Found City! " + cusArray[i]);
				}
			}
		}
	}

}
