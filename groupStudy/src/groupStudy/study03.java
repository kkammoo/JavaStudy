package groupStudy;

import java.util.Arrays;
import java.util.Scanner;

public class study03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean result = true;
		int booleancnt = 0;
		
		System.out.print("0~9���� ���ϴ� ��ŭ �Է����ּ���. : ");
		String input = sc.nextLine();
		String[] str = input.split(""); // �Է� ���� ���ڿ��� �� ���ھ� �迭�� �ֱ�
		
		Arrays.sort(str);
		// �迭 ���� ������������ ����. 0~9���� �� ������ �Է��ߴٸ� 0123456789�� ���ĵǾ� ����.
		
		for (int i = 0; i < str.length; i++) {
			if (str.length != 10) { // str�� �迭 ���̰� 10�� �ƴϸ� break�� for�� ���� ������ (0~9���� �� ���� ������ �迭 ���̴� 10)
				break;
			} else if (str[i].equals(String.valueOf(i))) { // �� ��
				booleancnt++;
				// ���� ��ġ�� ������ ī��Ʈ 1�� ����. 0~9���� �ߺ��� ����� ���� 10�� ��.
			}
		}
		
		if (booleancnt == 10) { // ���� üũ
			System.out.println(result);
		} else {
			System.out.println(!result); // str�� �迭 ���̰� 10�� �ƴϰų�, �ߺ��� ���ڰ� ���� ��� ���.
		}
	}
}
