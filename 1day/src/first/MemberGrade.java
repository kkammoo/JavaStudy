package first;

public class MemberGrade {

	public static void main(String[] args) {
		char grade = 'c';

		// 다중 if문
		if (grade == 'B' || grade == 'b') {
			System.out.println("일반회원");
		} else if (grade == 'A' || grade == 'a') {
			System.out.println("우수회원");
		} else {
			System.out.println("회원등급이 없습니다.");
		}

		// switch문
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원");
			break;
		default:
			System.out.println("회원등급이 없습니다.");
		} // end of switch
	} // end of main

} // 다중 if문은 switch문으로 바꿀 수 있고, 반대도 가능하다.