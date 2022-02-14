package com.kh.exam4;

public class Client extends Person {
	
	private ForCustomer forCustomer;
	
	
	public Client(ForCustomer forCustomer) {
		this.forCustomer = forCustomer;
	}
		
	
	// 자판기에 현금 투입하기
	void inputMoney(ForCustomer forCustomer, int money) {
		forCustomer.inputMoney(money);
		System.out.println("자판기에 " + money + "원이 투입되었습니다.");
	}

	
	// 메뉴 선택
	void choiceMenu(ForCustomer forCustomer, int button) {
		forCustomer.choiceMenu(button);
		System.out.println(button + "번 음료가 선택되었습니다.");
	}
	
	// 음료 채우기
	void fillBerverage() {
		if (forCustomer instanceof VendingMachine) {
			VendingMachine vm = (VendingMachine)forCustomer;
			vm.fillBerverage();
		}
	}
}
