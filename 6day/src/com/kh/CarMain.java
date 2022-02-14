package com.kh;

public class CarMain {

	public static void main(String[] args) {

		Car car1 = new Car(); // 매개변수가 없는 생성자
		
		Car car2 = new Car("Black");
		System.out.println(car2.color); // 객체 car2에 있는 저장정보 color를 불러옴
		System.out.println(car2.cc);
		
		car1.run(); // .을 찍어도 on, off 메소드는 private 메소드이기 때문에 public 메소드인 Run만 보인다.
		car2.run();
		
		
	}

}
