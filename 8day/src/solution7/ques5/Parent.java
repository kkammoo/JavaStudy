package solution7.ques5;

public class Parent {
	public String nation;
	
	
	public Parent() {
		this("���ѹα�"); // ������ �����ε� �� �ٸ� ������ ȣ��
		System.out.println("Parent() call");
	}
	
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
