package 입출력;

//Scanner 도구 사용을 위해 작성. 외부 패키지에서 존재하는 클래스를 가져다가 쓸때 import를 필수로 해줘야 함!
import java.util.Scanner;

public class Ex02입력 {

	public static void main(String[] args) {
		
		//new Scanner() : Scanner(입력 받은 것을 변환) 도구 생성
		//System.in 입력도구 -> 컴퓨터가 받아들일땐 바이트코드로 받아들임
		//Scanner 도구를 활용해서 읽어들이겠다. 메모리 상에 scanner 도구 자리 차지
		//내가 생성한 스캐너가 어디에 생성되는지 알아야 함. (주소) -> 변수에 담음
		//Scanner sc => Scanner : 스캐너 형태의 도구의 주소를 저장할 수 있는 자료형
		Scanner sc = new Scanner(System.in);
		//주소를 가지고 scanner를 찾아감
		String s = sc.next(); //스캐너로 입력된 값을 받아들임 -> 기억을 하기 위해서는 변수(String s)가 필요함
		//스캐너가 입력된 값을 돌려줌(반환) - String 타입으로 돌려줌 -> 돌려준 값을 변수에 저장
		
		System.out.println(s); //s변수가 가지고 있는 값을 콘솔에 출력
		
		//Scanner : 입력한 값을 공백문자(' ', \t, \n)를 기준으로 분리
		sc.nextLine(); // 녕 한번 처리해버림
		String s2 = sc.nextLine();
		System.out.println(s2);
	}

}
