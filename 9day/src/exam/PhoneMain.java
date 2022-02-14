package exam;

public class PhoneMain {

	public static void main(String[] args) {

		Phone p1 = new Phone();
		
		LgPhone lg = (LgPhone)p1;
		lg.doInternet();
		/* 
		 * 컴파일 오류는 뜨지 않음.
		 * 아무리 p1을 LgPhone 타입으로 강제 형변환을 해줘도 p1의 실체가 Phone의 객체이기 때문에
		 * 인터넷 사용 기능이 없는 p1은 인터넷 사용 기능을 사용할 수 없다.
		 */
		
		Phone p2 = new LgPhone(); // LgPhone의 객체를 만들고 Phone 타입으로 자동 형변환
		
		LgPhone lg2 = (LgPhone)p2; // Phone 타입으로 보던 p2를 LgPhone 타입으로 강제 형변환
		lg2.doInternet(); // p2의 실체는 LgPhone 타입이므로 인터넷 기능을 사용할 수 있다.
	}

}
