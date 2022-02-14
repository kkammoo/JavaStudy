package groupStudy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class J {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean pass = false;
		System.out.println("0~9 숫자를 10자리 입력하세요");
		String input = scan.nextLine(); // 숫자 입력받기
		String[] numArr = input.split(""); // 숫자 분리하기
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
