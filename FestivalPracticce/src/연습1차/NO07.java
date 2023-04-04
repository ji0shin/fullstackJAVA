package 연습1차;

import java.util.Scanner;

public class NO07 { // 2분 30초

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int count = sc.nextInt();
		
		for(int i = count ; i >= 1 ; i--) {
			for(int j = i ; j >= 1; j--) {
				System.out.print("*");
			}System.out.println();
		}

	}

}
