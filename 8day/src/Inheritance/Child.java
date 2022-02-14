package Inheritance;

public class Child extends Parent { // Child 클래스는 Parent 클래스를 상속하고 있다.

	// 생성자
	public Child() { // 기본 생성자
		super(); // 부모생성자 호출. : Parent 클래스의 디폴트 생성자 호출.
		System.out.println("public Child() 호출됨");
	}
}
