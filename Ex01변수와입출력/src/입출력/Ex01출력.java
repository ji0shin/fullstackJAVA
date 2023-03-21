package 입출력;

public class Ex01출력 {

	public static void main(String[] args) {
		
		//ctrl + f11 : 코드 실행
		//System : 표준 입출력 클래스
		//System.out : 출력 기능 사용
		
		int a = 10;
		//a - 변수 (소괄호를 적지 않을 경우) 값을 저장할 때 사용
		
		//print() - 메서드(기능) 특정한 function (소괄호 사용하는 경우)
		//~~를 출력하겠다 기능
		//() 사이에는 출력하고 싶은 구문 작성
		//print : 단순 출력
		//\n : 개행
		System.out.print(123);
		System.out.print("Hello World!\n");
		
		//println : 출력후 개행
		System.out.println("출력구문1");
		//syso + ctrl + space : 단축키
		System.out.println("출력구문2");
		//ctrl + alt + 아래방향키 : 해당구문 복사 붙여넣기
		System.out.println("출력구문3");
		
		//printf() : 특정 형식으로 출력할 때 사용
		// 1. pi = 3.14
		int a2 = 1;
		String b = "pi";
		double c = 3.14;
		
		//%d : 정수자리, %s : 문자열, %f : 실수
		System.out.printf("%d. %s = %f\n", a2, b, c);
		System.out.printf("%d. %s = %f\n", 2, "pi", 3.14);
		
		String s1 = "제 이름은";
		String s2 = "신지영입니다";
		
		System.out.print(s1);
		System.out.println(s2);

		System.out.println(s1 + s2 + 1); //문자열 더하기 연산 +
		// 문자열 + 숫자 => 숫자가 문자로 변환
		
		
		
	}
}
