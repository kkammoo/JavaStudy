package com.kh.exam6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("울산*KH".substring(3));
		System.out.println("울산----------------*KH".indexOf("*")+1); // KH의 인덱스 번호 찾기.
		System.out.println("울산----------------*KH".substring(19)); // indexOf() 메소드로 찾은 인덱스 번호를 이용해서 글자 추출
		
		// 종합
		String str2 = "울산----------------*KH";
		int findedPosition = str2.indexOf("*")+1;
//		System.out.println(str2.substring(str2.indexOf("*")+1));
		System.out.println(str2.substring(findedPosition));
		
		
		
		
		// 스캐너를 활용하여 원하는 문자열 출력
		boolean stop = false;
		
		while(!stop) {
			Scanner sc = new Scanner(System.in);
			System.out.print("이름을 입력하세요 : ");
			String name = sc.nextLine();
			System.out.println(name);
			
			// 이름에 숫자가 들어가면 재입력하도록 유도
			if (existNumber(name)) {
				System.out.println("이름에 숫자가 포함되었습니다.");
				continue;
			} else {
				stop = true;
				continue;
			}
			
		} // end of while
		
	} // end of main

	// 이름에 숫자가 들어가면 재입력하도록 유도
	private static boolean existNumber(String name) {
		
		boolean result = false;
		
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			
			if (ch >= 48 && ch <= 58) { // 아스키 코드를 이용해 0~9가 포함되었는지 확인.
//				System.out.println("이름에 숫자가 포함되었습니다");
				result = true;
				break;
			}
//			System.out.println(ch);
		}
		
		return result;
	}

}
