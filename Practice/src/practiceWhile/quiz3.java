package practiceWhile;

import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// while문
		int odd = 0 ;
		int even = 0 ;
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int input = sc.nextInt();	
			if(input == -1) {
				break;
			}			
			
			if(input % 2 == 1) {
				odd++;
			}else {
				even++;
			}
		}	
		System.out.println("홀수 개수 : " + odd);
		System.out.println("짝수 개수 : " + even);
		
		
		// do-while문		
		do {
			System.out.print("숫자 입력 : ");
			int input = sc.nextInt();
			
			if(input == -1) {
				break;
			}			
			
			if(input % 2 == 1) {
				odd++;
			}else {
				even++;
			}
			
		}while(true);		
		System.out.println("홀수 개수 : " + odd);
		System.out.println("짝수 개수 : " + even);
	}
}
