package 연습1차;

import java.util.Scanner;

public class NO15 { // 2분

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		
		int sequence = 1;
		
		for(int i = 0 ; i < 7 ; i++) {
			sequence += i;
			System.out.print(sequence + " ");
		}

	}

}
