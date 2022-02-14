package first;

public class Calculator {

	public static void main(String[] args) {
		int result = sum(10,20);
		System.out.println(result);
		//System.out.println("===========");
		line(5);
		result = minus(10,20);
		//변수를 선언한 뒤, 변수의 이름만으로 값을 재설정할 수 있다.
		System.out.println(result);
		//출력값 result는 minus로 재설정 된 값이 출력된다.
		//System.out.println("===========");
		line(10);
		result = multi(10, 20);
		System.out.println(result);
		//System.out.println("===========");
		line(15);
		double result2 = devide(10, 20);
		System.out.println(result2);

	}
	
	//구분선
	//"void" : 반환값(return)이 없다는 뜻.
	public static void line() {
		System.out.println("=====");
	}
	
	public static void line(int count) {
		for(int i=1; i<=count; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
		
	//덧셈
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;	
	}
		
	//뺄셈
	public static int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	//곱셈
	public static int multi(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	//나눗셈
	//double은 실수(소수점)의 데이터
	public static double devide(int num1, int num2) {
		double result = num1 / (double)num2;
		return result;
	}
}

/* 동일한 클래스 안에서 불러오는 메소드 이름은 달라야 한다.
 * 메소드의 이름은 메소드의 역할을 알 수 있는 이름으로 짓는 것이 좋다.
 * 코드에 대한 가독성 상승
 */