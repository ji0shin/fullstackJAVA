package 연습1차;

import java.util.Arrays;
import java.util.Scanner;

public class NO20 {

	public static void main(String[] args) { // 다시풀기
		
		Scanner sc = new Scanner(System.in);
		
		int[] binary = new int[20];
		
		System.out.println("숫자입력>>");
		int num = sc.nextInt();
		int position = 0;
		
		while(true) {
			binary[position] = num % 2;
			num = num / 2;
			position++;
			
			if(num == 0) {
				break;
			}
		}
		
		for(int i = position - 1 ; i >= 0 ; i--) {
			System.out.print(binary[i] + " ");
		}
	}
}
