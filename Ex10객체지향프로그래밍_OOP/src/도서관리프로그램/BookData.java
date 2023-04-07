package 도서관리프로그램;

public class BookData {

	//필드
	private String title; //책이름
	private int price; //책가격
	private String writer; //책저차
	
	//생성자
	public BookData(String title, int price, String writer){
		this.title = title;
		this.price = price;
		this.writer = writer;
	}
	
	//getter 메서드
	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public String getWriter() {
		return writer;
	}

	//setter 메서드
	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	
	
	
}
