package practiceJava;

import java.util.Scanner;

public class Practice0323_4 {

	public static void main(String[] args) {
		// 학점 매기는 코드를 switch문으로 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = sc.nextInt();
		
		switch(score / 10) {
		case 10: 
		case 9:
			System.out.println("학점은 A입니다.");
			break;
		case 8:
			System.out.println("학점은 B입니다.");
			break;
		case 7:
			System.out.println("학점은 C입니다.");
			break;
		case 6:
			System.out.println("학점은 D입니다.");
			break;
		default :
			System.out.println("학점은 F입니다.");
		}

	}

}
