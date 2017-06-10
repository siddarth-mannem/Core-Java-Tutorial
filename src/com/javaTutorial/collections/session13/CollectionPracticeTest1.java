package com.javaTutorial.collections.session13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionPracticeTest1 {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		Person personToAdd;
		for(int i=1; i <=10; i++) {
			
			personToAdd = new Person("firtName-"+i, "lastName-"+i, 29+i, 22222222 + i, 5555555+i, "HYU3534"+i);
			Address address = new Address(123+i, "StreetNo-"+i, "Apt#"+i, "city-"+i, "State-"+i, 55555+i);
			Phone phone = new Phone("model-"+i, 6.1+i, 1.0+i, "maker-"+i, 777777777+i, true, new String[]{"sim1-"+i, "sim1-"+i} );
			Phone phone2 = new Phone("model2-"+i, 7.2+i, 2.0+i, "maker2-"+i, 66666666+i, false, new String[]{"sim2-"+i, "sim2-"+i} );

			personToAdd.setAddress(address);
			personToAdd.setPhone(phone);
			
			List<Phone> phonesList = new ArrayList<>();
			phonesList.add(phone);
			phonesList.add(phone2);
			
			personToAdd.setPersonPhones(phonesList);
			
			persons.add(personToAdd);
			
		}
		
		for(Person person: persons) {
			
			System.out.println("------Person Details-----***********");
			System.out.println(person.getFirstName());
			System.out.println(person.getLastName());
			System.out.println(person.getPassportNum());
			System.out.println(person.getSsn());
			System.out.println(person.getTaxId());
			
			System.out.println("----Address details ----");
			Address addr = person.getAddress();
			
			System.out.println(addr.getAddr_line1());
			System.out.println(addr.getAddr_line2());
			System.out.println(addr.getCity());
			
			System.out.println("--------List of Phone details-------");
			
			List<Phone> phones = person.getPersonPhones();
			
			for(Phone phone : phones) {
				System.out.println(phone.getModel());
				System.out.println(phone.getNumber());
			}
			System.out.println("------------------------------------------");
			
			
		}
		
		
		Map<String, Person> personsMap = new HashMap<String, Person>();
		// Key is person's ssn and value is person Object;
		//Write your code to add objects in HashMAP and also read HAshMap objects using FOR loop...
		
	}

}
