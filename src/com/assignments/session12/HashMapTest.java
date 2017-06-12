package com.assignments.session12;

import java.util.ArrayList;
import java.util.List;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		List<Person> personsArrayList = new ArrayList<>();
		List<Order> ordersOfPerson= new ArrayList<>();

		//Person1
		Address address1 = new Address("1073 S Lincoln St", "Dartmouth", "Kent", "OHIO", 44240);
		Phone phone1 = new Phone(3303966434L, "Apple", "Iphone7Plus", 330, "PostPaid", false, 5.7);
		Order order1= new Order(1L, "Item1", 987654321L, 99.99D, "Placed", "06/10/2016", "06/10/2016");
		Person person1 = new Person("Harish", "Kurma", "05/04/1993", 1234567890, 1234, "M123456", address1, phone1);
		ordersOfPerson.add(order1);
		person1.setOrders(ordersOfPerson);
		
		//Person2
		Address address2 = new Address("416 Hickory Mils", "Hickory Mills", "Kent", "OHIO", 44240);
		Phone phone2 = new Phone(3303966434L, "Apple", "Iphone6Plus", 330, "PostPaid", false, 5.7);
		Order order2= new Order(2L, "Item1", 987654321L, 99.99D, "Placed", "06/10/2016", "06/10/2016");
		Order order3= new Order(3L, "Item2", 242342343L, 129.99D, "Delievred", "06/04/2017", "06/06,2017");
		Person person2 = new Person("Sowjanya", "Adapa", "05/04/1993", 1234567890, 1234, "M123456", address2, phone2);
		ordersOfPerson.add(order2);
		ordersOfPerson.add(order3);
		person2.setOrders(ordersOfPerson);
		
		//inserting persons in personsArrayList
		personsArrayList.add(person1);
		personsArrayList.add(person2);
		
		//print out values in personsArrayList
		
		for(int i=0;i<personsArrayList.size();i++){
			Person person = personsArrayList.get(i);
			System.out.println("====================================");
			System.out.println("Person " + (i+1));
			System.out.println("====================================");
			System.out.println(person.getFirstName());
			System.out.println(person.getLastName());
			System.out.println(person.getDob());
			System.out.println(person.getPassportNo());
			System.out.println(person.getSsn());
			System.out.println(person.getTaxId());
			System.out.println("------Address Details-------");
			System.out.println(person.getAddress().getAddrLine1());
			System.out.println(person.getAddress().getAddrLine2());
			System.out.println(person.getAddress().getCity());
			System.out.println(person.getAddress().getState());
			System.out.println(person.getAddress().getZip());
			System.out.println("-------Phone Details--------");
			System.out.println(person.getPhone().getMaker());
			System.out.println(person.getPhone().getModel());
			System.out.println(person.getPhone().getType());
			System.out.println(person.getPhone().getAreaCode());
			System.out.println(person.getPhone().getNumber());
			System.out.println(person.getPhone().getSize());
			System.out.println("-------Orders---------");
			
			
			System.out.println(person.getOrders());
			
			
		}
		
		
		
	}

}
