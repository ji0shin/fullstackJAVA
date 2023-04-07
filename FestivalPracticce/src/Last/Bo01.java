package Last;

import java.util.Scanner;

public class Bo01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numA;
		int numB;
		while(true) {
			System.out.print("A 입력 >> ");
			numA = sc.nextInt();
			System.out.print("B 입력 >> ");
			numB = sc.nextInt();
			
			if(numA == 0 && numB == 0) {
				break;
			}
			System.out.println("결과 >> " + (numA - numB));
		}

	}

}
