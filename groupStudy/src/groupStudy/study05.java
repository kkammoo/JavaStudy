package groupStudy;

public class study05 {

	public static void main(String[] args) {
		// 1000 미만의 자연수 중에 3과 5의 배수의 총합
		
		int three = 0;
		int five = 0;
		int fifteen = 0;
		
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0) {
				three += i;
			} else if (i % 5 == 0) {
				five += i;
			} else if (i % 15 == 0) {
				fifteen += i;
			}
		}
		System.out.println(three + five - fifteen);
	}
}
