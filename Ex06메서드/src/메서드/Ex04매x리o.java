package 메서드;

public class Ex04매x리o {

	public static void main(String[] args) {
		
		getName();
		System.out.println(getName());
		// "신지영"
	}

	// getName() 만들기 : 매개변수x 리턴타입o
	// 돌려받고 싶은 결과값 ---> String
	// 전달인자 없음 ---> 매개변수 없음
	public static String getName() {
		// 리턴타입에 자료형이 있으면 return이라는 키워드가 따라온다.
		return "신지영";
	}
}
