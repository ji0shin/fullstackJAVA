package 연습1차;

import java.util.Scanner;

public class NO05 { // 2분 40초

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int count = sc.nextInt();
		for(int i = 1 ; i <= count ; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
