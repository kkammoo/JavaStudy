package first;

public class VariableInitializationExample {

	public static void main(String[] args) {
		int x;  //정수형 변수 선언 : 정수형 데이터 타입(int)으로 x라는 변수를 선언
		x = 10; //변수 x에 정수 10을 할당(대입, 저장) - 최초로 변수에 값을 할당하는 것을 '초기화' 라고 한다.
		System.out.println("x = " + x);
		
		x = 20; //정수형 변수 x에 20을 재할당
		System.out.println("x = " + x);
		
		int y = 20; //정수형 변수 선언 + 초기화
		System.out.println("y = " + y);
	}
}
