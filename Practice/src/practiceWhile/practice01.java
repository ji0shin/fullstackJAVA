package practiceWhile;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		
		while(true) {
			System.out.print("숫자 입력 : ");
			input = sc.nextInt();
			
			if(input >= 10) {
				System.out.println("종료!");
				break;
			};
		}
		
		do {
			System.out.print("숫자 입력 : ");
			input = sc.nextInt();
			
			if(input >= 10) {
				System.out.println("종료!");
				break;
			}
		}while(true);
	}
}
