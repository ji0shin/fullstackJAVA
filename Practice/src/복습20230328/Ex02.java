package 복습20230328;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
	
		for(int i = 1 ; i <= 100 ; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 입력 >> ");
		int input = sc.nextInt();
		
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.print(input * i + " ");
		}
	}
}
