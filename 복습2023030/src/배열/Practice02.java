package 배열;

import java.util.Random;

public class Practice02 {

	public static void main(String[] args) {
		// 1) 크기가 10인 1차원 정수형 배열을 선언한 후 원하는 값으로 초기화
		int[] array = {5,6,13,27,34,35,78,2,3,1};
		
		// 2) 배열의 값 중 홀수만 출력하고 몇 개인지 출력
		System.out.print("배열 홀수 : ");
		int count = 0;
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i]%2 == 1) {
				System.out.print(array[i] + " ");
				count++;
			}
		}
		System.out.println("\n총 개수 : " + count);
		
		// 3) 배열을 랜덤값으로 초기화 하도록 수정
		Random rd = new Random();
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = rd.nextInt();
		}
	}

}
