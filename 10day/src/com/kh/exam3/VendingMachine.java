package com.kh.exam3;

public class VendingMachine implements ForAll {
	
	
	private int money; 	// ������ ��
	private int button; // ������ �޴�
	
	@Override
	public void fillMoney() {
		System.out.println("�Ž������� ä���.");
	}

	@Override
	public void fillBerverage() {
		System.out.println("���Ḧ ä���");
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
