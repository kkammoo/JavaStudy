package other;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Subin {

	/*Map 컬렉션 사용
	 * 영어 단어장 만들기
	 * 등록, 수정, 삭제기능은 관지라에게만 허용(admin,1234)
	 * 
	 * 1.로그인 2.가입 3.종료
	 * 
	 * 일반사용자 
	 * 1.단어검색 2.단어목록 3.로그아웃(초기화면)
	 * 
	 * 관리자
	 * 1.등록 2.수정 3.검색 4.삭제 5.단어목록 6.전체목록 0.로그아웃(초기화면)
	 */
	
public static void main(String[] args) {
		
		int menuNum, adminNum, userNum;		
		String id = null, pw = null;		
		String adminId = "admin";
		String adminPw = "1234";		
		String word = null, mean = null;		
		boolean start = false, userStart = false, adminStart = false;
		
		Scanner sc = new Scanner(System.in);		

		Map<String, String> wordbook = new HashMap<String,String>();
		Map<String, String> member = new HashMap<String,String>();
		
		member.put(adminId, adminPw);	
		
		while(!start) {
			System.out.println("========================");
			System.out.println("1.로그인 2.회원가입 3.종료");
			System.out.print("입력>>");
			menuNum = sc.nextInt();
			
			switch(menuNum) {			
			case 1:
				System.out.printf("아이디:" , id);
				id = sc.next();
				System.out.printf("패스워드:", pw);
				pw = sc.next();	
				
				if(id.equals(adminId) && pw.equals(adminPw)) {
					while(!adminStart) {
						System.out.println("관리자입니다.");
						
						System.out.println("========================");
						System.out.println("1.등록 2.수정 3.검색 4.삭제 5.단어목록 6.전체목록 0.로그아웃");
						System.out.print("입력>>");
						adminNum = sc.nextInt();								
						
						switch(adminNum) {								
							case 1:
								System.out.printf("등록할 단어:" , word);
								word = sc.next();
								System.out.printf("뜻:", mean);
								mean = sc.next();											
								wordbook.put(word, mean);
								break;										
							case 2:							
								System.out.printf("수정할 단어:" , word);
								word = sc.next();
								System.out.printf("뜻:" , mean);
								mean = sc.next();										
								wordbook.put(word, mean);
								break;										
							case 3:
								System.out.printf("검색할 단어:" , word);
								word = sc.next();
								if(wordbook.get(word) != null) {
									System.out.println(wordbook.get(word));
								} else {
									System.out.println("등록되지 않은 단어입니다.");
									continue;
								}
								break;										
							case 4:							
								System.out.printf("삭제할 단어:" , word);
								word = sc.next();
								wordbook.remove(word);
								System.out.println(word +"가 삭제되었습니다.");
								break;										
							case 5:	
								Set<String> totalWord = wordbook.keySet();
								if(wordbook.get(word) != null) {
									System.out.println("저장된단어목록:" + totalWord );									
//									System.out.println("단어:" + totalWord + " == 뜻:" + wordbook.get(totalWord));
								} else {
									System.out.println("저장된 단어가 없습니다.");
									continue;
								}
								break;										
							case 6:
								Set<Map.Entry<String, String>> total = wordbook.entrySet();
								if(total.size() == 0) {
									System.out.println("목록이 없습니다.");
								}else {
									System.out.println(total);	
//								for(Map.Entry<String, String> totalbook : total) {									
//									System.out.println("단어:" + totalbook.getKey() + " == 뜻:" + totalbook.getValue());
//								}
								}
								
								break;										
							case 0:			
								adminStart = true;
								continue;
						}
					}
				}
				else {
					if(member.containsKey(id)) {						
						
						if(member.get(id).equals(pw)) {							
							
							System.out.println("사용자입니다");
							System.out.println("로그인되었습니다.");
							while(!userStart) {								
								System.out.println("========================");
								System.out.println("1.단어검색 2.단어목록 0.로그아웃");
								System.out.print("입력>>");					
								userNum = sc.nextInt();
								switch(userNum) {
								case 1:
									System.out.printf("검색할 단어:" , word);
									word = sc.next();
									if(wordbook.get(word) != null) {
										System.out.println(wordbook.get(word));
									}else {
										System.out.println("등록되지 않은 단어입니다.");
										continue;
									}
									break;
								case 2:
									
									Set<String> totalWord = wordbook.keySet();
//									for(String totalWord : wordbook.keySet()) {									
//										System.out.println("단어:" + totalWord + " == 뜻:" + wordbook.get(totalWord));
//									}
									if(totalWord.size() == 0) {
										System.out.println("목록이 없습니다.");
										continue;
									}
									else {
										System.out.println("단어:" + totalWord + " == 뜻:" + wordbook.get(totalWord));
									}
									break;
								case 0:
									System.out.println("로그아웃");
									userStart = true;
									continue;						
								}
							}
						}
						else {							
							System.out.println("비밀번호가 일치하지않습니다.");
						}
					}
					else {
						System.out.println("아이디가 존재하지 않습니다.");
					}
					
				}
				break;
				
			case 2:
				System.out.printf("아이디:" , id);
				id = sc.next();
				if(member.containsKey(id)) {					
					System.out.println("이미 가압된 아이디입니다.");
				}
				else {					
					System.out.println("사용가능한 아이디입니다.");
					System.out.printf("패스워드:", pw);
					pw = sc.next();	
					
					member.put(id, pw);	
					System.out.println("가입완료");
				}
				continue;
				
			case 3:
				System.out.println("프로그램을 종료합니다");
				start = true;
				break;					
			}
		}		
	}
}

