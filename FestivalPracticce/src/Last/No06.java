package Last;

public class No06 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1 ; i < 78 ; i++) {
			sum += (78 - i) * i;
		}
		System.out.println(sum);

	}

}
