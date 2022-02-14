package practice;

public class SingleTon {
	
	// 필드
	private static SingleTon singleTon = new SingleTon();
	
	
	// 생성자
	private SingleTon()	{
		
	}
	
	// 메소드
	public static SingleTon getInstance() {
		return singleTon;
	}
}
