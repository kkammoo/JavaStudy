package practice;

public class SingleTon {
	
	// �ʵ�
	private static SingleTon singleTon = new SingleTon();
	
	
	// ������
	private SingleTon()	{
		
	}
	
	// �޼ҵ�
	public static SingleTon getInstance() {
		return singleTon;
	}
}
