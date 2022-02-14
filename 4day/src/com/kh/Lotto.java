package com.kh;

// 로또 번호 추출

public class Lotto {

	public static void main(String[] args) {

		int[] lotto = new int[6]; // 로또 번호는 6개니깐 index를 6개 만듦
		
		// 초기값을 지정해주지 않아도 지정한 데이터 타입의 디폴트값이 초기값으로 설정된다.
		// int : 0, double : 0.0, boolean : false, char : ' ', String : null

		boolean stop = false;
		int count = 0;

		// 무한 루프 만들기
		while (!stop) {
			int num = (int) (Math.random() * 45) + 1;

			// 중복체크
			if (dupChk(lotto, num) && count != 0) { // if의 괄호 안엔 값, 조건식이 온다. 이때 값과 조건식은 boolean타입
				continue;
			}

			lotto[count++] = num;
//			count++;

			// 무한 루프를 빠져나오는 조건
			if (count == 6) {
				stop = true;
			}
		} // end of while -> 무한루프

		for (int i = 0; i < lotto.length; i++) {
			System.out.printf(lotto[i] + " ");
		}

	} // end of main

	// 배열 내 중복 체크
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
