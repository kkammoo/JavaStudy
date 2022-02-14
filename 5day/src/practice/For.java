package practice;

public class For {

	public static void main(String[] args) {
		// for 문을 이용해서 1~100까지 정수 중에 3의 배수의 총합을 구하는 코드를 작성
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}

}
