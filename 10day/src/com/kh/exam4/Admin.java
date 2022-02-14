package com.kh.exam4;

public class Admin extends Person {

	// 자판기에 거스름돈 채우기
	void fillMoney(ForAdmin forAdmin) {
		forAdmin.fillMoney();
	}
	
	
	// 자판기에 음료 채우기
	void fillBerverage(ForAdmin forAdmin) {
		forAdmin.fillBerverage();
	}
}
