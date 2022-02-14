package other;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Subin {

	/*Map �÷��� ���
	 * ���� �ܾ��� �����
	 * ���, ����, ��������� �����󿡰Ը� ���(admin,1234)
	 * 
	 * 1.�α��� 2.���� 3.����
	 * 
	 * �Ϲݻ���� 
	 * 1.�ܾ�˻� 2.�ܾ��� 3.�α׾ƿ�(�ʱ�ȭ��)
	 * 
	 * ������
	 * 1.��� 2.���� 3.�˻� 4.���� 5.�ܾ��� 6.��ü��� 0.�α׾ƿ�(�ʱ�ȭ��)
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
			System.out.println("1.�α��� 2.ȸ������ 3.����");
			System.out.print("�Է�>>");
			menuNum = sc.nextInt();
			
			switch(menuNum) {			
			case 1:
				System.out.printf("���̵�:" , id);
				id = sc.next();
				System.out.printf("�н�����:", pw);
				pw = sc.next();	
				
				if(id.equals(adminId) && pw.equals(adminPw)) {
					while(!adminStart) {
						System.out.println("�������Դϴ�.");
						
						System.out.println("========================");
						System.out.println("1.��� 2.���� 3.�˻� 4.���� 5.�ܾ��� 6.��ü��� 0.�α׾ƿ�");
						System.out.print("�Է�>>");
						adminNum = sc.nextInt();								
						
						switch(adminNum) {								
							case 1:
								System.out.printf("����� �ܾ�:" , word);
								word = sc.next();
								System.out.printf("��:", mean);
								mean = sc.next();											
								wordbook.put(word, mean);
								break;										
							case 2:							
								System.out.printf("������ �ܾ�:" , word);
								word = sc.next();
								System.out.printf("��:" , mean);
								mean = sc.next();										
								wordbook.put(word, mean);
								break;										
							case 3:
								System.out.printf("�˻��� �ܾ�:" , word);
								word = sc.next();
								if(wordbook.get(word) != null) {
									System.out.println(wordbook.get(word));
								} else {
									System.out.println("��ϵ��� ���� �ܾ��Դϴ�.");
									continue;
								}
								break;										
							case 4:							
								System.out.printf("������ �ܾ�:" , word);
								word = sc.next();
								wordbook.remove(word);
								System.out.println(word +"�� �����Ǿ����ϴ�.");
								break;										
							case 5:	
								Set<String> totalWord = wordbook.keySet();
								if(wordbook.get(word) != null) {
									System.out.println("����ȴܾ���:" + totalWord );									
//									System.out.println("�ܾ�:" + totalWord + " == ��:" + wordbook.get(totalWord));
								} else {
									System.out.println("����� �ܾ �����ϴ�.");
									continue;
								}
								break;										
							case 6:
								Set<Map.Entry<String, String>> total = wordbook.entrySet();
								if(total.size() == 0) {
									System.out.println("����� �����ϴ�.");
								}else {
									System.out.println(total);	
//								for(Map.Entry<String, String> totalbook : total) {									
//									System.out.println("�ܾ�:" + totalbook.getKey() + " == ��:" + totalbook.getValue());
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
							
							System.out.println("������Դϴ�");
							System.out.println("�α��εǾ����ϴ�.");
							while(!userStart) {								
								System.out.println("========================");
								System.out.println("1.�ܾ�˻� 2.�ܾ��� 0.�α׾ƿ�");
								System.out.print("�Է�>>");					
								userNum = sc.nextInt();
								switch(userNum) {
								case 1:
									System.out.printf("�˻��� �ܾ�:" , word);
									word = sc.next();
									if(wordbook.get(word) != null) {
										System.out.println(wordbook.get(word));
									}else {
										System.out.println("��ϵ��� ���� �ܾ��Դϴ�.");
										continue;
									}
									break;
								case 2:
									
									Set<String> totalWord = wordbook.keySet();
//									for(String totalWord : wordbook.keySet()) {									
//										System.out.println("�ܾ�:" + totalWord + " == ��:" + wordbook.get(totalWord));
//									}
									if(totalWord.size() == 0) {
										System.out.println("����� �����ϴ�.");
										continue;
									}
									else {
										System.out.println("�ܾ�:" + totalWord + " == ��:" + wordbook.get(totalWord));
									}
									break;
								case 0:
									System.out.println("�α׾ƿ�");
									userStart = true;
									continue;						
								}
							}
						}
						else {							
							System.out.println("��й�ȣ�� ��ġ�����ʽ��ϴ�.");
						}
					}
					else {
						System.out.println("���̵� �������� �ʽ��ϴ�.");
					}
					
				}
				break;
				
			case 2:
				System.out.printf("���̵�:" , id);
				id = sc.next();
				if(member.containsKey(id)) {					
					System.out.println("�̹� ���е� ���̵��Դϴ�.");
				}
				else {					
					System.out.println("��밡���� ���̵��Դϴ�.");
					System.out.printf("�н�����:", pw);
					pw = sc.next();	
					
					member.put(id, pw);	
					System.out.println("���ԿϷ�");
				}
				continue;
				
			case 3:
				System.out.println("���α׷��� �����մϴ�");
				start = true;
				break;					
			}
		}		
	}
}

