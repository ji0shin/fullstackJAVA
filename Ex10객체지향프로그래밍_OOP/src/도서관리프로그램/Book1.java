package 도서관리프로그램;

// 책을 표현하는 클래스 (책 정보를 가지고 있음)
public class Book1 {
	private String title;
	private int price;
	private String writer;
	
	// 생성자
	public Book1(String title, int price, String writer) {
		this.title = title;
		this.price = price;
		this.writer = writer;
	}

	// getter 메서드 : 객체 안의 데이터를 꺼내가는 메서드
	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public String getWriter() {
		return writer;
	}
	

	
	

	
}
