package Festival;

public class Festival03 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			if(i % 2 == 0) {
				System.out.print(-i + " ");
				sum -= i;
			}else {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println("결과 : " + sum);
		
	}

}
