package com.kh.exam2;
/**
 * Person Ŭ���� ����
 * @author mypc
 *
 */
public class Person {
	
	/**
	 * ��� �ʵ� ����
	 */
	private String name;
	
	/**
	 * ������ ���� 
	 * @param name �̸��� �Է¹޴´�.
	 */
	public Person(String name) {
		this.name = name;
	}
	
	/**
	 * ���� ��ü ����
	 * @return ���� ��ü�� ���������� ���ڿ��� ��ȯ
	 */
	@Override
	public String toString() {
		return this.name;
	}
}
