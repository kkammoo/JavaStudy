package com.kh.exam4;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		// Class 按眉 积己规过 p.482
		// case 1)
		Class obj = Person.class;
		
		// case 2)
		Class obj2 = Class.forName("com.kh.exam4.Person");
	
		// case 3)
		Person p1 = new Person("全辨悼", 30);
		Class obj3 = p1.getClass();
		
		
//		obj.getConstructors();
	
	}
}
