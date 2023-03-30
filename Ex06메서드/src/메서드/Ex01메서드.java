package 메서드;

public class Ex01메서드 {

	public static void main(String[] args) {
		
		// 매개변수와 전달인자의 개수, 데이터타입은 항상 일치해야 한다. 
		System.out.println(sum(10,20,500));
		System.out.println(sum(20,25,500));
		System.out.println(sum(25,25,500));
		System.out.println(sum(27,25,500));
		System.out.println(sum(20,25,500));
	
	}
		
	// 메서드 작성은 main 밖에서 이루어진다. 
	// + 하는 기능을 그냥 만들어놓고 필요할때마다 가져다가 사용해야지!
	// public : 접근제한자 (공공의 : 클래스 내외부에서 마음에도 접근이 가능하도록 해줌)
	// static : 저장소
	// 리턴타입 : 돌려받는 결과값의 데이터 타입
	// 메서드명(호출명) : 실행시킬 때 부를 이름
	// (매개변수) : 메서드 안에서 사용될 수 있는 변수, 선언만 한다
	public static int sum(int a, int b, int c) {
	//            리턴타입에 자료형이 명시되어 있으면 return이라는 키워드가 따라온다.
	// 모든 경우에 대해서 꼭 return값이 있어야 한다
		
		int result = a + b + c + 365;
		return result;
	}

}
