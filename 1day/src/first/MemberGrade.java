package first;

public class MemberGrade {

	public static void main(String[] args) {
		char grade = 'c';

		// ���� if��
		if (grade == 'B' || grade == 'b') {
			System.out.println("�Ϲ�ȸ��");
		} else if (grade == 'A' || grade == 'a') {
			System.out.println("���ȸ��");
		} else {
			System.out.println("ȸ������� �����ϴ�.");
		}

		// switch��
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("���ȸ��");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ�ȸ��");
			break;
		default:
			System.out.println("ȸ������� �����ϴ�.");
		} // end of switch
	} // end of main

} // ���� if���� switch������ �ٲ� �� �ְ�, �ݴ뵵 �����ϴ�.