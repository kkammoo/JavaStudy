package com.kh;

import java.util.Scanner; // Scanner ����� ����ϱ� ���� import

public class Main {
	
//	String name; // Ŭ���� �ȿ��� ���ǵ� ���� �ʵ�
	
	public static void main(String[] args) {
		
		Person p1 = new Person(); // �޼ҵ� ������ ���ǵ� p1�� ����.
		System.out.println(p1);
//		p1.setAge(20);
		p1.smile();
		System.out.println(p1.getAge());
		p1.setAge(20); // person Ŭ���� �ȿ� �ִ� setAge �޼ҵ带 �̿��Ͽ� age�� ����
		System.out.println(p1.getAge()); // setAge�� ����� age���� �ٽ� ���
		
		
		Calculator c1 = new Calculator();
		System.out.println(c1);
		
//		Calculator claculator = p1.getCalculator();
//		int result = calculator().sum(10, 20);
		int result = p1.getCalculator().sum(10, 20); // �� ���๮ 2���� �� �ٷ� ǥ��.
		System.out.println(result);
		
		
		Calculator c2 = new Calculator("Kroea", "White");
		Person p2 = new Person(c2);
		int result2 = p2.getCalculator().sum(20,30);
		System.out.println(result2);
		
		
		
		
		
		Car car1 = new Car();
		System.out.println(car1);
		
		
		
		Scanner scanner = new Scanner(System.in); // Scanner�� ���� ��Ű�� �ȿ� ���� �ʱ� ������ import�� �ؾ� �Ѵ�.
		String str = scanner.nextLine();
	}

}

/*	
 * ��ü�� ���� �ϸ� �� �޸� ������ �ش� ��ü�� �����ȴ�.
 * ��� ��ü�� Object Ŭ�������� ����� ��� �޴´�.
 */ 
