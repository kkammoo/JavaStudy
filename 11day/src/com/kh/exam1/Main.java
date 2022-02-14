package com.kh.exam1;

public class Main {

	public static void main(String[] args) {
		
	// 이름이 있는 자식클래스를 사용한 메소드 재정의
	Person person = new Man();
	person.eat();
	
	((Man)person).smile(); // 강제형변환 가능
		
		
	// 익명 자식클래스를 사용한 메소드 재정의
	Person person2 = new Person() {
		@Override
		public void eat() {
			System.out.println("많이 먹다2");
			smile();
		}
	// 익명 자식클래스 내부에서 새롭게 정의된 필드 혹은 메소드는 내부에서만 사용 가능하다.
		private void smile() {
			System.out.println("웃다2");
		}
	};
	person2.eat();
//	person2.smile(); 블록 바깥에선 해당 메소드를 불러올 수 없다.
	}

}
