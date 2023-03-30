package 배열;

import java.util.Arrays;
import java.util.Random;

public class Practice03 {

	public static void main(String[] args) {
		// 1) 크기가 10인 1차원 정수형 배열을 선언한 후 랜덤 값으로 초기화
		Random rd = new Random();
		
		int[] array = new int[10];
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = rd.nextInt(20)+1;
		}
		
		System.out.println(Arrays.toString(array));
		
		// 2) 배열의 값 중 가장 큰 값을 찾아 출력하시오.
		int max = array[0];
		for(int i = 0 ; i < array.length ; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("가장 큰 값 : " + max);
		
		// 3) 배열의 값 중 가장 작은 값을 찾아 출력하시오
		int min = array[0];
		for(int i = 0 ; i < array.length ; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("가장 큰 값 : " + min);

	}

}
