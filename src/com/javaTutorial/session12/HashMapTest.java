package com.javaTutorial.session12;

import java.util.ArrayList;
import java.util.List;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person> persons=new ArrayList<>();
	  //Person1
       Address address1=new Address("416 Hickory Mills Circle","", "Kent","Ohio",44240);
       Phone phone1=new Phone(3542678888L, "Apple", "Iphone6S", 330, "Postpaid", false,4.6);
       Order order1=new Order(236477746L, "IPhone7",63464762364L,456.3d,"Processing","06/7/2017", "06/9/2017");
       List<Order> ordersOfPerson1=new ArrayList<>();
       ordersOfPerson1.add(order1);
	   Person person1=new Person("Sowjanya", "Adapa", "03/21/1993" , 723772, 172623, "F72367K98", address1,phone1, ordersOfPerson1);
	
	//person2
		Address address2=new Address("416 Hickory Mills Circle","", "Kent","Ohio",44240);
		Phone phone2=new Phone(3542678888L, "Apple", "Iphone6S", 330, "Postpaid", false,4.6);
		Order order2=new Order(236477746L, "IPhone7",63464762364L,456.3d,"Processing","06/7/2017", "06/9/2017");
		List<Order> ordersOfPerson2=new ArrayList<>();
		ordersOfPerson2.add(order2);
	    Person person2=new Person("Sowjanya", "Adapa", "03/21/1993" , 723772, 172623, "F72367K98", address2,phone2, ordersOfPerson2);
	
	//person3
	    Address address3=new Address("416 Hickory Mills Circle","", "Kent","Ohio",44240);
	    Phone phone3=new Phone(3542678888L, "Apple", "Iphone6S", 330, "Postpaid", false,4.6);
	    Order order3=new Order(236477746L, "IPhone7",63464762364L,456.3d,"Processing","06/7/2017", "06/9/2017");
	    List<Order> ordersOfPerson3=new ArrayList<>();
	    ordersOfPerson3.add(order3);
	    		Person person3=new Person("Sowjanya", "Adapa", "03/21/1993" , 723772, 172623, "F72367K98", address3,phone3, ordersOfPerson3);
	
	    persons.add(person1);
	    persons.add(person2);
	    persons.add(person3);
	
	    for(int i=0; i<persons.size();i++){
	    	Person person = persons.get(i);
	    	System.out.println("======person " +(i+1)+ " ======");
	    	System.out.println(person.getFirstName());
	    	System.out.println(person.getLastName());
	    	System.out.println(person.getDob());
	    	System.out.println(person.getPassportNum());
	    	System.out.println(person.getSsn());
	    	System.out.println(person.getTaxId());
	    	System.out.println(person.getAddress().getAddressLine1());
	    	System.out.println(person.getAddress().getAddressLine2());
	    	System.out.println(person.getAddress().getCity());
	    	System.out.println(person.getAddress().getState());
	    	System.out.println(person.getAddress().getZipCode());
	        System.out.println(person.getPhone().getNumber());
	    	System.out.println(person.getPhone().getMaker());
	    	System.out.println(person.getPhone().getModel());
	    	System.out.println(person.getPhone().getSize());
	    	System.out.println(person.getPhone().getType());
	    	System.out.println(person.getPhone().getAreaCode());
	    	System.out.println(person.getPhone().isVr());
	    	System.out.println(person.getOrder());
	    	
	    }
	}

}
