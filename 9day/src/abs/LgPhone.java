package abs;

public class LgPhone extends Phone {

	public LgPhone(String color) {
		super(color);
	}
	
	@Override
	public void sendVoice() {
		System.out.println("���� �Ҹ��� �����ϴ�");
	}
	
	@Override
	void off() { // �߻� Ŭ������ �ִ� �߻� �޼ҵ��� �����θ� �������Ͽ� �����θ� ����� ������ ���� ������.
		System.out.println("LG���� ���ϴ�");
		
	}
}
