package 연습1차;

import java.util.Arrays;
import java.util.Scanner;

public class NO14 { // 다시풀기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int num = sc.nextInt();
		
		int[][] arr = new int[num][num];
		
		// 짝수 행일 때
		// 0번행
//		for(int i = 0 ; i < num ; i++) {
//			arr[0][i] = i + 1;
//		}
//		// 2번행
//		for(int i = 0 ; i < num ; i++) {
//			arr[2][i] = i + 1 + (2 * 5);
//		}
//		//4번행
//		for(int i = 0 ; i < num ; i++) {
//			arr[4][i] = i + 1 + (4 * 5);
//		}
//		
//		// 홀수 행일 떄
//		// 1번행
//		for(int i = 0 ; i < num ; i++) {
//			arr[1][i] = 5 * 2 - i;
//		}
//		
//		// 3번행
//		for(int i = 0 ; i < num ; i++) {
//			arr[3][i] = 5 * 4 - i;
//		}
		
		
		for(int j = 0 ; j < num ; j++) {
			if(j % 2 == 0) {
				for(int i = 0 ; i < num ; i++) {
					arr[j][i] = i + 1 + (j * num);
					System.out.print(arr[j][i] + " ");
				}
				System.out.println();
			}else {
				for(int i = 0 ; i < num ; i++) {
					arr[j][i] = (j + 1) * num - i;
					System.out.print(arr[j][i] + " ");
				}
				System.out.println();
			}
		}

	}

}
