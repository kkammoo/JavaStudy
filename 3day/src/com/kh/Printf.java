package com.kh;

public class Printf {

	public static void main(String[] args) {

		// ���� p.91 ����

		// println�� �̿�
		String name = "ȫ�浿";
		int age = 30;
		int height = 180;

		System.out.println("�̸� : " + name + ", ���� : " + age + ", Ű : " + height);

		// printf�� �̿�
//		System.out.printf("�̸� : %1$s, ���� : %2$s, Ű : %3$d", "ȫ�浿", "30", 180); // 1$, 2$, 3$�� ����. s d�� ������ Ÿ��
//		System.out.println();
//		System.out.printf("�̸� : %s, ���� : %s, Ű : %d", "ȫ�浿", "30", 180);
//		System.out.println();
//		// ������ ���� ����.

		System.out.printf("�̸� : %s, ���� : %s, Ű : %d", name, age, height); // ������ �������� �� ������, ���ʴ�� ��Ī�ϴ� �� �������� ����.

	}

}
