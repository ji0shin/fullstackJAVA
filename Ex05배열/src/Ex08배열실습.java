import java.util.Arrays;
import java.util.Scanner;

public class Ex08배열실습 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] id = new String[3];
		int[] pw = new int[3]; 
		
		int i = 0;
		while(true) {
			System.out.println("1.회원가입 2.로그인 3.종료");
			int choice = sc.nextInt();
			
			if(choice == 1) {			
				
				if(i > 2) {
					System.err.println("더이상 회원가입을 할 수 없습니다.");
					break;
				}
				
				System.out.println("==회원가입==");
				System.out.print("id 입력 : ");
				String joinId = sc.next();
				id[i] = joinId;
				System.out.print("pw 입력 : ");
				int joinPw = sc.nextInt();
				pw[i] = joinPw;
				System.out.println("가입 성공");
				i++;
				}
			
			if(choice == 2) {
				System.out.println("==로그인==");
				System.out.print("id 입력 : ");
				String inputId = sc.next();
				System.out.print("pw 입력 : ");
				int inputPw = sc.nextInt();
				
				for(int j = 0 ; j < pw.length ; j++) {
					if(inputId.equals(id[j]) && inputPw == pw[j]) {
						System.out.println("로그인 성공!");
						break;
					} else {
						System.out.println("다시 입력해주세요");
						break;
					}
//					if(j == pw.length - 1){
//						System.out.println("로그인 실패..");
//						break;
//					}
				}
			}
			
			if(choice == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
