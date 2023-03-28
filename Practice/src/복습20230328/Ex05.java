package 복습20230328;

public class Ex05 {
	
	public static void main(String[] args) {
		
		for(int j = 2 ; j <= 9 ; j++) {
			System.out.print(j + "단 : ");
			for(int i = 1 ; i <= 9 ; i++) {
				System.out.print(j + "*" + i + "=" + j*i + " ");
			}
			System.out.println();
		}

	}

}
