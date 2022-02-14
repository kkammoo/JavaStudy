package other;

import java.util.Scanner;

public class Account implements AccountIf {
	Scanner sc = new Scanner(System.in);
	
	// ����ʵ�
	int accountNum; // ���¹�ȣ
	String name; // ������
	int balance; // �ܰ�
	Account[] account = new Account[5]; // ����
	
	// ������
	public Account () {}
	
	public Account (int accountNum, String name, int balance) {
		this.accountNum = accountNum;
		this.name = name;
		this.balance = balance;
	}
	
	
	//�޼ҵ�
	
	// �ű�
	@Override
	public void createAccount(String name) {
		balance = 0; // ���� ������ �ܾ��� 0
		accountNum = 1;

		System.out.println("�̸��� �Է��ϼ���.");
		System.out.print("�Է� > ");
		name = sc.nextLine();

		for (int i = 0; i < account.length; i++) {
			if (account[i] == null) {
				account[i] = new Account(accountNum, name, balance);
				System.out.println("���¸� ����߽��ϴ�.");
				System.out.printf("���� [���¹�ȣ: %03d, ������: %s, �ܰ�: %d]\n", account[i].accountNum, account[i].name, account[i].balance);
				break;
			} else if (name.equals(account[i].name)) {
				System.out.println("�̹� ��ϵ� �������Դϴ�.");
				break;
			} else if (account[4] != null) {
				System.out.println("���� ���� �ѵ��� �ʰ��߽��ϴ�.");
				break;
			}
			accountNum++;
		}
	}
	
	// ����
	@Override
	public void removeAccount(int accountNum) {
		System.out.println("���¹�ȣ�� �Է��ϼ���.");
		System.out.print("�Է� > ");
		accountNum = (sc.nextInt()-1);
		System.out.printf("���� [���¹�ȣ: %03d, ������: %s, �ܰ�: %d]\n", account[accountNum].accountNum, account[accountNum].name, account[accountNum].balance);
		while (true) {
			System.out.println("���¸� �����Ͻðڽ��ϱ�? (1:����, 0:���ư���)");
			System.out.print("�Է� > ");
			int num = sc.nextInt();
			if (num == 1) {
				account[accountNum] = null;
				System.out.println("���°� �����Ǿ����ϴ�.");
				break;
			} else if (num == 0) {
				break;
			}
		}
	}
	
	// �Ա�
	@Override
	public int deposit(int accountNum, int balance) {
		System.out.println("���¹�ȣ�� �Է��ϼ���.");
		System.out.print("�Է� > ");
		accountNum = (sc.nextInt()-1);
		
		balance = account[accountNum].balance;
		int amount = 0;
		boolean stop = false;
		while (!stop) {
			System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
			System.out.print("�Է� > ");
			amount = sc.nextInt();
			if (amount >= 20000) {
				System.out.println("1ȸ �Աݱݾ� �ѵ� �ʰ��Դϴ�. (1ȸ �Ա��ѵ�: 20000 �̸�)");
				continue;
			} else if (account[accountNum].balance >= 50000) {
				System.out.println("���� ���ݱݾ� �ѵ� �ʰ��Դϴ�. (�����ѵ�: 50000)");
				System.out.println("���� �ܰ�: " + account[accountNum].balance);
				break;
			}
			account[accountNum].balance = balance + amount;
			System.out.println("�ԱݵǾ����ϴ�.");
			System.out.printf("���� [���¹�ȣ: %03d, ������: %s, �ܰ�: %d]\n", account[accountNum].accountNum, account[accountNum].name, account[accountNum].balance);
			break;
		}
		return account[accountNum].balance;
	}
	
	// ���
	@Override
	public int withdraw(int accountNum, int balance) {
		System.out.println("���¹�ȣ�� �Է��ϼ���.");
		System.out.print("�Է� > ");
		accountNum = (sc.nextInt()-1);
		balance = account[accountNum].balance;
		
		int amount = 0;
		boolean stop = false;
		while (!stop) {
			System.out.printf("���� [���¹�ȣ: %03d, ������: %s, �ܰ�: %d]\n", account[accountNum].accountNum, account[accountNum].name, account[accountNum].balance);
			System.out.println("����� �ݾ��� �Է��ϼ���");
			System.out.print("�Է� > ");
			amount = sc.nextInt();
			if (amount <= 0) {
				System.out.println("��Ȯ�� ���ڸ� �Է��ϼ���");
				continue;
			} else if (account[accountNum].balance <= 0) {
				System.out.println("���� ��ݱݾ� �ѵ� �ʰ��Դϴ�.");
				System.out.println("���� �ܰ�: " + account[accountNum].balance);
				continue;
			}
			account[accountNum].balance = balance - amount;
			System.out.println("��ݵǾ����ϴ�.");
			System.out.printf("���� [���¹�ȣ: %03d, ������: %s, �ܰ�: %d]\n", account[accountNum].accountNum, account[accountNum].name, account[accountNum].balance);
			break;
		}
		return account[accountNum].balance;
	}
	
	// ������ȸ(����)
	@Override
	public void findAccount(int accountNum) {
		System.out.println("���¹�ȣ�� �Է��ϼ���.");
		System.out.print("�Է� > ");
		accountNum = (sc.nextInt()-1);
		System.out.printf("���� [���¹�ȣ: %03d, ������: %s, �ܰ�: %d]\n", account[accountNum].accountNum, account[accountNum].name, account[accountNum].balance);
	}
	
	// ������ȸ(��ü)
	@Override
	public void accountAll() {
		for (int i = 0; i < account.length; i++) {
			if (account != null) {
				System.out.printf("���� [���¹�ȣ: %03d, ������: %s, �ܰ�: %d]\n", account[i].accountNum, account[i].name, account[i].balance);
			}
		}
		System.out.println("���� ������� ���� ��: " + account.length + " " + "�ܿ� ���� ��: " + (5-account.length));
	}
	
	@Override
	public String toString() {
			String str = "[���¹�ȣ: " + this.accountNum + "," + 
										"������: " + this.name + "," + 
										"�ܾ�: " + this.balance + "]";
		return str;
	}
}