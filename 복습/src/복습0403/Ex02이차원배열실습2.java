package 복습0403;

public class Ex02이차원배열실습2 {

	public static void main(String[] args) {
		
		int[][] arr = new int[4][6];
		int num = 21;
		
		for(int i = 0 ; i < arr.length ; i++) {
			for (int j = 0 ; j < arr[i].length ; j++) {
				arr[i][j] = num++;
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			for (int j = 0 ; j < arr[i].length ; j++) {
				 System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		

	}

}
