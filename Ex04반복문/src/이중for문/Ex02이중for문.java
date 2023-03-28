package 이중for문;

public class Ex02이중for문 {

	public static void main(String[] args) {
		// 2~30까지의 약수를 구하세요.
		
		for(int j = 2 ; j <= 30 ; j++ ) {
			System.out.print(j + "의 약수 : ");
			for(int i = 1 ; i <= j ; i++) {
				if(j % i == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
	}
}
