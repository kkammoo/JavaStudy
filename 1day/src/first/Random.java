package first;

public class Random {

	public static void main(String[] args) {
		
		int random = (int)(Math.random()*100)+1; // 0 <= x < 101의 범위를 갖는 랜덤한 수를 출력.
		System.out.println("(1~100)정수값 = " + random);
		
		//3의 배수 체크
		if(random % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		//2의 배수 이면서 3의 배수인지 체크
		// && : 논리 연산자 (and)
		if(random % 2 == 0 && random % 3 == 0) {
			System.out.println("2의 배수 이면서 3의 배수"); //두 조건 (random % 2 == 0, random % 3 == 0)이 모두 참일 때 출력.
		}else {
			System.out.println("2의 배수 이면서 3의 배수가 아닌 값"); //두 조건 중 하나라도 틀리면 출력.
		}
		
	
		//2의 배수 이거나 3의 배수인지 체크
		// || : 논리 연산자 (or)
		if(random % 2 == 0 || random % 3 == 0) {
			System.out.println("2의 배수 이거나 3의 배수"); //두 조건 중 하나라도 참이면 출력.
		}else {
			System.out.println("2의 배수 이거나 3의 배수가 아닌 값"); //두 조건이 모두 거짓일 때 출력.
		}
		
		//2의 배수가 아닌 경우
		// !는 부정(not)의 의미 -> "!= : 같지 않다." 라는 뜻
		if(random % 2 != 0) {
			System.out.println("2의 배수가 아니다.");
		}else {
			System.out.println("2의 배수다.");
		}
		
	}

}
