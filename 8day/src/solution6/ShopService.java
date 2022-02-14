package solution6;
/* 싱글톤
 * 가상세계에서 유일한 객체를 생성하고자 하는 디자인 패턴.
 */
public class ShopService {
	// 필드
	// private : 외부에서 값을 수정하지 못하도록 함.
	// static : 실행클래스에서 프로그램이 시작되기 전에 초기화하기 위함.
	private static ShopService instance = new ShopService();
	
	
	// 생성자
	// private : 외부에서 생성자를 호출하지 못하도록 private 생성자를 만든다.
	private ShopService()	{
	}
	
	
	// 메소드
	// public : 외부에서 내부에 생성된 객체를 가져가게 하기 위함.
	// static : 1. 클래스(정적) 멤버 필드를 사용했기 때문에. 2. 외부에서 객체 생성 없이 메소드를 사용할 수 있게 하기 위함.
	public static ShopService getInstance()	{
		return instance;
	}
	
	
	
}
