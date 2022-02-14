package Inheritance;

public class Student extends Person {
	
	int hakbun;
	
	public Student() {
		
	}
	
	public Student(String name, int age) {
		super(name, age); // 부모 생성자 호출 할 때 생성자의 매개변수에 따라 이런 모양도 나올 수 있다.
	}
	
	
	public void study() {
		System.out.println("공부하다");
	}
	
	@Override // 오버라이드를 붙여주면 오타가 있을 때 확인할 수 있다. 없으면 새로운 기능 추가로 인식함.
	public void eat() { // 상위클래스(Person)에 있는 eat메소드 재정의. 메소드 이름을 똑같이 쓰고 내용만 바꾼다.
		super.eat();
		System.out.println("많이 먹다"); // 부모 클래스의 eat메소드를 실행하고 실행
	}
	
//	@Override
//	public void walk() { // 부모 클래스에서 final이 선언되었기 때문에 자식 클래스에서 재정의할 수 없다.
//		
//	}
	
}
