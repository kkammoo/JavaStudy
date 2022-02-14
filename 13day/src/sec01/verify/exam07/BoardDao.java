package sec01.verify.exam07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	// case 0 : 정적 메소드 of 활용. ArrayList를 안 쓰기 때문에 import 안 함.
	public List<Board> getBoardList() {
		List<Board> list = 
				List.of(
						new Board("제목1", "내용1"),
						new Board("제목2", "내용2"),
						new Board("제목3", "내용3"));
		return list;
	}
	
//	public List<Board> getBoardList() {
		
//		List<Board> list = new ArrayList<>();
		// case 1
//		Board b1 = new Board("제목1", "내용1");
//		Board b2 = new Board("제목2", "내용2");
//		Board b3 = new Board("제목3", "내용3");
//		list.add(b1);
//		list.add(b2);
//		list.add(b3);
		
		// case 2 : case 1을 압축
//		list.add(new Board("제목1", "내용1"));
//		list.add(new Board("제목2", "내용2"));
//		list.add(new Board("제목3", "내용3"));
		
		// case 3 : for문 활용
//		for (int i = 1; i<=3; i++) {
//			list.add(new Board("제목" + i, "내용" + i));
//		}
		
//		return list;
//	}
}
