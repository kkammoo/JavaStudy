package homeWork02;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Member implements ForMember {

	String id;
	String pw;

	// �ʱ�ȭ�� ��� ����
	static Map<String, String> loginMap = new HashMap();
	Scanner sc = new Scanner(System.in);
	
	// 1. �α���
	@Override
	public int logIn(String id, String pw) {
		this.id = id;
		this.pw = pw;
		int result = 0;
		boolean run = false;

		while (!run) {
			loginMap.put("admin", "1234"); // ������ ID �⺻ ����
			System.out.println("ID�� �Է����ּ���.(���� �޴� : 0)");
			System.out.print("ID : ");
			id = sc.nextLine();

			if (id.equals("0")) {
				run = true;
				break;
			} else if (!id.equals("0")) {
				if (!loginMap.containsKey(id)) {
					System.out.println("��ϵ��� ���� ID �Դϴ�.");
					System.out.println("���� �޴��� ���ư� ȸ�������� ���ּ���.");
					continue;
				} else {
					System.out.println("PW�� �Է����ּ���.");
					System.out.print("PW : ");
					pw = sc.nextLine();
					if (loginMap.containsValue(pw)) {
						// �α��� �б�
						// 1) �����ڷ� �α����� ��� result = 1 ����
						if (id.equals("admin")) {
							result = 1;
							// 2) �Ϲ�ȸ������ �α����� ��� result = 2 ����
						} else if (!id.equals("admin")) {
							result = 2;
						}
						break;
					} else {
						System.out.println("PW�� �ùٸ��� �ʽ��ϴ�.");
						continue;
					}
				}
			}
		}
		return result;
	}
	// �α׾ƿ� ����� switch������ �ذᰡ���ϹǷ� ������ �޼ҵ� �ʿ����.
	
	// 2. ȸ������
	@Override
	public void createId(String id, String pw) {
		this.id = id;
		this.pw = pw;
		boolean run = false;

		while (!run) {
			// ������ ID�� �⺻�����Ͽ� ������ ID�� ���� ���ϰ� ��.
			loginMap.put("admin", "1234");
			System.out.println("�ۼ��� ID�� �Է��ϼ���.(���� �޴� : 0)");
			System.out.print("�Է� : ");
			id = sc.nextLine();

			if (id.equals("0")) {
				run = true;
				break;
			} else if (loginMap.containsKey(id)) {
				System.out.println("�̹� ��ϵ� ID �Դϴ�.");
				continue;
			} else {
				System.out.println("�ۼ��� ID�� PW �Է��ϼ���.");
				System.out.print("�Է� : ");
				pw = sc.nextLine();
				loginMap.put(id, pw);
				break;
			}
		}
		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
	}

	// �ܾ��� ��� ����
	static Map<String, String> wordBook = new HashMap<>();
	
	// 1. �ܾ��� (����)
	@Override
	public void addWord() {
		String word = null;
		String means = null;
		boolean run = false;

		while (!run) {
			System.out.println("����� �ܾ �Է����ּ���.(���� �޴� : 0)");
			System.out.print("�Է� : ");
			word = sc.nextLine();

			if (word.equals("0")) {
				run = true;
				break;
			} else if (wordBook.containsKey(word) == true) {
				System.out.println("�̹� ��ϵ� �ܾ��Դϴ�.");
				continue;
			} else {
				System.out.println("���� �Է����ּ���.");
				System.out.print("�Է� : ");
				means = sc.nextLine();
			}
			wordBook.put(word, means);
			System.out.println("�� �ܾ ��ϵǾ����ϴ�.");
			break;
		}
	}
	
	// 2. �ܾ� �� ���� (����)
	@Override
	public void editWord() {
		String word = null;
		String means = null;
		boolean run = false;

		while (!run) {
			System.out.println("���� ������ �ܾ �Է����ּ���.(���� �޴� : 0)");
			System.out.print("�Է� : ");
			word = sc.nextLine();

			if (word.equals("0")) {
				run = true;
				break;
			} else if (wordBook.containsKey(word) == true) {
				System.out.println("���ο� ���� �Է����ּ���.");
				System.out.print("�Է� : ");
				means = sc.nextLine();
			} else {
				System.out.println("���� �ܾ��Դϴ�. �ܾ����� Ȯ�����ּ���.");
				continue;
			}
			wordBook.put(word, means);
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			break;
		}
	}
	
	// 3. �ܾ�˻� (����)(�Ϲ�)
	@Override
	public void searchWord() {
		String word = null;
		boolean run = false;

		while (!run) {
			System.out.println("�˻��� �ܾ �Է����ּ���.(���� �޴� : 0)");
			System.out.print("�Է� : ");
			word = sc.nextLine();

			if (word.equals("0")) {
				run = true;
				break;
			} else if (wordBook.containsKey(word)) {
				System.out.println("�� : " + wordBook.get(word));
				break;
			} else {
				System.out.println("���� �ܾ��Դϴ�. �ܾ����� Ȯ�����ּ���.");
				continue;
			}
		}
	}
	
	// 4. �ܾ���� (����)
	@Override
	public void removeWord() {
		String word = null;
		boolean run = false;

		while (!run) {
			System.out.println("������ �ܾ �Է����ּ���.(���� �޴� : 0)");
			System.out.print("�Է� : ");
			word = sc.nextLine();

			if (word.equals("0")) {
				run = true;
				break;
			} else if (wordBook.containsKey(word)) {
				wordBook.remove(word);
				System.out.println("�ܾ �����Ǿ����ϴ�.");
				break;
			} else {
				System.out.println("���� �ܾ��Դϴ�. �ܾ����� Ȯ�����ּ���.");
				continue;
			}
		}
	}
	
	// 5. �ܾ��� (����)(�Ϲ�)
	@Override
	public void wordList() {
		Set<String> words = wordBook.keySet();
		// ����� �ܾ ���� ���.
		if (wordBook.size() == 0) {
			System.out.println("��ϵ� �ܾ �����ϴ�.");
		} else {
			System.out.println("���� ��ϵ� �ܾ� ����Դϴ�.");
			for (String word : words) {
				System.out.println(word);
			}
		}
	}
	
	// 6. ��ü��� (����)
	@Override
	public void wordAll() {
		Set<Entry<String, String>> wordsAll = wordBook.entrySet();
		if (wordBook.size() == 0) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�.");
		} else {
			System.out.println("���� ��ϵ� �ڷ� ����Դϴ�.");
			for (Entry<String, String> ele : wordsAll) {
				String word = ele.getKey();
				String means = ele.getValue();
				System.out.println(word + "\t" + means);
			}
		}
	}
}
