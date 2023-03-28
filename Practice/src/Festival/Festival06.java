package Festival;

public class Festival06 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 77 ; i >= 1 ; i--) {
			sum += i * (78-i);
		}
		System.out.println(sum);

	}

}
