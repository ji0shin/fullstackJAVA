package Last;

public class No21 {

	public static void main(String[] args) {
		
		int[] point = {11,2,6,5};
		
		int min = Math.abs(point[0] - point[1]);
		int a = 0;
		int b = 0;
		
		for(int i = 0 ; i < point.length ; i++) {
			for(int j = i+1 ; j < point.length ; j++) {
				if(min > Math.abs(point[i] - point[j])) {
					min = Math.abs(point[i] - point[j]);
					a = i;
					b = j;
				}
			}
		}
		
		System.out.printf("result = [%d, %d]", a, b);

	}

}
