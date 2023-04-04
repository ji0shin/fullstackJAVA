package 연습1차;

import java.util.Scanner;

public class Bonus5 { // 모르겠음

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print(i+1 + "번째 수 입력 : ");
			int num = sc.nextInt();
			arr[i] = num;
		}
		int temp = 0;
		for(int n = 0 ; n < 5 ; n++) {
			for(int m = n + 1; m < 5 ; m++) {
				if(arr[n] > arr[m]) {
					temp = arr[n];
					arr[n] = arr[m];
					arr[m] = temp;
				}
			}
		}
		
		System.out.println("정렬 후");
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
