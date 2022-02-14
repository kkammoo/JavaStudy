package com.kh;

public class PhoneMain2 {

	public static void main(String[] args) {

		LgPhone lp = new LgPhone();
		SamsungPhone sp = new SamsungPhone();

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
			SamsungPhone sp = (SamsungPhone)lp;
			sp.watchTv();
		}
	}
}
