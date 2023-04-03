
public class Ex01이차원배열생성 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][5]; //배열생성시 크기 무조건 지정
		//일차원배열 3개, 각 배열은 5칸짜리 (길이가 5)
		//레퍼런스 배열 -> 1개 -> 길이 3
		//----> 3행 5열 행렬 구조
		//int형 배열 -->  초기화를 하지 않으면 기본 0
		
		arr[0][0] = 10;
//		arr[0] = 1; //레퍼런스 배열 초기화는 불가능
		System.out.println(arr[0][0]);
		
		char[][] charArr = {{'a', 'b', 'c'}, {'d', 'e', 'f'}};
		System.out.println(charArr.length); //2 --> 레퍼런스 배열의 길이
											//일차원배열이 몇개?
		System.out.println(charArr[0].length); //3 --> 일차원배열의 길이
		
		int[][] arr2 = new int[5][5];
		int num = 1;
		for(int j = 0 ; j < arr2.length ; j++) { //반복 -> 한개의 행을 다룬다
			for(int i = 0 ; i < arr2[j].length ; i++) { //1차원배열 하나 초기화
												//1개의 행의 각 칸(실제 데이터)을 다룬다
				arr2[j][i] = num++;
			}
		}
		

		for(int j = 0 ; j < arr2.length ; j++) { //반복
			for(int i = 0 ; i < arr2[j].length ; i++) { //1차원배열 하나 초기화
				System.out.print(arr2[j][i] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//이차원배열 실습2
		int[][] arr3 = new int[4][6];
		int start = 21;
		
		//중복 반복문 작성시 가장 바깥에 i -> j -> k 순으로 작성
		
		for(int j = 0 ; j < arr3.length ; j++) {
			for(int i = 0 ; i < arr3[j].length ; i++) {
				arr3[j][i] = start++;
			}
		}
		
		for(int j = 0 ; j < arr3.length ; j++) {
			for(int i = 0 ; i < arr3[j].length ; i++) {
				System.out.print(arr3[j][i] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//이차원배열 실습3
		int[][] arr4 = new int[5][5];
		int start2 = 1;
		
		for(int i = 0 ; i < arr4.length ; i++) {
			for(int j = arr4[i].length - 1 ; j >= 0 ; j--) {
				arr4[i][j] = start2++;
			}
		}
		
		for(int i = 0 ; i < arr4.length ; i++) {
			for(int j = 0 ; j < arr4[i].length ; j++) {
				System.out.print(arr4[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//이차원배열 실습4
		int[][] arr5 = new int[5][5];
		int num3 = 1;
		for(int i = 0 ; i < arr5.length ; i++) {
			if(i % 2 == 0) {
				for(int j = 0 ; j < arr5.length ; j++) {
					arr5[i][j] = num3++;
				}
			}else {
				for(int j = arr5.length - 1 ; j >= 0 ; j--) {
					arr5[i][j] = num3++;
				}
			}
		}
		
		for(int i = 0 ; i < arr5.length ; i++) {
			for(int j = 0 ; j < arr5[i].length ; j++) {
				System.out.print(arr5[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
