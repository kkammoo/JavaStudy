package com.kh;

public class PersonMain {

	public static void main(String[] args) { // ���� Ŭ����
		
		Person person1 = new Person(); // ��ü�� �켱 �����ϰ�, ���Ŀ� �ʵ尪�� ����
		person1.name = "ȫ�浿";
//		person1.age = 30;
		person1.setAge(30);
		System.out.println(person1.name);
//		System.out.println(person1.age);
		System.out.println(person1.getAge());
		
		
		Person person2 = new Person("ȫ���", 20); // ��ü�� ������ �� �ʵ尪�� ����. ���̺귯�� Ŭ������ �ش� �Ű����� ���� ������ �ʿ�.
		System.out.println(person2.name);
//		System.out.println(person2.age);
		System.out.println(person2.getAge());
		
		person2.name = "�蹫��";
//		person2.age = 33;
		person2.setAge(33);
		System.out.println(person2.name); // ��ü�� ������ ��ÿ� ��������� �ʵ尪�� ������ ���� �ִ�.
//		System.out.println(person2.age);  // �ʵ尪�� �������� ���ϵ��� �ϱ� ���ؼ� private�� ���� �ܺο��� �������� ���ϵ��� �Ѵ�.
		System.out.println(person2.getAge());
		
		
		Person person3 = new Person("ȫ�泲");
		person3.setAge(35);
		
		// �� ��ü�� static Ŭ���� ��� �ʵ� ��
		System.out.println(Person.NATIONALITY);
		System.out.println(person1.NATIONALITY);
		System.out.println(person2.NATIONALITY);
		System.out.println(person3.NATIONALITY);
		// ��ü�� �޶� ���� ���� �����ϰ� �ֱ� ������ ���� ���� ����.
		
//		Person.nationality = "�̱�"; // ���(final static)�� ���� �����߱� ������ ������ �� �ȴ�.
	}
	
}
