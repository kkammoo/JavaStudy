package solution7.ques5;

public class Child extends Parent {
	private String name;
	
	
	public Child() {
		this("ȫ�浿"); // ������ �����ε��� �ٸ� ������ ȣ��
		System.out.println("Child() call");
	}
	
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
