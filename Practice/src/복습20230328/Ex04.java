package 복습20230328;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		System.out.print(input + "의 약수 : ");
		
		for(int i = 1 ; i <= input ; i++) {
			if(input % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
