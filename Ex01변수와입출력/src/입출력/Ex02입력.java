package 입출력;

import java.util.InputMismatchException;
//Scanner 도구 사용을 위해 작성. 외부 패키지에서 존재하는 클래스를 가져다가 쓸때 import를 필수로 해줘야 함!
import java.util.Scanner;

public class Ex02입력 {

	public static void main(String[] args) {
		
		//new Scanner() : Scanner(입력 받은 것을 변환) 도구 생성
		//System.in 입력도구 -> 컴퓨터가 받아들일땐 바이트코드로 받아들임
		//Scanner 도구를 활용해서 읽어들이겠다. 메모리 상에 scanner 도구 자리 차지
		//내가 생성한 스캐너가 어디에 생성되는지 알아야 함. (주소) -> 변수에 담음
		//Scanner sc => Scanner : 스캐너 형태의 도구의 주소를 저장할 수 있는 자료형
		
		//스캐너 사용할 때에는 컴퓨터의 자원이 많이 사용된다. sc is never closed
		Scanner sc = new Scanner(System.in);
		//주소를 가지고 scanner를 찾아감
		/*
		 * String s = sc.next(); //스캐너로 입력된 값을 받아들임 -> 기억을 하기 위해서는 변수(String s)가 필요함
		 * //스캐너가 입력된 값을 돌려줌(반환) - String 타입으로 돌려줌 -> 돌려준 값을 변수에 저장 //"1" + "3" -> "13"
		 * 
		 * System.out.println(s); //s변수가 가지고 있는 값을 콘솔에 출력
		 * 
		 * //Scanner : 입력한 값을 공백문자(' ', \t, \n)를 기준으로 분리 sc.nextLine(); // 녕 한번 처리해버림
		 * String s2 = sc.nextLine(); System.out.println(s2);
		 */
		//여러줄 주석 단축키 : ctrl + shift + /
		//자바는 항상 코드를 위에서 아래서 실행

		int num = 0; //정수형 값을 저장할 수 있는 공간 생성
		//main 내에서 영향을 끼침(try 안에도 영향을 끼침) -> try 내의 변수 num 오류 발생 -> try 내의 변수는 재할당만
		
		try { //무조건 실행
			num = sc.nextInt(); //정수가 들어갈 경우에는 문제 없음.(num에 정수 입력됨) 만약, 문자열 입력하는 경우에는 오류가 나기 때문에 num에 할당이 안됨
//			System.out.println(num);
		}catch(InputMismatchException e) { //(발생한 오류(예외상황)의 종류)
			//try 안에서 예외상황이 발생했을 때만 실행
			System.out.println("숫자로 입력해주세요!");
		}
		
		//런타임(실행) 오류
		//예외 처리를 해줘야 함 : try~catch
	
		System.out.println(num); //num이라는 변수가 선언되지 않았다고 인식 -> 해결 방법 1. try 안으로 출력문구 집어넣기 2. 변수를 밖에서 선언
		//문자를 입력했을 때 num에 들어가는 값이 없을수도 있다고 생각하여 오류 발생(초기화 오류) -> num에 기본값 설정 (보통 변수는 0으로 초기화함)
		
		//지역변수 : 특정 구역에서만 사용 가능한 변수 - 우리가 대부분 작성하는 변수 / 중괄호 사이에서만 사용 가능
		//전역변수 : 어디에서나 사용 가능한 변수
		
		sc.close();
		//스캐너가 사용하던 자원을 반환. 스캐너가 사라짐. 이후 sc.next()등 사용불가
		
		sc.next();
	}

}
