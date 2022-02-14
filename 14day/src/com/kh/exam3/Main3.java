package com.kh.exam3;

public class Main3 {

	public static void main(String[] args) {
		
		Person p1 = new Person("ȫ�浿", 10);
		Person p2 = p1;
		
		System.out.println(p2.getAge()); // 10
		changeAge(p2);
		System.out.println(p2.getAge()); // 20
		System.out.println(p1.getAge()); // 20
		
	}

	private static void changeAge(Person p2) {
		p2.setAge(20);
	}

}
