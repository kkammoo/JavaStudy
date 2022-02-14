package com.kh;

public class TypeChange {

	public static void main(String[] args) {

		// Ÿ�� ��ȯ�� ���� ���� -> ū ������ �����ϴ�. �ݴ�� �Ұ���.
		/*
		 * Ÿ�� ũ�� �� byte < short < int < long < float < double
		 */

		// �ڵ� Ÿ�� ��ȯ
		byte a = 10; // byte Ÿ�� ���� a�� 10�� ����.
		int b = a; // byte Ÿ�� ���� a�� ����� 10�� int Ÿ�� ���� b�� �����ؼ� ����.
		// int Ÿ���� byte Ÿ�Ժ��� ��� ������ ũ�� ������ �ڵ����� �� ��ȯ�� �ȴ�.

		long longValue = 5000000000L;
		float floatValue = longValue; // 5.0E9f�� �����. �׷��� ������ 8����Ʈ�� longŸ���� 4����Ʈ�� floatŸ�Կ� ���� �� ����.
		double doubleValue = longValue; // 5.0E9�� �����. float�� �ڵ� ��ȯ�� �����ϱ� ������ �� ū ������ double�ε� �ڵ� ����ȯ�� ��.

		// ���� ����
		int x = 1;
		int y = 2;
		double result = x / y; // ������ ������ ���� ����� ������ ���´�.
		System.out.println(result); // ���� Ÿ���� ������� ������ ������ 0.0 ���.

		double result2 = (double) x / y; // x���� double Ÿ������ ����ȯ �ϸ� �Ǽ� Ÿ�԰� ���� Ÿ���� ������ �ǹǷ� ������� �Ǽ��� ���´�.
		System.out.println(result2); // 0.5 ���.
		
		
		int diceNumber = (int)(Math.random() * 6) +1; // �Ǽ� Ÿ���� Math.random()�� ���� Ÿ�� int�� ����ȯ.
		System.out.println(diceNumber); // �Ҽ��� ������ ���� �ս��� �Ͼ����, �䱸�ϴ� ���� �������� ������ ������.
		
		// ���ڿ��� �⺻ Ÿ������ ���� Ÿ�� ��ȯ (���� p.83 ����)
		String str1 = "10";
		
		int result3 = Integer.parseInt(str1);
		byte result4 = Byte.parseByte(str1);
		long result5 = Long.parseLong(str1);
		short result6 = Short.parseShort(str1);
		
		long z = result3 + result4 + result5 + result6; // �ش� ���� Ÿ�� �� ���� ū Ÿ���� long�̱� ������ longŸ�� ������ �����Ѵ�.
		System.out.println(z);
		// ����� 40�� byte, int���� �ս� ���� ���� �� �ֱ� ������ �Ʒ��� ���� ���๮�� �����ϴ�.
		byte result7 = (byte)z;
		System.out.println(result7);
		int result8 = (int)z;
		System.out.println(result8);
		
		double result9 = Double.parseDouble(str1);
		System.out.println(result9); // double Ÿ������ ��ȯ�߱� ������ �Ǽ� 10.0�� ��µȴ�.
		
		// �⺻ Ÿ���� ���ڿ��� ���� Ÿ�� ��ȯ String.valueOf()
		String str2 = String.valueOf(result3);
		String str3 = String.valueOf(result4);
		String str4 = String.valueOf(result5);
		String str5 = String.valueOf(result6);
		
		System.out.println(str2 + str3 + str4 + str5);
		// ���� 10�� ���ڿ��� ��ȯ�߱� ������ ���� ������ �ƴ�, ���ڿ� ������ �Ͼ 10101010�� ��µȴ�.

	}

}
