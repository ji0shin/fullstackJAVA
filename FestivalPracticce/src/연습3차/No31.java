package 연습3차;

import java.util.Scanner;

public class No31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		int output = 1;
		for(int i = 1 ; i <= input ; i++) {
			output *= i;
		}
		System.out.println("출력 : " + output);

	}

}
