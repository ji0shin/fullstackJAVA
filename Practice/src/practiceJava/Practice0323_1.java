package practiceJava;

import java.util.Scanner;

public class Practice0323_1 {

	public static void main(String[] args) {
		
		//시험점수가 80점 이상이라면 합격 판별을 하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오: ");
		int score = sc.nextInt();
		
		if(score >= 80) {
			System.out.println("축하합니다! 합격입니다.");
		}
	}
}
