package exam2;

public class PhoneMain {

	public static void main(String[] args) {

		Person person = new Person();
		
		Phone phone = new Phone();
		LgPhone lg = new LgPhone();
		SamsungPhone sp = new SamsungPhone();
		
		person.makeCall(phone); System.out.println("==");
		person.makeCall(lg); System.out.println("==");
		person.makeCall(sp); System.out.println("==");

	}

}
