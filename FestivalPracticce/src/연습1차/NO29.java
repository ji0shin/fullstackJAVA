package 연습1차;

import java.util.Random;
import java.util.Scanner;

public class NO29 { // 4분 34초

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int num1 = 0;
		int num2 = 0;
		int tries = 1;
		while(true) {
			
			if(tries > 5) {
				System.out.println("GAME OVER!");
				break;
			}
			num1 = rd.nextInt(10);
			num2 = rd.nextInt(10);
			System.out.print(num1 + " + " + num2 + " = ");
			int answer = sc.nextInt();
			
			if(answer == num1 + num2) {
				System.out.println("SUCCESS!");
			}else {
				System.out.println("Fail...");
				tries++;
			}
		}

	}

}
