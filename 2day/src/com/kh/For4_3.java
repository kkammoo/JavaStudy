package com.kh;

public class For4_3 {

	public static void main(String[] args) {
		// 4행 4열 오름차순 모양의 * 찍기 (오른쪽 정렬)
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= 1; j--) {
				if (i < j) {
					System.out.print(" "); // i값이 j값보다 작을 경우 공백을 출력
				} else {
					System.out.print("*"); // i값이 j값보다 클 경우 *를 출력
				}
			}
			System.out.println();
		}

	}

}
// i의 값은 1에서 4까지 (5가 되면 작업이 끝남.) 4회 수행.
// j의 값은 4에서 1까지 4회 수행

// 시행 순서
/* i = 1인 경우
01. i <= 4인지 확인.
02. (참인 경우) 내부 for문으로 이동.
03. j의 값 확인.
04. j의 값이 1보다 크거나 같은지 확인.
05. (참인 경우) if문으로 이동.
06. if문의 조건 (i > j) 확인.
07. 조건이 참이라면 공백(" ")을 출력하고 거짓이면 *을 출력.
08. j의 값이 4, 3, 2일땐 공백을 출력, 1일땐 최종값이 0이 되기 때문에 *를 출력
*/
