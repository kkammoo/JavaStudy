package Inheritance;

public class Student extends Person {
	
	int hakbun;
	
	public Student() {
		
	}
	
	public Student(String name, int age) {
		super(name, age); // �θ� ������ ȣ�� �� �� �������� �Ű������� ���� �̷� ��絵 ���� �� �ִ�.
	}
	
	
	public void study() {
		System.out.println("�����ϴ�");
	}
	
	@Override // �������̵带 �ٿ��ָ� ��Ÿ�� ���� �� Ȯ���� �� �ִ�. ������ ���ο� ��� �߰��� �ν���.
	public void eat() { // ����Ŭ����(Person)�� �ִ� eat�޼ҵ� ������. �޼ҵ� �̸��� �Ȱ��� ���� ���븸 �ٲ۴�.
		super.eat();
		System.out.println("���� �Դ�"); // �θ� Ŭ������ eat�޼ҵ带 �����ϰ� ����
	}
	
//	@Override
//	public void walk() { // �θ� Ŭ�������� final�� ����Ǿ��� ������ �ڽ� Ŭ�������� �������� �� ����.
//		
//	}
	
}
