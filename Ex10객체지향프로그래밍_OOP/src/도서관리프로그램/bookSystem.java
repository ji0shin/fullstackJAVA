package 도서관리프로그램;

import java.util.ArrayList;

// 책을 관리하는 클래스(등록, 책 정보 확인, 수정 등...)
public class bookSystem {
	
	private ArrayList<Book1> list = new ArrayList<>();
	
	// 책 등록 기능
	public void addBook(String title, int price, String writer) {
		Book1 book = new Book1(title, price, writer);
		list.add(book);
	}
	
	// 책 조회 기능
	public String getBookTitleList() {
		String msg = "";
		for (int i = 0 ; i < list.size() ; i++) {
			Book1 temp = list.get(i); // 책을 한권씩 꺼내는 코드
			msg += temp.getTitle(); // 책 이름을 누적
			msg += "\n";
		}
		
		return msg;
	}
	
}
