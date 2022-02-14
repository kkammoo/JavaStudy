package com.kh;

public class TypeEscape {

	public static void main(String[] args) {
		
		// �⺻ Ÿ��
		int x = 10; // ���� Ÿ�� (byte, char, short, int, long)
		double y = 3.14; // �Ǽ� Ÿ�� (float, double)
		boolean stop = true; // �� Ÿ�� (���� �׻� true or false�� �´�.)
		
		char ch = 'A'; // ���� Ÿ�� ''��������ǥ�� ���´�.
		String name = "ȫ�浿"; // ���ڿ� Ÿ��(s�� �� �빮�ڷ�!) ""ū����ǥ�� ���´�.
		// ���ڴ� ���ڿ��� ���� �� ������ ex) "A" <-�� �� ���ڿ��� �ν�. ���ڿ��� ���ڷ� ���� �� ����.
		// String�� �⺻ Ÿ���� �ƴ�, ���� Ÿ���̴�. �׷��� ù ���ڸ� �빮�ڷ� ��.
		
		long z = 1000000l; // long Ÿ���� �� �Ҵ� �� �������� ��ҹ��� l�� ����� �Ѵ�.
						   // �� ���̸� int Ÿ������ �ڵ� �ν���.
		float f = 3.143232f; // float Ÿ���� �� �Ҵ� �� �������� ��ҹ��� f�� ����� �Ѵ�.
							 // �� ���̸� double Ÿ������ �ڵ� �ν���.
		
		
		// escape
		String str1 = "��� KH ����������"; // "" : ���ڿ� �ĺ� ��ȣ
		System.out.println(str1); // ���ڿ� ���� str1�� ����Ǿ� �ִ� �� [��� KH ����������]�� ���.
		System.out.println("str1"); // ���ڿ� str1�� ���
		
		// ū����ǥ Ȥ�� ��������ǥ�� ���� ����ϰ� ���� �� escape ���ڸ� Ȱ��
		System.out.println("\"��� KH ����������\""); // ū����ǥ�� ���� ���. "��� KH ����������"
		// escape ������ ������ ���� p.66 ����
		
		
		// �Ǽ� Ÿ��
		double i = 5e2; // 5.0 * 10^2 -> ������ ������ ǥ���� 10���� �Ǽ��� �ν�
		System.out.println(i); // 500.0 ���
	}

}
