package com.javaTutorial.classesAndObjects;

public class PhonesArrayTest {

	public static void main(String[] args) {

		Phone phone1 = new Phone(); // hashCode# 451
		phone1.setModel("IPhone7");
		phone1.setMaker("Apple");
		phone1.setNumber(43857348L);
		phone1.setSize(6.7);
		phone1.setVr(true);
		phone1.setWeight(0.5);
		
		String[] sims1 = {"Att", "verizon"};
		phone1.setSimCards(sims1);
		
		System.out.println("---------------------------------------");
		Phone phone2 = new Phone(); // hashCode# 452
		phone2.setModel("Galaxy");
		phone2.setMaker("Samsung");
		phone2.setNumber(22222222L);
		phone2.setSize(7.5);
		phone2.setVr(true);
		phone2.setWeight(1.0);
		
		String[] sims2 = {"Airtel", "vodafone"};
		phone2.setSimCards(sims2);
		
		Phone[] phoneArray = new Phone[2];
		
		
		
		Book book = new Book();
		
		phoneArray[0] = phone1;
		phoneArray[1] = phone2;
		
		//phoneArray[1] = phone1;
		
		for (int i=0; i< phoneArray.length; i++) {
			
			Phone phone = phoneArray[i];
			
			System.out.println(phone.getMaker());
			System.out.println(phone.getModel());
			System.out.println(phone.getNumber());
			System.out.println(phone.getSize());
			System.out.println(phone.getWeight());
			
			String[] sims = phone.getSimCards();
			
			for(int j=0; j<sims.length; j++) {
				System.out.print(sims[j] + " and");
				
			}
			
			System.out.println("\n-------------------------------------");
			
		}
	}

}
