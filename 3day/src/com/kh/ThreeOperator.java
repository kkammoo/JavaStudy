package com.kh;

public class ThreeOperator {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 3;
		
		if (x > y) {
			System.out.println("x�� ũ��.");
		} else if (x < y) {
			System.out.println("y�� ũ��.");
		} else if (x == y) {
			System.out.println("x, y�� ����.");
		}
		
//		String result = (x > y) ? "ũ��." : "�۴�."; // ���� �����. -> (���ǽ�) ? �� : ����;
//		String result = (x > y) ? "x�� ũ��." : (x < y) ? "y�� ũ��" : "x, y�� ����."; // ���� ��������� ���� �б� ǥ���� �����ϴ�.
		String result = (x > y) ? "x�� ũ��." :
						(x < y) ? "y�� ũ��." : "x, y�� ����."; // �бⰡ �������� �������� ��������.
		System.out.println(result);
	}
}
