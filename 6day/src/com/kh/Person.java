package com.kh;

public class Person {

//	int age;
//	public int age;
	private int age; // ���� ����ʵ�� ������� �س��´�. �ܺο��� ������ ������� ����.
	
	private Calculator calculator = new Calculator(); // �ʵ带 ���� Person Ŭ�������� Calculator Ŭ������ ������ ������ �� �ִ�.
	
	
	public Person() {
//		setAge(20); // ����ڿ��� ����ʵ��� ���� ������ �� ����.
	}
	
	public Person(Calculator calculator) {
		this.calculator = calculator; // ����ڸ� ���� Person Ŭ�������� Calculator Ŭ������ ������ ������ �� �ִ�.
	}
	
	public void smile() {
		System.out.println("����" + age);
	}
	
//	private void setAge(int age) { 
//		if (age < 0) {
//			return; // age�� ������ ��� ���� ������ �ʰڴ�. �ܺ� �Է°��� ������ �� �ִ�.
//		}
//		this.age = age;
//	}
	
	public void setAge(int age) {
		if (age < 0) {
			return;
		}
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator; // �޼ҵ带 ���� Person Ŭ�������� Calculator Ŭ������ ������ ������ �� �ִ�.
	}
	
	public Calculator getCalculator() {
		return this.calculator;
	}

}

// ����Ʈ (�ƹ��͵� �ۼ� X), public, private, protected
/*  ���� ����
 *  ����Ʈ : ���� ��Ű�� ������ ����
 *  public : �ٸ� ��Ű�������� ����
 *  private : Ŭ���� ������ ����
 *  protected : 
 */

// Ŭ������ ����ʵ�� �ڽ��� ������ �� �ֵ��� ����� ���� ����.