package 연습1차;

import java.util.Scanner;

public class NO12 { // 다시풀기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 >> ");
		int num = sc.nextInt();
		
		int[][] array = new int[num][num];
		int rowNum = 1;
		int inputNum = rowNum;
		
		for(int row = 0; row < num ; row++) {
			for(int col = 0 ; col < num ; col++) {
				array[row][col] = inputNum;
				inputNum += 5;
				System.out.print(array[row][col] + " ");
				
			}
			rowNum++;
			inputNum = rowNum;
			System.out.println();
		}
	}

}
