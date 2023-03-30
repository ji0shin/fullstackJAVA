import java.util.Arrays;
import java.util.Random;

public class Ex04배열실습 {

	public static void main(String[] args) {
		
		//랜덤 객체
		//rd는 레퍼런스 변수
		Random rd = new Random();
		
		//배열을 랜덤값으로 초기화
		int[] arr = new int[10];
		
		arr[0] = rd.nextInt(20) + 1;
		int max = arr[0]; // 처음에 0으로 설정했음
		int min = arr[0]; // 처음에 20으로 설정했음 → 범위가 바껴도 사용가능하도록 랜덤값 부여
		
		for(int i = 1 ; i < arr.length ; i++ ) {
			arr[i] = rd.nextInt(20) + 1;
			
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.print("가장 큰 값 : " + max);
		System.out.print("\n가장 작은 값 : " + min);
	}

}
