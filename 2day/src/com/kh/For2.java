package com.kh;

public class For2 {

	public static void main(String[] args) {
		
		// 다중 for문 (for문 안에 또다른 for문을 만들어서 추가 분기를 생성)
		// 구구단 2~9단을 한 번에 만들기
		
		int startDansu = 2;
		int endDansu = 9;
		
		for (int i = startDansu; i <= endDansu; i++) {
			
			System.out.println("===" + i + "단 출력 ===");

			for (int j = 1; j <= 9; j++) {

				System.out.println(i + " x " + j + " = " + i * j);
			}
		}

	}

}
/* 수행 순서
 * 1. int i = 1
 * 2. i <= 9 참인지 거짓인지 판별
 * 3. (참이면) 내부에 있는 for문을 시행
 * 4. int j = 1
 * 5. j <= 9 참인지 거짓인지 판별
 * 6. (참이면) 시행문 System.out.println(i + " x " + j + " = " + i * j) 실행 -> 2 x 1 = 2 출력
 * 7. j++ 시행 (j값이 2로 바뀜)
 * 8. j <= 9 참인지 거짓인지 판별
 * 9. (참이면) 시행문 System.out.println(i + " x " + j + " = " + i * j) 실행 -> 2 x 2 = 4 출력
 * 10. j++ 시행 (j값이 3으로 바뀜)
 * 11. j값이 조건에 해당하지 않을 때까지 반복 (j값이 10이 될 때까지)
 * 12. 내부 for문을 빠져나와 바깥 for문의 수식(i++) 시행 -> i값이 3으로 바뀜
 * 13. 2~11 프로세스 반복
 * 14. 이를 계속 반복하다 i값이 9를 초과할 경우 해당 작업을 끝냄.
 */
