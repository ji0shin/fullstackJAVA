package 연습1차;

import java.util.Arrays;

public class NO23 {

	public static void main(String[] args) {
		
		int[][] array = new int[5][5];
		int[][] rotateArray = new int[5][5];
		int num = 1;
		System.out.println("원본");
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				array[i][j] = num;
				System.out.print(array[i][j] + " ");
				num++;
			}
			System.out.println();
		}
		
		System.out.println("\n90도 회전");

		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				rotateArray[i][j] = array[j][4-i];
				System.out.print(rotateArray[i][j] + " ");
			}
			System.out.println();
		}

	}

}
