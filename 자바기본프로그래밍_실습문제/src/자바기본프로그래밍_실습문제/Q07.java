package 자바기본프로그래밍_실습문제;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// 2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리의 두 점으로 표현
		// (100, 100)과 (200. 200)의 두 점으로 이루어진 사각형이 있을 때
		// Scanner를 이용하여 정수 x와 y값을 입력받고 점 (x, y)가 이 직사각형 안에 있는지 판별
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		int rangeX = sc.nextInt();
		int rangeY = sc.nextInt();
		
		if(rangeX >= 100 && rangeX <= 200 && rangeY >= 100 && rangeY <= 300) {
			System.out.println("(" + rangeX + "," + rangeY + ")는 사각형 안에 있습니다.");
		}
		

	}

}
