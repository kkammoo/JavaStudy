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
		System.out.println("����");
	}
	
	public void eat() {
		System.out.println("�Դ�");
	}
	
	public final void walk() {
		System.out.println("�ȴ�");
	}
	
}
