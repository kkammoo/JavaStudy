package exam2;

public class SamsungPhone extends Phone {

	@Override
	public void sendVoice(String msg) {
		super.sendVoice(msg);
		System.out.println("Samsung폰으로 전달하다");
	}
}
