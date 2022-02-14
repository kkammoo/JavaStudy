package Inheritance;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.eat(); // 부모 클래스 안에 있는 값이 출력. 
		System.out.println("================");
		
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 30;
		s1.smile();
		s1.eat(); // 자식 클래스에서 재정의된 값이 출력.
		s1.study();
		System.out.println("================");
		
		Student s2 = new Student();
		s2.name = "홍길순";
		s2.age = 20;
		s2.smile();
		s2.eat();
		s2.study();
		System.out.println("================");
		
	}

}
