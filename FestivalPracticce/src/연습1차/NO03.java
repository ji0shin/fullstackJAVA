package 연습1차;

public class NO03 { //1분 29초

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			if(i % 2 == 1) {
				sum += i;
				System.out.print(i + " ");
			}else {
				sum -= i;
				System.out.print(-i + " ");
			}
		}
		System.out.println("\n결과 : " + sum);
	}

}
