package 배열;

public class Practice01 {

	public static void main(String[] args) {
		// 1) 정수형 데이터를 담을 수 있는 배열 array 선언
		int[] array;
		// 2) 정수형 데이터 10개를 담을 수 있도록 array 배열 생성
		array = new int[10];
		// 3) 각각의 인덱스에 1~20까지의 숫자를 초기화
		array[0] = 13;
		array[1] = 5;
		array[2] = 7;
		array[3] = 17;
		array[4] = 3;
		array[5] = 16;
		array[6] = 19;
		array[7] = 20;
		array[8] = 2;
		array[9] = 1;
		// 4) 배열 array의 각각의 인덱스에 들어있는 모든 데이터를 출력
		for(int i = 0 ; i < array.length ; i++) {
			System.out.println(array[i]);
		}
		// 5) 1번째 인덱스에 들어있는 값과 4번째 인덱스에 들어있는 값을 더하여 결과 값을 출력
		System.out.println(array[0] + array[3]);
		// 6) 각각의 인덱스에 들어있는 데이터를 모두 더하여 결과 값을 출력
		int sum = 0;
		for(int i = 0 ; i < array.length ; i++) {
			sum += array[i];
		}
		System.out.println(sum);
		// 7) 배열 안에 있는 수의 평균 출력
		System.out.println(sum / array.length);
		

	}

}
