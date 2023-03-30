package 자바기본프로그래밍_실습문제;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		
		// Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아
		// 오만원권, 만원권, 천원권, 500원, 100, 50원, 10원, 1원 동전이 각 몇개 변환되는지 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = sc.nextInt();
		
		if(money / 50000 > 0) {
			System.out.println("오만원권 " + money/50000 + "매");
			money -= 50000 * (money/50000);
		}
		
		
		if(money / 10000 > 0) {
			System.out.println("만원권 " + money/10000 + "매");
			money -= 10000 * (money/10000);
		}

		
		if(money / 1000 > 0) {
			System.out.println("천원권 " + money/1000 + "매");
			money -= 1000 * (money/1000);
		}
		
		
		if(money /500 > 0) {
			System.out.println("오백원 " + money/500 + "개");
			money -= 500 * (money/500);
		}
		
		
		if(money / 100 > 0) {
			System.out.println("백원 " + money/100 + "개");
			money -= 100 * (money/100);
		}
		
		if(money / 50 > 0) {
			System.out.println("백원 " + money/50 + "개");
			money -= 50 * (money/50);
		}
		
		if(money / 10 > 0) {
			System.out.println("백원 " + money/10 + "개");
			money -= 10 * (money/10);
		}
		
		if(money / 10 < 1) {
			System.out.println("일원 " + money%10 + "개");
		}
			}
}
