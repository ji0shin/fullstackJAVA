package Last;

public class No14 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int num = 1;
		for(int i = 0 ; i < arr.length ; i++) {
			if(i % 2 == 0) {
				for(int j = 0 ; j < arr[i].length ; j++) {
					arr[i][j] = num++;
				}
			}else {
				for(int j = 0 ; j < arr[i].length ; j++) {
					arr[i][4-j] = num++;
				}
			}

		}
		
		for(int l = 0 ; l < arr.length ; l++) {
			for(int n = 0 ; n < arr[l].length ; n++) {
				System.out.print(arr[l][n] + "\t");
			}
			System.out.println();
		}
	}
}
