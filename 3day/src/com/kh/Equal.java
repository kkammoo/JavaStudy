package com.kh;

public class Equal {

	public static void main(String[] args) {

		// 문자열 비교 (교재 p.97)
		String name = "홍길동";
		String name2 = "홍길동";

		if (name == name2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		// 입력된 값(홍길동)을 비교하기 때문에 "같다" 출력.

		if (name.equals(name2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
//		
//		
		String name3 = new String("홍길동"); // 문자열을 저장하는 방식2
		String name4 = new String("홍길동");

		if (name3 == name4) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		// 단순 비교연산자를 이용하면 값이 "다르다"가 나온다.

		if (name3.equals(name4)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		// equals 메소드를 이용하면 "같다" 출력.
		// 문자열을 비교할 땐 비교연산자 ==이 아닌 equal 메소드를 이용하자!

	}

}
