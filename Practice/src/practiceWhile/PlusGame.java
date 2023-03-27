package practiceWhile;

import java.util.Random;
import java.util.Scanner;

public class PlusGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("===Plus Game===");
		
		int tries = 0;
		
		while(true) {
			
			if(tries > 2) {
				System.out.println("Game Over");
				break;
			}
			
			int num1 = rd.nextInt(50)+1;
			int num2 = rd.nextInt(50)+1;
			
			System.out.print(num1 + "+" + num2 + "=");
			int input = sc.nextInt();
			
			if(input == num1 + num2) {
				System.out.println("Success");
			}else {
				tries++;
				System.out.println("Fail");
				System.out.print("계속 하시겠습니까? >> ");
				String check = sc.next();
				
				if(check.equals("N")){
					System.out.println("종료합니다.");
					break;
				}
				
			}
			
			
		}

	}

}
