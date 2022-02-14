package abs;

public class LgPhone extends Phone {

	public LgPhone(String color) {
		super(color);
	}
	
	@Override
	public void sendVoice() {
		System.out.println("맑은 소리를 전달하다");
	}
	
	@Override
	void off() { // 추상 클래스에 있는 추상 메소드의 구현부를 재정의하여 구현부를 만들면 컴파일 오류 해제됨.
		System.out.println("LG폰을 끕니다");
		
	}
}
