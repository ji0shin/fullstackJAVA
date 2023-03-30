package 자바기본프로그래밍_실습문제;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		// 2차원 평면에서 직사각형은 문제 7번처럼 두 점으로 표현된다. 
		// 키보드로부터 직사각형을 구성하는 두 점 (x1, y1), (x2, y2)를 입력받아 
		// (100,100), (200,200)의 두 점으로 이루어진 직사각형과 충돌하는지 판별하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점 (x1, y1), (x2, y2) 좌표를 입력하시오 >> ");		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		 if(x1 < 100 && x2 < 100) {
			 System.out.println("충돌하지 않습니다.");
		 } else if(x1 > 100 && x2 > 100) {
			 if((y1 < 100 && y2 < 100) || (y1 > 200 && y2 > 200)) {
				 System.out.println("충돌하지 않습니다.");
			 }
		 } else if(x1 > 200 && x2 > 200) {
			 System.out.println("충돌하지 않습니다.");
		 }

	}

}
