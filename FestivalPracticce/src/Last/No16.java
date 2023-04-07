package Last;

import java.util.Scanner;

public class No16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		while(true) {
			sum += num % 10;
			num /= 10;
			
			if(num < 1) {
				break;
			}
		}
		
		System.out.println("합은 " + sum + "입니다.");
		

	}

}
