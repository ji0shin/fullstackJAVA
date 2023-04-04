package 연습1차;

import java.util.Scanner;

public class NO25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		String num = sc.next();
		int dash = 0;
		
		String[] arr = num.split("");

		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i].equals("0") || arr[i].equals("6") || arr[i].equals("9")){
				dash += 6;
			}else if(arr[i].equals("1")) {
				dash += 2;
			}else if(arr[i].equals("2") || arr[i].equals("3") || arr[i].equals("5")) {
				dash += 5;
			}else if(arr[i].equals("4")){
				dash += 4;
			}else if(arr[i].equals("7")) {
				dash += 3;
			}else if(arr[i].equals("8")) {
				dash += 7;
			}
		}
		
		System.out.println("대시('-')의 총 합 >> " + dash);

	}

}
