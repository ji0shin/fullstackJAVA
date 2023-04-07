package Last;

import java.util.Scanner;

public class No30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력 >> ");
		String input = sc.nextLine();
		input = input.replace(" ", "").toLowerCase();
		int[] arr = new int[26];
		
		for(int i = 0 ; i < input.length() ; i++) {
			for(int j = 0 ; j < arr.length ; j++) {
				if((char)(j+97) == input.charAt(i)){
					arr[j]++;
				}
			}
		}
		
		for(int k = 0 ; k < arr.length ; k++) {
			System.out.println((char)(k+97) + " : " + arr[k]);
		}
		

	}

}
