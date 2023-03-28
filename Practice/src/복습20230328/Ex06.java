package 복습20230328;

public class Ex06 {

	public static void main(String[] args) {
		
		for(int j = 2 ; j <= 30 ; j++) {
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
