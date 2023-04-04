package 연습3차;

import java.util.Scanner;

public class No25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		String num = sc.next();
		
		String[] arr = num.split("");
		int dashNum = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i].equals("0") || arr[i].equals("6") || arr[i].equals("9")) {
				dashNum += 6;
			}else if(arr[i].equals("1")) {
				dashNum += 2;
			}else if(arr[i].equals("2") || arr[i].equals("3") || arr[i].equals("5")) {
				dashNum += 5;
			}else if(arr[i].equals("4")) {
				dashNum += 4;
			}else if(arr[i].equals("7")) {
				dashNum += 3;
			}else {
				dashNum += 7;
			}
		}
		
		System.out.println("대시('-')의 총 합 >> " + dashNum);

	}

}
