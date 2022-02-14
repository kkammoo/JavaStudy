package groupStudy;

import java.util.Arrays;
import java.util.Scanner;

public class study03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean result = true;
		int booleancnt = 0;
		
		System.out.print("0~9값을 원하는 만큼 입력해주세요. : ");
		String input = sc.nextLine();
		String[] str = input.split(""); // 입력 받은 문자열을 한 글자씩 배열에 넣기
		
		Arrays.sort(str);
		// 배열 값을 오름차순으로 정렬. 0~9까지 한 번씩만 입력했다면 0123456789로 정렬되어 있음.
		
		for (int i = 0; i < str.length; i++) {
			if (str.length != 10) { // str의 배열 길이가 10이 아니면 break로 for문 빠져 나오기 (0~9까지 한 번씩 들어갔으면 배열 길이는 10)
				break;
			} else if (str[i].equals(String.valueOf(i))) { // 값 비교
				booleancnt++;
				// 값이 일치할 떄마다 카운트 1씩 증가. 0~9까지 중복이 없어야 값이 10이 됨.
			}
		}
		
		if (booleancnt == 10) { // 최종 체크
			System.out.println(result);
		} else {
			System.out.println(!result); // str의 배열 길이가 10이 아니거나, 중복된 숫자가 있을 경우 출력.
		}
	}
}
