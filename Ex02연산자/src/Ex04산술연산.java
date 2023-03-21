import java.util.Scanner;

public class Ex04산술연산 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.print("초 입력: ");
		int time = sc.nextInt();
		
		int hours = time / 60 / 60;
		int minutes = time / 60 % 60;
		int seconds = time % 60;
		System.out.printf("%d시 %d분 %d초", hours, minutes, seconds);
		
		

	}

}
