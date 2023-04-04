package 연습3차;

import java.util.Random;
import java.util.Scanner;

public class No29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int num1;
		int num2;
		int answer;
		int cnt = 1;
		while(true) {
			
			if(cnt > 5) {
				System.out.println("GAME OVER!");
				break;
			}
			num1 = rd.nextInt(10);
			num2 = rd.nextInt(10);
			System.out.print(num1 + " + " + num2 + " = ");
			answer = sc.nextInt();
			
			if(answer == num1 + num2) {
				System.out.println("SUCCESS!");
			}else {
				System.out.println("Fail...");
				cnt++;
			}
		}
		
	}

}
