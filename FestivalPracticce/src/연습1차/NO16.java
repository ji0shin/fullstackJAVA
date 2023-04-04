package 연습1차;

import java.util.Scanner;

public class NO16 { // 2분 9초

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= 8 ; i++) {
			sum += num % 10;
			num /= 10;
		}
		System.out.printf("합은 %d입니다.", sum);

	}

}
