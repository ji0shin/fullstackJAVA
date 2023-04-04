package 연습1차;

import java.util.Arrays;
import java.util.Scanner;

public class NO30 { // 다시풀기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력>> ");
		String input = sc.nextLine();
		
		char[] inputArray = new char[input.length()]; //문자열 char 배열
		char[] lower = new char[26]; //소문자 배열
		char lowerAlpha = 97;
		char[] upper = new char[26]; //대문자 배열
		char upperAlpha = 65;
		int[] number = new int[26]; //알파벳 빈도 숫자
		
		//대문자, 소문자 순서대로 배열에 넣기
		for(int i = 0 ; i < lower.length ; i++) {
			lower[i] = lowerAlpha;
			lowerAlpha++;
			upper[i] = upperAlpha;
			upperAlpha++;
		}
		
		// 입력 받은 문자열 char로 변환 후 배열에 값 넣기
		for(int i = 0; i < input.length() ; i++) {
			inputArray[i] = input.charAt(i);
		}
		
		// 동일한 문자 비교
		for(int i = 0 ; i < inputArray.length ; i++) {
			for(int j = 0 ; j < lower.length ; j++) {
				if(inputArray[i] == lower[j] || inputArray[i] == upper[j]) {
					number[j]++;
				}
			}
		}
		
		for(int i = 0 ; i < number.length ; i++) {
			System.out.println(lower[i] + " : " + number[i]);
		}
		
		System.out.println(Arrays.toString(inputArray));
	}
}
