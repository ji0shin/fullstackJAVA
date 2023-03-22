import java.util.Scanner;

public class Ex07삼항연산 {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 입력하세요 : ");
		int basketball = sc.nextInt();
		
		System.out.print("필요한 상자의 수 : ");
		System.out.println((basketball % 5 > 0) ? basketball / 5 + 1 : basketball / 5 );
//		System.out.println((basketball % 5 == 0) ? basketball / 5 + 1 : basketball / 5 );
		

	}

}
