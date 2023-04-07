package Last;

import java.util.Random;

public class No10 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int[] arr = new int[8];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = rd.nextInt(100)+1;
		}
		
		int max = arr[0];
		int min = arr[0];
		
		System.out.print("배열에 있는 모든 값 : ");
		for(int j = 0 ; j < arr.length ; j++) {
			System.out.print(arr[j] + " ");
			if(max < arr[j]) {
				max = arr[j];
			}
			if(min > arr[j]) {
				min = arr[j];
			}
		}
		
		System.out.println("\n가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}

}
