package abs;

abstract public class Phone {

	private String color;
	
	public Phone(String color) {
		super();
		this.color = color;
	}
	
	public void on() {
		System.out.println("휴대폰을 켜다");
	}
	
	public void sendVoice() {
		System.out.println("소리를 전달하다");
		
	}
	
	public String getColor() {
		return color;
	}
	
	abstract void off();
	// 추상 메소드 {}(구현부)가 없는 메소드.
	// 추상 메소드가 하나라도 있으면 그 클래스는 추상 클래스가 된다.
	// 추상 메소드를 상속받은 클래스 역시 추상 클래스가 된다.
}
