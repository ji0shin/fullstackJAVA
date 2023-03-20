package 변수;

public class Ex03자료형과형변환 {

	public static void main(String[] args) {
		
		//1. 논리형 (참/거짓, 1/0, true/false)
		boolean sw = true; //참
		boolean sw1 = false; //거짓
		
		//2. 문자형 : 문자 1개만 저장 가능
		char c = 'a'; //작은따옴표 안에 값 입력
//		char c2 = 'asd';
		char c2 = 75; //'K' 저장한 것과 똑같다. (아스키코드 참조)
		
		//3. 정수형
		//-1. byte(1byte) -128~127까지만 저장 가능
		byte num = 10;
		byte num2 = (byte)333; //127 이상의 숫자 저장 불가 -> 강제 형변환 
		byte num1 = 120; //int 형태의 120을 byte 형태의 변수에 저장하겠다는 의미. -> int를 byte로 자료형을 바꾸겠다는 의미 -> 형변환
		//-2. short(2byte) 
		short num3 = 300;
		//-3. int(4byte) : 기본 정수형 자료형
		int num4 = 200;
		//-4. long(8byte) 
		long num5 = 200; //자동형변환
		
		//4. 실수형 (오차를 줄이기 위해, 고정 소수점을 저장하면 범위가 제한적이므로 더많은 실수를 저장할 수 없음 -> 부동소수점을 사용)
		//-1. float(4byte)
		float num6 = (float)3.14;
		float num7 = 3.14f;
		//-2. double(8byte) : 기본 실수형 자료형
		double num8 = 3.14;
	}

}
