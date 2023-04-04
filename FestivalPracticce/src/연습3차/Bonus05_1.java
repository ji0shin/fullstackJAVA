package 연습3차;

import java.util.Scanner;

public class Bonus05_1 {

	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print(i+1 + "번째 수 입력 : ");
			array[i] = sc.nextInt();
		}
		
		//오름차순 정렬 - 선택 정렬
		int index;
		int temp;
				
		for(int j = 0 ; j < array.length - 1 ; j++) {
			index = j;
			for(int i = index+1 ; i < array.length ; i++) {
				if(array[index] > array[i]) {
					index = i;
				}
			}
			temp = array[j];
			array[j] = array[index];
			array[index] = temp;
		}
		
		//출력
		System.out.println("정렬 후");
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
