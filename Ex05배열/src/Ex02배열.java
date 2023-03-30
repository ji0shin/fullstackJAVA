import java.util.Arrays;

public class Ex02배열 {

	public static void main(String[] args) {
		
		//1. 정수형 데이터 저장하는 배열의 참조값을 가지는 레퍼런스 변수 선언
		int[] array;
		
		//2. 크기가 10인 배열 생성 후 참조값을 변수에 저장
		array = new int[10];

		//3. 0~9 인덱스에 값을 초기화(할당)
		array[0] = 54;
		array[1] = 7;
		array[2] = 21;
		array[3] = 2;
		array[4] = 31;
		array[5] = 17;
		array[6] = 1;
		array[7] = 11;
		array[8] = 15;
		array[9] = 100;
		
		//4. 배열의 모든값 출력
		for(int i = 0 ; i < array.length ; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println(Arrays.toString(array)); 
		//Arrays 어떤 배열이든 다룰 수 있게끔 도와주는 도구
		//★★★toString 중요! 
		//도구 → 객체(인스턴스)
		//어떤 객체이든 toString을 공통적으로 가지고 있음
		//           : 객체가 가지고 있는 값을 문자열로 바꿔주는 기능

		//5. 1번 인덱스에 저장된 값과 4번 인덱스에 저장된 값의 합을 출력
		System.out.println(array[1] + array[4]);
		
		//6. 각 인덱스에 저장된 모든 값을 더하여 출력 (누적합)
		int sum = 0; //누적합을 저장하고 있을 변수
		for(int i = 0 ; i < array.length ; i++) {
			sum += array[i];
		}
		System.out.println(sum);
		
		//7. 배열 안에 있는 수의 평균 구하여 출력
		System.out.println(sum / (double)array.length);
	}

}
