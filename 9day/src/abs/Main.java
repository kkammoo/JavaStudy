package abs;

public class Main {

	public static void main(String[] args) {

		// abstract�� ���� Ŭ������ �ʵ�, �޼ҵ尡 �־ �߻�Ŭ�����̱� ������ ��ü�� ������ �� ����.
		// �߻�Ŭ������ ����(Ÿ��)���θ� ��� �����ϴ�.
//		Phone phone = new Phone();
		
		Phone phone = new LgPhone("black"); // ��üȭ ������ �ڽ� Ŭ������ ���� ��ü ��������.
		phone.on();
		phone.sendVoice();
		phone.off();
		System.out.println(phone.getColor());
	}

}
