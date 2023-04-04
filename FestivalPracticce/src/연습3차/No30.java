package 연습3차;

import java.util.Scanner;

public class No30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력>> ");
		String input = sc.nextLine();
		
		input = input.replace(" ", "").toLowerCase();
		
		int[] alphabet = new int[26];
		
		for(int i = 0 ; i < input.length() ; i++) {
			for(int j = 0 ; j < alphabet.length ; j++) {
				if(input.charAt(i) == (char)(j+97)) {
					alphabet[j]++;
				}
			}
		}
		
		for(int i = 0 ; i < alphabet.length ; i++) {
			System.out.println((char)(i+97) + " : " + alphabet[i]);
		}
	}
}
