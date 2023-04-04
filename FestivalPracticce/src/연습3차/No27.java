package 연습3차;

import java.util.Scanner;

public class No27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 채점하기 ====");
		String input = sc.next();
		
		char[] arr = new char[input.length()];
		
		for(int i = 0 ; i < input.length() ; i++) {
			arr[i] = input.charAt(i);
		}
		
		int sum = 0;
		int score = 1; 
		for(int j = 0 ; j < arr.length ; j++) {

			if(arr[j] == 'X') {
				score = 1;
			}else {
				sum += score++;
			}
		}
		
		System.out.println(sum);
		
		

	}

}
