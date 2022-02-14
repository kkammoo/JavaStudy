package com.kh;
/*
 * 싱글톤 : 객체를 1개만 생성하고자 할 때 사용하는 디자인 패턴
 * 1. 외부에서 생성자를 호출하지 못하도록 생성자를 private로 만든다.
 * 2. 내부에서 객체를 생성하고 public static 필드가 참조하게한다.
 * 3. 외부에서 내부에서 생성된 객체를 참조하도록 public static메소드들 만든다.
 */
public class Sun {
	// 필드
	private static Sun sun = new Sun();
	/*
	 * 2. 외부에서 생성자를 호출하여 객체를 만들 수 없으므로 내부에 private static으로 객체 생성.
	 */
	
	// 생성자
	private Sun()	{ // 1. 기본 생성자를 private로 만듦
		super();
	}
	
	//메소드
	public static Sun getIntance()	{ // 3. 외부에서 Sun의 객체를 참조할 수 있는 메소드를 생성. (public static)
		return sun;
	}
	
}
