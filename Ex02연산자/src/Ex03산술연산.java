import java.util.Scanner;

public class Ex03산술연산 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("JAVA 정수 입력 : ");
		int javaScore = sc.nextInt();
		System.out.print("WEB 정수 입력 : ");
		int webScore = sc.nextInt();
		System.out.print("ANDROID 점수 입력 : ");
		int androidScore = sc.nextInt();
		
		
		System.out.println("합계 : " + (javaScore + webScore + androidScore));
		double average = (javaScore + webScore + androidScore) / 3.0 ;
		System.out.printf("평균 : %.2f", average);
		

	}

}
