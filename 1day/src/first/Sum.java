package first;

public class Sum {

	public static void main(String[] args) {
		//int는 정수 값의 데이터 타입
		int x = 10;
		int y = 20;
		
		int result = x + y;
		
		System.out.println("x + y = " + result);

		int result2 = calculate(30,40); //claculate 메소드로 전달되는 값
		System.out.println("resulr2 = " + result2);
		
		int result3 = calculate(50,60); 
		System.out.println("resulr3 = " + result3);
	}

	//메소드
	//메소드 하나를 만들면 이 메소드를 이용한 여러 코드를 반복적으로 실행할 수 있다.
	public static int calculate(int num1, int num2) {
		return num1 + num2;
	}
	
}
