package 연습1차;

import java.util.Scanner;

public class NO28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = "00000111";
		
		String[] arr = str.split("");
		int decimal = 0;
		int multi = 1;
		
		for(int i = arr.length - 1 ; i >= 0 ; i--) {
			if(arr[i].equals("1")){
				decimal += multi;
			}
			multi *= 2;
		}
		
		System.out.print(str + "(2) = " + decimal + "(10)");
		
	}

}
