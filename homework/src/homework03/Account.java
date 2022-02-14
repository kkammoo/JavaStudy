package homework03;

import java.util.Scanner;

public class Account {

	Scanner sc = new Scanner(System.in);

	// ��� �ʵ�
	private static final int ACCOUNT_NUM_SIZE = 3;

	private String accountName; // �����ָ�
	private String accountNum; // ���¹�ȣ
	private int balance; // �ܾ�

	Account[] account = new Account[5]; // ���°��� ���� 5
	private static int numCount; // ���»��� ī��Ʈ

	// ������
	public Account() {
	};

	public Account(String accountName) {
		this.accountName = accountName;
		++numCount;

		// ���¹�ȣ ���� ����
		String zero = "";
		String number = String.valueOf(numCount);
		for (int i = 1; i <= ACCOUNT_NUM_SIZE - number.length(); i++) {
			zero += "0";
		}
		this.accountNum = zero + numCount;
	}

	// ���»���
	public void newAccount(String accountName) {
		Account createdAccount = null;
		boolean maxAccount = false;

		System.out.println("�ű� �����ָ�");
		System.out.print("�Է� > ");
		accountName = sc.nextLine();

		for (int i = 0; i < account.length; i++) {
			if (account[i] == null) {
				account[i] = new Account(accountName);
				createdAccount = account[i];
				maxAccount = true;
				break;
			} else if (accountName.equals(account[i].accountName)) {
				System.out.println("�̹� ��ϵ� �������Դϴ�.");
				break;
			} else if (account[i].accountName != null) {
				System.out.println("���� �����ѵ��� �ʰ��߽��ϴ�. (�����ѵ�: 5)");
			}
		}
		if (!maxAccount) {
			System.out.println("���¸� ����߽��ϴ�.");
			System.out.println(createdAccount);
		}
	}

	// ��������
	public void removeAccount(String accountNum) {
		this.accountNum = accountNum;

		System.out.println("���¹�ȣ�� �Է��ϼ���.");
		System.out.print("�Է� > ");
		accountNum = sc.nextLine();

		for (int i = 0; i < account.length; i++) {
			if (accountNum.equals(account[i].accountNum)) {
				System.out.println(account[i].toString());
				continue;
			} else {
				System.out.println("���¹�ȣ�� �������� �ʽ��ϴ�.");
				break;
			}
		}
	}

	// �Ա�

	// ���

	// ������ȸ(����)

	// ������ȸ(��ü)

	// �������� ���(toString ������)
	@Override
	public String toString() {
		String str = "[���¹�ȣ: " + this.accountNum + ", " + "������: " + this.accountName + ", " + "�ܾ�: " + this.balance + "]";
		return str;
	}
}
