package com.kh;

public class Equal {

	public static void main(String[] args) {

		// ���ڿ� �� (���� p.97)
		String name = "ȫ�浿";
		String name2 = "ȫ�浿";

		if (name == name2) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		// �Էµ� ��(ȫ�浿)�� ���ϱ� ������ "����" ���.

		if (name.equals(name2)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
//		
//		
		String name3 = new String("ȫ�浿"); // ���ڿ��� �����ϴ� ���2
		String name4 = new String("ȫ�浿");

		if (name3 == name4) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		// �ܼ� �񱳿����ڸ� �̿��ϸ� ���� "�ٸ���"�� ���´�.

		if (name3.equals(name4)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		// equals �޼ҵ带 �̿��ϸ� "����" ���.
		// ���ڿ��� ���� �� �񱳿����� ==�� �ƴ� equal �޼ҵ带 �̿�����!

	}

}
