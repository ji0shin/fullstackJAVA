package 복습0331;

import java.util.Scanner;

public class 배열실습4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[5];
		String score = "";
		
		int sum = 0;
		
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print(i + 1 + "번째 입력 >> ");
			int num = sc.nextInt();
			sum += num;
			array[i] = num;
			score += array[i] + " ";
		}
		System.out.println("입력된 점수 : " + score);
		
		int max = array[0];
		int min = array[0];

		
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i] > max) {
				max = array[i];
			}
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("총 합 : " + sum);
		System.out.println("평균 : " + (double)sum/array.length);
		
		

	}

}
