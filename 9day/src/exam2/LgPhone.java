package exam2;

public class LgPhone extends Phone {
	
	@Override
	public void sendVoice(String msg) {
		super.sendVoice(msg);
		System.out.println("LG폰으로 전달하다.");
	}
}
