package 연습3차;

import java.util.Scanner;

public class No26 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		
		int multi = 1;
		int sum = 0;
		int[] num2Arr = new int[3];
		for(int i = 0 ; i < num2Arr.length ; i++) {
			num2Arr[i] = num2 % 10;
			System.out.println(num1 * num2Arr[i]);
			sum += num1 * num2Arr[i] * multi;
			num2 /= 10;
			multi *= 10;
			
		}
		
		System.out.println(sum);
		
		
		
		
	}

}
