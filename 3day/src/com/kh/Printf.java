package com.kh;

public class Printf {

	public static void main(String[] args) {

		// 교재 p.91 참조

		// println을 이용
		String name = "홍길동";
		int age = 30;
		int height = 180;

		System.out.println("이름 : " + name + ", 나이 : " + age + ", 키 : " + height);

		// printf를 이용
//		System.out.printf("이름 : %1$s, 나이 : %2$s, 키 : %3$d", "홍길동", "30", 180); // 1$, 2$, 3$는 순번. s d는 데이터 타입
//		System.out.println();
//		System.out.printf("이름 : %s, 나이 : %s, 키 : %d", "홍길동", "30", 180);
//		System.out.println();
//		// 순번은 생략 가능.

		System.out.printf("이름 : %s, 나이 : %s, 키 : %d", name, age, height); // 순번을 지정해줄 수 있지만, 차례대로 매칭하는 게 가독성이 좋다.

	}

}
