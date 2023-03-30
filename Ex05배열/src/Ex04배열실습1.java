import java.util.Arrays;
import java.util.Random;

public class Ex04배열실습1 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int[] array = new int[10] ;
		//정수배열을 선언하면 기본값은 0
		
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = rd.nextInt(20) + 1;
		}
		
		System.out.println(Arrays.toString(array));
		
		int min = array[0]; // 내가 지금까지 본 숫자 중에 가장 작은 숫자
		int max = array[0]; // 내가 지금까지 본 숫자 중에 가장 큰 숫자
		
		for(int i = 0 ; i < array.length ; i++) {
			if(min > array[i]) {
				min = array[i];
			}
			if(max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.print("가장 큰 값 : " + max);
		System.out.println("\n가장 작은 값 : " + min);

	}

}
