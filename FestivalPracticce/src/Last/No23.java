package Last;

public class No23 {

	public static void main(String[] args) {
		
		System.out.println("원본");
		int num = 1;
		
		int[][] arr = new int[5][5];
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
		System.out.println("90도 회전");
		
		int[][] arrRotate = new int[5][5];
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				arrRotate[i][j] = arr[j][4-i];
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arrRotate[i][j] + "\t");
			}
			System.out.println();
			
		}
		
		

	}

}
