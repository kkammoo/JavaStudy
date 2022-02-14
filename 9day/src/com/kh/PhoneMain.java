package com.kh;

public class PhoneMain {

	public static void main(String[] args) {

		LgPhone lp = new LgPhone();
		lp.makeCall();
		lp.doInternet();
		
		SamsungPhone sp = new SamsungPhone();
		sp.makeCall();
		sp.watchTv();
		
		Phone phone = (Phone)lp;
		Phone phone3 = lp; // 자동 형변환 : 상위 개념의 시선으로 하위 개념 바라보기.
		phone.makeCall(); // Phone 클래스의 객체로 판단하기 때문에 lp가 가지고 있는 "인터넷 하다" 기능을 사용할 수는 없다.
		
		LgPhone lp2 = (LgPhone)phone;
//		LgPhone lp3 = phone; // 자동 형변환 안 됨 : 하위 개념으로 상위 개념을 바라보기는 안 됨.
		lp2.doInternet(); // LgPhone 클래스의 객체로 판단하기 때문에 "인터넷 하다" 기능을 사용할 수 있다.
		
		Phone phone2 = (Phone)sp;
		phone2.makeCall();
//		=========================================================
		
		usePhone(lp);
		usePhone(sp);
	}
	
	public static void usePhone(Phone lp) { // 7번줄에 있는 LgPhone 객체 lp랑은 이름만 같고 다른 존재. (사용 범위가 다름.)
		
		lp.makeCall();
		
		// 객체 확인
		if (lp instanceof LgPhone) {
			LgPhone lg = (LgPhone)lp;
			lg.doInternet();
			
		} else if (lp instanceof SamsungPhone) {
			SamsungPhone ss = (SamsungPhone)lp;
			ss.watchTv();
		}
	}
}
