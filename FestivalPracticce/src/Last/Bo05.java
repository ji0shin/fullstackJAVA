package Last;

import java.util.Scanner;

public class Bo05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(i+1 + "번째 수 입력 : ");
			arr[i] = sc.nextInt();
		}

		int index = 0;
		int temp;
		for(int j = 0 ; j < arr.length - 1 ; j++) {
			for(int i = j + 1 ; i < arr.length ; i++) {
				index = j;
				if(arr[i] < arr[index]) {
					index = i;
				}
				temp = arr[index];
				arr[index] = arr[j];
				arr[j] = temp;
			}
		}
		
		
		System.out.println("정렬 후");
		for(int k = 0 ; k < arr.length ; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
