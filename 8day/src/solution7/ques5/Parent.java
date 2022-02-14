package solution7.ques5;

public class Parent {
	public String nation;
	
	
	public Parent() {
		this("대한민국"); // 생성자 오버로딩 후 다른 생성자 호출
		System.out.println("Parent() call");
	}
	
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
