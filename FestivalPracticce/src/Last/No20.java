package Last;

import java.util.Scanner;

public class No20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자입력>>");
		int num = sc.nextInt();
		
		int[] binary = new int[10];
		int i = 0;
		while(true) {
			binary[i] = num % 2;
			i++;
			num /= 2;
			
			if(num < 1) {
				break;
			}
		}
		
		for(int j = i -1 ; j >= 0 ; j--) {
			System.out.print(binary[j] + " ");
		}

	}

}
