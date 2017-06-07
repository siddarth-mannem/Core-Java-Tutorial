package com.javaTutorial.inheritance;

public class InheritanceTest {

	public static void main(String[] args) {

/*		Person person = new Person();
		person.setFirstName("Kent");
		person.setLastName("Clarke");
		person.setAge(30);
		//System.out.println(person.hashCode());
*/
		
		Employee employee = new Employee();
		employee.setOccupation("Developer");
		employee.setSalary(1000.00);
		employee.setFirstName("Martha");
		employee.setLastName("Clarke");
		employee.setAge(50);
		
		employee.getDetails();
		
		Manager manager = new Manager();
		
		manager.setDepartment("IT");
		manager.setOccupation("It Manager");
		manager.setSalary(6000.00);
		manager.setFirstName("BInoy");
		manager.setLastName("Agarwal");
		manager.setAge(40);
		manager.getOccupation();
		
		manager.printCompleteName();
		
		System.out.println("EMployee First NAme: " + manager.getFirstName());
		
	}

}
