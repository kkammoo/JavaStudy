package solution7.ques5;

public class Child extends Parent {
	private String name;
	
	
	public Child() {
		this("홍길동"); // 생성자 오버로딩후 다른 생성자 호출
		System.out.println("Child() call");
	}
	
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
