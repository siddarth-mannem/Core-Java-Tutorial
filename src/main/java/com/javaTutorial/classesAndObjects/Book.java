package com.javaTutorial.classesAndObjects;

public class Book {

	String author;
	
	int pages;
	
	String publicationName;
	
	String title;
	
	public void read() {
		System.out.println("Hello please read my book");
	}
	
	public void makeNotes() { // CamelCase
		System.out.println("You can't makes notes out of this book because of security.");
		
	}
}
