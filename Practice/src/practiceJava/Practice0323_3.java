package practiceJava;

import java.util.Scanner;

public class Practice0323_3 {

	public static void main(String[] args) {
		// 중첩 if문
		// 점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격을 출력
		// 4학년의 경우 70점 이상이어야 합격
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = sc.nextInt();
		System.out.print("학년을 입력하세요(1~4): ");
		int grade = sc.nextInt();
		
		//내가푼거
	
		if(score >= 60) {
			if(grade == 4 && score >= 70) {
				System.out.println("합격!");
			}else {
				if(grade < 4) {
					System.out.println("합격!");
				}else {
					System.out.println("불합격!");
				}
			}
		}else {
			System.out.println("불합격!");
		}
		
		// 정답
		
		if(score >= 60) {
			if(grade != 4) {
				System.out.println("합격!");
			}else if(score >= 70) {
				System.out.println("합격!");
			}else {
				System.out.println("불합격!");
			}
		}else {
			System.out.println("불합격!");
		}
	}
}
