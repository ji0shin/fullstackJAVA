package 연습1차;

import java.util.Scanner;

public class Bonus1 { // 3분 5초

	public static void main(String[] args) {
		int sub = 0;
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.print("A입력 >> ");
		int inputA = sc.nextInt();
		System.out.print("B입력 >> ");
		int inputB = sc.nextInt();
		
		if(inputA == 0 && inputB == 0) {
			break;
		}
		
		sub = inputA - inputB;
		System.out.println("결과 >> " + sub);
		}
		

	}

}
