package com.kh;

/*
 * 국어, 영어, 수학 세 과목의 종점, 평균 구하기 (배열 사용하기)
 */
public class HakJum {

	public static void main(String[] args) {

		int sum = 0; // 총점
		double avg = 0.0; // 평균
		int[] subject = new int[3]; // 배열생성 : int형 배열을 subject라는 이름으로 3칸(0~2)까지 만들겠다. index []는 [0]부터 시작한다.

		subject[0] = 90;
		subject[1] = 70;
		subject[2] = 80;

//		12~16번 실행문을 한 줄로 요약할 수 있다. int[] subject = {90, 70, 80};
//		subject[3] = 50; -> 배열의 범위(0~2)를 벗어났기 때문에 런타임 에러가 뜬다.

		System.out.println(subject[2]); // subject 배열에 속한 2번 값을 불러옴.
		System.out.println(subject.length); // subject 배열의 방 개수 확인

//		합계 구하기 : int sum = subject[0] + subject[1] + subject[2]; 
//		간단하게 이렇게 할 수 있지만 index는 순차적으로 진행되기 때문에 반복문을 사용하는 것이 더 용이하다.

		for (int i = 0; i < subject.length; i++) {
			sum += subject[i];
		}

		avg = (double) sum / subject.length;

		System.out.println("총점 = " + sum);
		System.out.println("평균 = " + avg);

	} // end of main

}

// 과목이 늘어나더라도 index 값만 변경, 추가하면 된다. 아래 반복문과 합계, 총점 실행문은 안 바꾸어도 됨.