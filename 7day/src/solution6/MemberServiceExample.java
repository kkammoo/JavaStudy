package solution6;

import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {
		
		MemberService memberService = new MemberService();
		Scanner scanner = new Scanner(System.in);
		boolean stop = false;
		
		String selectedNumber = null;
		String id = null;
		String password = null;
		boolean loginOk = false;
		Loginchk result = null;
		
		while (!stop) {
			System.out.println("1.�α��� 2.�α׾ƿ� 3.����");
			System.out.print("���� > ");
			selectedNumber = scanner.nextLine();
			
			switch(selectedNumber) {
			case "1": // �α���
				System.out.print("id : ");
				id = scanner.nextLine();
				System.out.print("password : ");
				password = scanner.nextLine();
				
				result = memberService.login(id, password);
				
				if (result == Loginchk.OK) { // �α��� ����
					loginOk = true;
					System.out.println("�α��� �Ǿ����ϴ�.");
				} else if (result == Loginchk.NOK) { // �α��� ����
					loginOk = false;
					System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
				} else if (result == Loginchk.FAIL) { // �α��� 3�� ����
					loginOk = false;
					stop = true;
					System.out.println("�α��� 3�� �����߽��ϴ�!");
				}
				
				break;
				
			case "2": // �α׾ƿ�
				if (loginOk) {
					memberService.logout(id);
				} else {
					System.out.println("�α������� ���� �����Դϴ�.");
				}
				
				break;
				
			case "3":
				stop = true;
				continue;
				
			} // end of switch
			
		} // end of while
		System.out.println("���α׷� ����!");

	} // end of main

} // end of class
