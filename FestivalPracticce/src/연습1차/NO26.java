package 연습1차;

import java.util.Scanner;

public class NO26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		int multiNum = 0;
		int sum = 0;
		int ten = 1;
		while(true) {
			multiNum = num2 % 10;
			num2 /= 10;
			sum += multiNum * num1 * ten;
			System.out.println(multiNum * num1);
			ten *= 10;
			
			if(num2 == 0) {
				System.out.println(sum);
				break;
			}
		}

	}

}
