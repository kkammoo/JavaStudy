package com.kh;

public class CarMain {

	public static void main(String[] args) {

		Car car1 = new Car(); // �Ű������� ���� ������
		
		Car car2 = new Car("Black");
		System.out.println(car2.color); // ��ü car2�� �ִ� �������� color�� �ҷ���
		System.out.println(car2.cc);
		
		car1.run(); // .�� �� on, off �޼ҵ�� private �޼ҵ��̱� ������ public �޼ҵ��� Run�� ���δ�.
		car2.run();
		
		
	}

}
