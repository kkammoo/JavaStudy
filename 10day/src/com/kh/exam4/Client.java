package com.kh.exam4;

public class Client extends Person {
	
	private ForCustomer forCustomer;
	
	
	public Client(ForCustomer forCustomer) {
		this.forCustomer = forCustomer;
	}
		
	
	// ���Ǳ⿡ ���� �����ϱ�
	void inputMoney(ForCustomer forCustomer, int money) {
		forCustomer.inputMoney(money);
		System.out.println("���Ǳ⿡ " + money + "���� ���ԵǾ����ϴ�.");
	}

	
	// �޴� ����
	void choiceMenu(ForCustomer forCustomer, int button) {
		forCustomer.choiceMenu(button);
		System.out.println(button + "�� ���ᰡ ���õǾ����ϴ�.");
	}
	
	// ���� ä���
	void fillBerverage() {
		if (forCustomer instanceof VendingMachine) {
			VendingMachine vm = (VendingMachine)forCustomer;
			vm.fillBerverage();
		}
	}
}
