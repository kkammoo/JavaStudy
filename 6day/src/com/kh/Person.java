package com.kh;

public class Person {

//	int age;
//	public int age;
	private int age; // 보통 멤버필드는 비공개로 해놓는다. 외부에서 변경을 허락하지 않음.
	
	private Calculator calculator = new Calculator(); // 필드를 통해 Person 클래스에서 Calculator 클래스의 정보를 참조할 수 있다.
	
	
	public Person() {
//		setAge(20); // 사용자에서 멤버필드의 값을 지정할 수 있음.
	}
	
	public Person(Calculator calculator) {
		this.calculator = calculator; // 사용자를 통해 Person 클래스에서 Calculator 클래스의 정보를 참조할 수 있다.
	}
	
	public void smile() {
		System.out.println("웃다" + age);
	}
	
//	private void setAge(int age) { 
//		if (age < 0) {
//			return; // age가 음수일 경우 값을 보내지 않겠다. 외부 입력값을 통제할 수 있다.
//		}
//		this.age = age;
//	}
	
	public void setAge(int age) {
		if (age < 0) {
			return;
		}
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator; // 메소드를 통해 Person 클래스에서 Calculator 클래스의 정보를 참조할 수 있다.
	}
	
	public Calculator getCalculator() {
		return this.calculator;
	}

}

// 디폴트 (아무것도 작성 X), public, private, protected
/*  가시 범위
 *  디폴트 : 같은 패키지 내에선 공개
 *  public : 다른 패키지에서도 공개
 *  private : 클래스 내에서 공개
 *  protected : 
 */

// 클래스의 멤버필드는 자신이 통제할 수 있도록 만드는 것이 좋다.