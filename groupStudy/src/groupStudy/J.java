package groupStudy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class J {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean pass = false;
		System.out.println("0~9 ���ڸ� 10�ڸ� �Է��ϼ���");
		String input = scan.nextLine(); // ���� �Է¹ޱ�
		String[] numArr = input.split(""); // ���� �и��ϱ�
		HashSet<String> hashSet = new HashSet<>(Arrays.asList(numArr));
		String[] result = hashSet.toArray(new String[0]);

			for (int i = 0; i < result.length; i++) {
				char tmp = result[i].charAt(0);

				if (!(Character.isDigit(tmp))) {
					pass=false;
					break;
				} else {
					if (result.length == 10) {
						pass=true;
					} else {
						pass=false;
					}
				}
			}
		System.out.println(pass);
	
	}
}
