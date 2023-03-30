package 메서드;

public class Ex07메서드 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 24;
		int result = largerNumber(num1, num2);
		System.out.println("큰 수 확인 : " + result);
	}

	
	// largerNumber 메서드
	// 메서드명 : largerNumber
	// 전달인자 num1, num2 : int ---> 매개변수가 int 자료형으로 2개
	// 리턴타입이 int
	// int result 출력하는 기능 X
	// 2개의 양수를 받아 2개의 숫자 중 더 큰 수를 반환하는 메소드
	// 만약 두 숫자가 같다면 0을 반환
	// + 보통 전달인자에 사용되는 이름과 매개변수에 사용되는 이름을 일치시켜줌

	public static int largerNumber(int num1, int num2) {
		
		// 모든 경우에 대해서 return 값이 있어야 한다!! (if, else if, else)
		if(num1 > num2) {
			return num1;
		}else if(num1 == num2) {
			return 0;
		}else {
			return num2;
		}
	}
	
}
