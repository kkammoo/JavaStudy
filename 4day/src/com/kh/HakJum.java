package com.kh;

/*
 * ����, ����, ���� �� ������ ����, ��� ���ϱ� (�迭 ����ϱ�)
 */
public class HakJum {

	public static void main(String[] args) {

		int sum = 0; // ����
		double avg = 0.0; // ���
		int[] subject = new int[3]; // �迭���� : int�� �迭�� subject��� �̸����� 3ĭ(0~2)���� ����ڴ�. index []�� [0]���� �����Ѵ�.

		subject[0] = 90;
		subject[1] = 70;
		subject[2] = 80;

//		12~16�� ���๮�� �� �ٷ� ����� �� �ִ�. int[] subject = {90, 70, 80};
//		subject[3] = 50; -> �迭�� ����(0~2)�� ����� ������ ��Ÿ�� ������ ���.

		System.out.println(subject[2]); // subject �迭�� ���� 2�� ���� �ҷ���.
		System.out.println(subject.length); // subject �迭�� �� ���� Ȯ��

//		�հ� ���ϱ� : int sum = subject[0] + subject[1] + subject[2]; 
//		�����ϰ� �̷��� �� �� ������ index�� ���������� ����Ǳ� ������ �ݺ����� ����ϴ� ���� �� �����ϴ�.

		for (int i = 0; i < subject.length; i++) {
			sum += subject[i];
		}

		avg = (double) sum / subject.length;

		System.out.println("���� = " + sum);
		System.out.println("��� = " + avg);

	} // end of main

}

// ������ �þ���� index ���� ����, �߰��ϸ� �ȴ�. �Ʒ� �ݺ����� �հ�, ���� ���๮�� �� �ٲپ ��.