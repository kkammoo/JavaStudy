package com.kh;

public class ThreeOperator {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 3;
		
		if (x > y) {
			System.out.println("x가 크다.");
		} else if (x < y) {
			System.out.println("y가 크다.");
		} else if (x == y) {
			System.out.println("x, y는 같다.");
		}
		
//		String result = (x > y) ? "크다." : "작다."; // 삼항 연산식. -> (조건식) ? 참 : 거짓;
//		String result = (x > y) ? "x가 크다." : (x < y) ? "y가 크다" : "x, y는 같다."; // 삼항 연산식으로 다중 분기 표현이 가능하다.
		String result = (x > y) ? "x가 크다." :
						(x < y) ? "y가 크다." : "x, y는 같다."; // 분기가 많아지면 가독성이 떨어진다.
		System.out.println(result);
	}
}
