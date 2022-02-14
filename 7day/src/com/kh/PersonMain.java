package com.kh;

public class PersonMain {

	public static void main(String[] args) {
		
		System.out.println("hello!");
		
		Person.cal.println("hello!");
		
		Calculator c1 = Person.cal;
		
		
		int sum = Person.cal.sum(10, 20);
		System.out.println(sum);
	}

}
