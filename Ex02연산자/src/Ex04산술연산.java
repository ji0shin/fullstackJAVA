import java.util.Scanner;

public class Ex04산술연산 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.print("초 입력: ");
		int time = sc.nextInt();
		
//		int hours = time / 60 / 60;
//		int minutes = time / 60 % 60;
//		int seconds = time % 60;
//		System.out.printf("%d시 %d분 %d초", hours, minutes, seconds);	
//		
		//쌤풀이 
		// 3723초 -> 1시(3600초) 2분(60초) 3초
		
		int hour = time / 3600;
		int minute = time % 3600 / 60; // 시간을 구한 나머지를 60으로 나눔
//		int second = time % 3600 % 60; // 시간으로 나누고 분으로 나눈 나머지 ->  3600은 60으로 나누어짐 ->  결과는 똑같으나 연산은 2번 이루어짐 -> 3600은 제외
		int second = time % 60;
		
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
}
