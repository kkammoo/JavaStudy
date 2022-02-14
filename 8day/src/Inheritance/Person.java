package Inheritance;

public class Person {
	
	String name;
	int age;
	
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public void smile() {
		System.out.println("¿ô´Ù");
	}
	
	public void eat() {
		System.out.println("¸Ô´Ù");
	}
	
	public final void walk() {
		System.out.println("°È´Ù");
	}
	
}
