package com.kh;

public class Car2Main {

	public static void main(String[] args) {
		
		Car2 c1 = new Car2();
		System.out.println(c1.getCount());
		System.out.println(c1.getCount2());
		
		Car2 c2 = new Car2();
		System.out.println(c2.getCount());
		System.out.println(c2.getCount2());

		Car2 c3 = new Car2();
		System.out.println(c3.getCount()); // static은 값을 공유하기 떄문에 객체를 생성할 때마다 1씩 증가해서 최종 3이 됨.
		System.out.println(c3.getCount2()); // 객체 필드는 객체 생성마다 추가로 생성되기 때문에 계속 1이 나옴.
		
		
		///////////////////////////////////////////////
		
		System.out.println(Car2.count); // 클래스 필드 값은 객체 생성 없이 불러올 수 있다.
//		System.out.println(Car2.maxSpeed); // 객체 필드 값은 객체를 생성해야지 불러올 수 있다.
		System.out.println(c1.maxSpeed);
		
		
		Car2.getCount(); // 메소드 역시 필드와 마찬가지로 클래스 메소드는 객체생성 없어도 불러올 수 있다.
//		Car2.getMaxSpeed(); // 객체 메소드는 객체를 생성해야 불러올 수 있다.
	}

}
