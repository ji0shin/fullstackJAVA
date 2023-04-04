package 연습1차;

import java.util.Scanner;

public class NO19 { // 2분 55초

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단수입력 : ");
		int times = sc.nextInt();
		System.out.println("어느 수까지 출력 : ");
		int num = sc.nextInt();
		System.out.println(times + "단");
		for(int i = 1; i <= num ; i++) {
			System.out.println(times + "*" + i + "=" + times*i);
		}

	}

}
