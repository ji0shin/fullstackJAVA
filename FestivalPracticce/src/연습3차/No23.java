package 연습3차;

public class No23 {

	public static void main(String[] args) {
		
		System.out.println("원본");
		int[][] arr = new int[5][5];
		int m = arr.length;
		int n = arr[0].length;
		int num = 1;
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				arr[i][j] = num++;
			}
		}

		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//
		System.out.println("90도 회전");
		int[][] rotateArr = new int[n][m];
		
		for(int i = 0 ; i < rotateArr.length ; i++) {
			for(int j = 0 ; j < rotateArr[i].length ; j++) {
				rotateArr[i][j] = arr[j][n - 1 - i];
			}
		}
		
		for(int i = 0 ; i < rotateArr.length ; i++) {
			for(int j = 0 ; j < rotateArr[i].length ; j++) {
				System.out.print(rotateArr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
