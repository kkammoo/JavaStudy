package abs;

public class Main {

	public static void main(String[] args) {

		// abstract가 붙은 클래스는 필드, 메소드가 있어도 추상클래스이기 때문에 객체를 생성할 수 없다.
		// 추상클래스는 개념(타입)으로만 사용 가능하다.
//		Phone phone = new Phone();
		
		Phone phone = new LgPhone("black"); // 실체화 가능한 자식 클래스를 통해 객체 생성가능.
		phone.on();
		phone.sendVoice();
		phone.off();
		System.out.println(phone.getColor());
	}

}
