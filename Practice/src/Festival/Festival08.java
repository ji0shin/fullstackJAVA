package Festival;

import java.util.Scanner;

public class Festival08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("A 입력 >> ");
			int inputA = sc.nextInt();
			System.out.print("B 입력 >> ");
			int inputB = sc.nextInt();
			
			if(inputA == 0 && inputB == 0) {
				break;
			}
			
			System.out.print("결과 >> " + (inputA - inputB));
			System.out.println();

		}

	}

}
