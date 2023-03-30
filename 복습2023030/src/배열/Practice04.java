package 배열;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1) 크기가 5인 정수형 배열을 생성하시오.
		int[] array = new int[5];
		
		int sum = 0;
		// 2) 정수형 배열에 5개의 점수를 입력하여 저장한 후 모두 출력하시오.
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			int inputNum = sc.nextInt();
			array[i] = inputNum;
		}
		System.out.print("입력된 점수 : ");
		for(int i = 0 ; i < array.length ; i++) {
			sum += array[i];
			System.out.print(array[i] + " " );
			
		}
		
		// 3) 입력한 점수 중 최고 점수와 최저 점수를 출력하시오
		int max = array[0];
		int min = array[0];
		for(int i = 0 ; i < array.length ; i++) {
			if(max < array[i]) {
				max = array[i];
			}else if(min > array[i]) {
				min= array[i];
			}
		}
		System.out.print("\n최고 점수 : " + max);
		System.out.println("\n최저 점수 : " + min);
		
		// 4) 입력한 점수의 총 합과 평균을 출력하시오. 
		System.out.println("총 합 : " + sum);
		System.out.println("평균 : " + (double)sum/array.length);
	}

}
