package com.kh.exam4;

public class VendingMachine implements ForAll {
	
	
	private int money; 	// 투입한 돈
	private int button; // 선택한 메뉴
	
	@Override
	public void fillMoney() {
		System.out.println("거스름돈을 채우다.");
	}

	@Override
	public void fillBerverage() {
		System.out.println("음료를 채우다");
	}

	@Override
	public void inputMoney(int money) {
		this.money = money;
	}

	@Override
	public void choiceMenu(int button) {
		this.button = button;
	}

}
