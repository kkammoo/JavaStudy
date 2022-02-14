package solution6;

public class MemberExample {

	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.name = "���Ͼ�"; // name �ʵ尪 ����
		member.age = 23;			// age �ʵ尪 ����
		
		System.out.println(member.name);
		System.out.println(member.id);				// id�� password�� �ʱ�ȭ�� ���� �ʾұ� ������ ����Ʈ���� null�� ��µȴ�.
		System.out.println(member.password);
		System.out.println(member.age);
		
		
		Member[] members = new Member[3];
		members[0] = new Member();
		members[0].name = "ȫ�浿1";
		members[0].age = 10;
		
		members[1] = new Member();
		members[1].name = "ȫ�浿2";
		members[1].age = 20;
		
		members[2] = new Member();
		members[2].name = "ȫ�浿3";
		members[2].age = 30;
		
		for (Member m : members) {
			System.out.println(m.name);
			System.out.println(m.id);
			System.out.println(m.password);
			System.out.println(m.age);
			
			m.smile();
			System.out.println("===");
		} // end of for
		
		Member member2 = new Member("ȫ�浿", "hong");
		System.out.println(member2.name);
		System.out.println(member2.id);
		
		
	} // end of main

} // end of class
