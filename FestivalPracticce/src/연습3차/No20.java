package 연습3차;

import java.util.Arrays;
import java.util.Scanner;

public class No20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] binary = new int[10];
		System.out.println("숫자입력>>");
		int num = sc.nextInt();
		
		int i = 0;
		while(true) {
			binary[i] = num % 2;
			num /= 2;
			i++;
			
			if(num < 1) {
				break;
			}
		}

		for(int j = i - 1 ; j >= 0 ; j--) {
			System.out.print(binary[j] + " ");
		}
	}

}
