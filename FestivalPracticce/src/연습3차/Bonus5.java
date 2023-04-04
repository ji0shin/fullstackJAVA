package 연습3차;

import java.util.Scanner;

public class Bonus5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < 5 ; i++) {
			System.out.print(i+1 + "번째 수 입력 : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("정렬 후");
		int index = 0;
		int temp;
		
		for(int j = 0 ; j < arr.length - 1 ; j++) {
			for(int i = j + 1 ; i < arr.length ; i++) {
				if(arr[i] < arr[index]) {
					index = i;
				}
			}
			temp = arr[j];
			arr[j] = arr[index];
			arr[index] = temp;
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
