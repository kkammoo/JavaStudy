package solution6;

public class MemberExample {

	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.name = "최하얀"; // name 필드값 변경
		member.age = 23;			// age 필드값 변경
		
		System.out.println(member.name);
		System.out.println(member.id);				// id와 password는 초기화가 되지 않았기 때문에 디폴트값인 null이 출력된다.
		System.out.println(member.password);
		System.out.println(member.age);
		
		
		Member[] members = new Member[3];
		members[0] = new Member();
		members[0].name = "홍길동1";
		members[0].age = 10;
		
		members[1] = new Member();
		members[1].name = "홍길동2";
		members[1].age = 20;
		
		members[2] = new Member();
		members[2].name = "홍길동3";
		members[2].age = 30;
		
		for (Member m : members) {
			System.out.println(m.name);
			System.out.println(m.id);
			System.out.println(m.password);
			System.out.println(m.age);
			
			m.smile();
			System.out.println("===");
		} // end of for
		
		Member member2 = new Member("홍길동", "hong");
		System.out.println(member2.name);
		System.out.println(member2.id);
		
		
	} // end of main

} // end of class
