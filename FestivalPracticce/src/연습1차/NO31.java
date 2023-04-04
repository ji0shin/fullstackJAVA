package 연습1차;

import java.util.Scanner;

public class NO31 { // 2분 1초

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		int factorial = 1;
		for(int i = input ; i > 0 ; i--) {
			factorial *= i;
		}
		
		System.out.println("출력 : " + factorial);

	}

}
