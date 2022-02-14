package practice;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car(); // 메인 메소드 역시 클래스(정적) 메소드이므로 객체를 생성해야 한다.
		myCar.speed = 60;
		myCar.run();
		
	}
}	