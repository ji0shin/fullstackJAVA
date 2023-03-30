package 자바기본프로그래밍_실습문제;

import java.util.Scanner;

public class Q05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//스캐너를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고,
		//이 3개의 수로 삼각형을 만들 수 있는지 판별
		//삼각형이 되려면 두 변의 합이 다른 한 번의 합보다 커야 함
		
		System.out.print("정수 3개를 입력하시오>>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		//num1이 제일 클 때
		if(num1 > num2 && num1 > num3) {
			if(num1 < num2 + num3) {
				System.out.println("삼각형이 됩니다");
			}
			
		}
		
		//num2가 제일 클 때
		if(num2 > num1 && num2 > num3) {
			if(num2 < num1 + num3) {
				System.out.println("삼각형이 됩니다");
			}
			
		}
			
		//num3가 제일 클 때
		if(num3 > num1 && num3 > num2) {
			if(num3 < num1 + num2) {
				System.out.println("삼각형이 됩니다");
			}
			
		}
	}

}
