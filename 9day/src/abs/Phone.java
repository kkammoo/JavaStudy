package abs;

abstract public class Phone {

	private String color;
	
	public Phone(String color) {
		super();
		this.color = color;
	}
	
	public void on() {
		System.out.println("�޴����� �Ѵ�");
	}
	
	public void sendVoice() {
		System.out.println("�Ҹ��� �����ϴ�");
		
	}
	
	public String getColor() {
		return color;
	}
	
	abstract void off();
	// �߻� �޼ҵ� {}(������)�� ���� �޼ҵ�.
	// �߻� �޼ҵ尡 �ϳ��� ������ �� Ŭ������ �߻� Ŭ������ �ȴ�.
	// �߻� �޼ҵ带 ��ӹ��� Ŭ���� ���� �߻� Ŭ������ �ȴ�.
}
