package 연습1차;

import java.util.Random;

public class NO10 { // 4분 22초

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int[] array = new int[8];
		String arrayPrint = "";
		int max = 0;
		int min = 100;
		
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = rd.nextInt(100)+1; 
			arrayPrint += array[i] + " ";
			
			if(max < array[i]) {
				max = array[i];
			}
			if(min > array[i]) {
				min = array[i];
			}
		}
		
		System.out.println("배열에 있는 모든 값 : " + arrayPrint);
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
		

	}

}
