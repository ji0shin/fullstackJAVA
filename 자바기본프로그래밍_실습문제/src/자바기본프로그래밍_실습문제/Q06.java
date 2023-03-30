package 자바기본프로그래밍_실습문제;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		//369게임 - 1~99까지의 정수를 입력받고 정수에 3, 6, 9 중 하나가 있는 경우는 "박수짝"
		//두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int num = sc.nextInt();
		
		int lastNum = num % 10;
		int firstNum = num / 10;
		
		if(lastNum % 3 == 0) {
			if(firstNum % 3 == 0) {
				System.out.println("박수짝짝");
			}else {
				System.out.println("박수짝");
			}
		}
		


	}

}
