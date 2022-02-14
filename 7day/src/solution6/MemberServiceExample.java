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
			System.out.println("1.로그인 2.로그아웃 3.종료");
			System.out.print("선택 > ");
			selectedNumber = scanner.nextLine();
			
			switch(selectedNumber) {
			case "1": // 로그인
				System.out.print("id : ");
				id = scanner.nextLine();
				System.out.print("password : ");
				password = scanner.nextLine();
				
				result = memberService.login(id, password);
				
				if (result == Loginchk.OK) { // 로그인 성공
					loginOk = true;
					System.out.println("로그인 되었습니다.");
				} else if (result == Loginchk.NOK) { // 로그인 실패
					loginOk = false;
					System.out.println("id 또는 password가 올바르지 않습니다.");
				} else if (result == Loginchk.FAIL) { // 로그인 3번 실패
					loginOk = false;
					stop = true;
					System.out.println("로그인 3번 실패했습니다!");
				}
				
				break;
				
			case "2": // 로그아웃
				if (loginOk) {
					memberService.logout(id);
				} else {
					System.out.println("로그인하지 않은 상태입니다.");
				}
				
				break;
				
			case "3":
				stop = true;
				continue;
				
			} // end of switch
			
		} // end of while
		System.out.println("프로그램 종료!");

	} // end of main

} // end of class
