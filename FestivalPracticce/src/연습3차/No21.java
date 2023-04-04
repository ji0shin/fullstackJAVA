package 연습3차;

public class No21 {

	public static void main(String[] args) {
		
		int[] point = {11,2,6,5};
		
		int min = Math.abs(point[0] - point[1]);
		
		int start = 0;
		int end = 0;
		
		for(int j = 0 ; j < point.length ; j++) {
			for(int i = j + 1 ; i < point.length ; i++) {
				if(Math.abs(point[j] - point[i]) < min) {
					min = Math.abs(point[j] - point[i]);
					start = j;
					end = i;
				}
			}
		}
		
		System.out.printf("result = [%d, %d]", start, end);
	}

}
