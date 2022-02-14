package com.kh;

// �ζ� ��ȣ ����

public class Lotto {

	public static void main(String[] args) {

		int[] lotto = new int[6]; // �ζ� ��ȣ�� 6���ϱ� index�� 6�� ����
		
		// �ʱⰪ�� ���������� �ʾƵ� ������ ������ Ÿ���� ����Ʈ���� �ʱⰪ���� �����ȴ�.
		// int : 0, double : 0.0, boolean : false, char : ' ', String : null

		boolean stop = false;
		int count = 0;

		// ���� ���� �����
		while (!stop) {
			int num = (int) (Math.random() * 45) + 1;

			// �ߺ�üũ
			if (dupChk(lotto, num) && count != 0) { // if�� ��ȣ �ȿ� ��, ���ǽ��� �´�. �̶� ���� ���ǽ��� booleanŸ��
				continue;
			}

			lotto[count++] = num;
//			count++;

			// ���� ������ ���������� ����
			if (count == 6) {
				stop = true;
			}
		} // end of while -> ���ѷ���

		for (int i = 0; i < lotto.length; i++) {
			System.out.printf(lotto[i] + " ");
		}

	} // end of main

	// �迭 �� �ߺ� üũ
	public static boolean dupChk(int[] lotto, int num) {
		boolean result = false;

		for (int i = 0; i < lotto.length; i++) {
			if (lotto[i] == num) {
				result = true;
				break;
			}
		}

		return result;
	}

} // end of class
