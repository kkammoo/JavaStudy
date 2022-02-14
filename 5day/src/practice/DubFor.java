package practice;

public class DubFor {

	public static void main(String[] args) {
		// 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구하여 (x, y)형태로 출력해보세요
		// 단, x, y는 10이하의 자연수
		int sum = 0;
		
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y<= 10; y++) {
				sum = (4 * x) + (5 * y);
				
				if (sum == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	}
}
