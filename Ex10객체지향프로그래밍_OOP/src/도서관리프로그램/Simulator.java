package 도서관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Simulator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList bookTitle = new ArrayList<String>();
		ArrayList bookPrice = new ArrayList<Integer>();
		ArrayList bookWriter = new ArrayList<String>();
		
		System.out.print("책 이름을 입력하세요 >> ");
		bookTitle.add(sc.nextLine());
		System.out.print("가격을 입력하세요 >> ");
		int priceOfBood = sc.nextInt();
		System.out.print("저자 이름을 입력하세요 >> ");
		String name = sc.next();
		
		BookData bd1 = new BookData("불편한편의점", 12900, "아무개");
		BookData bd2 = new BookData("데미안", 8900, "헤르만헤세");
		
		System.out.println(bd1.getTitle());
		System.out.println(bd1.getPrice());
		System.out.println(bd1.getWriter());
		System.out.println(bd2.getTitle());
		System.out.println(bd2.getPrice());
		System.out.println(bd2.getWriter());
		
		bd1.setWriter("몰라요");
		System.out.println(bd1.getWriter());
		bd2.setPrice(11200);
		System.out.println(bd2.getPrice());
	}

}
