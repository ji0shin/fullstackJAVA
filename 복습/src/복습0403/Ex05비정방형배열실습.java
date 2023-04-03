package 복습0403;

import java.util.Scanner;

public class Ex05비정방형배열실습 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] array = new int[4][];
		int[] total = new int[4];
		
		array[0] = new int[3];
		array[1] = new int[5];
		array[2] = new int[4];
		array[3] = new int[6];
		
		for(int i = 0 ; i < array.length ; i++) {
			
			System.out.println((i+1) + "반 점수 입력");
			
			for(int j = 0 ; j < array[i].length ; j++) {
				System.out.printf("%d반 %d번째 학생 점수 >> ", (i+1), (j+1));
				array[i][j] = sc.nextInt();
				total[i] += array[i][j];
			}
		}
		
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print((i+1 + "반 >> "));
			for(int j = 0 ; j < array[i].length ; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
			System.out.println("총점 : " + total[i] + " 평균 : " + (double)total[i]/array[i].length);
		}

	}

}
