package practiceWhile;

import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// while문
		int sum = 0 ;
		while(true) {
			System.out.print("숫자 입력 : ");
			int input = sc.nextInt();
			
			if(input == -1) {
				break;
			}			
			sum += input;
		}	
		System.out.println("누적결과 : " + sum);
		
		
		// do-while문		
		do {
			System.out.print("숫자 입력 : ");
			int input = sc.nextInt();
			
			if(input == -1) {
				break;
			}			
			sum += input;
		}while(true);		
		System.out.println("누적결과 : " + sum);		
	}
}
