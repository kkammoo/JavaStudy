package practice;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car(); // ���� �޼ҵ� ���� Ŭ����(����) �޼ҵ��̹Ƿ� ��ü�� �����ؾ� �Ѵ�.
		myCar.speed = 60;
		myCar.run();
		
	}
}	