import java.util.Scanner;

public class Ex04while문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tries = 1;
		
		while(true) {
			
			System.out.print("아이디 : ");
			String inputId = sc.next();
			System.out.print("비밀번호 : ");
			int inputPw = sc.nextInt();
			
			if(inputId.equals("smhrd") && inputPw == 1234) {
				System.out.println("로그인 성공!");
				break;
			}else {
				tries++;
				System.out.println("로그인 실패");
				
				if(tries > 3) {
					System.out.println("본인인증을 해주세요");
					break;
				}
				
				System.out.print("계속 하시겠습니까?");
				
				String reply = sc.next();
				if(reply.equals("N")) {
					break;
				}else if(reply.equals("Y")) {}
			}
		}
	}
}
