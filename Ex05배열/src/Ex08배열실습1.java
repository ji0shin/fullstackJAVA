import java.util.Scanner;

public class Ex08배열실습1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int menu ;
		String id ; //현재 로그인하는 사용자의 아이디
		String pw ; //현재 로그인하는 사용자의 비밀번호
		int cnt = 0; //현재까지 회원가입한 사용자의 카운팅
//		boolean sw = true; //true : 로그인 불가, false : 로그인 가능 ----->  위에서 선언하면 그 전에 sw가 false이면 그 다음에서 작동 안함
		
		String[] idArray = new String[3];
		String[] pwArray = new String[3];
		
		while(true) {
			System.out.println("1.회원가입 2.로그인 3.종료");
			menu = sc.nextInt(); // int menu = --> 변수 선언(공간을 만든다) 
			 					// 반복문 안에 있으면 공간을 계속 만듦. 따라서 선언은 반복문 밖에서
			
			System.out.print("아이디 : ");
			for(String i : idArray) {
				System.out.print(i + " ");
			}
			System.out.print("비밀번호 : ");
			for(String p : pwArray) {
				System.out.print(p + " ");
			}
			System.out.println();
			
			if(menu == 1) { //회원가입
				System.out.println("===회원가입===");
				
				if(cnt == 3) {
					System.out.println("회원가입 불가!");
				}else {
					System.out.print("id 입력 : ");
//					id = sc.next(); 
					idArray[cnt] = sc.next();
					System.out.print("pw 입력 : ");
//					pw = sc.next();
					pwArray[cnt] = sc.next();
					
					//[가입할 때마다 변해야 함 -->  변수]
//					idArray[cnt] = id;
//					pwArray[cnt] = id;
					cnt++; //그 다음 회원가입하는 사람은 그 다음 인덱스에 저장되게!
				}
				
			}else if(menu == 2) { //로그인
				boolean sw = true; //true : 로그인 불가, false : 로그인 가능 ---> 
				System.out.println("===로그인===");
				System.out.print("id 입력 : ");
				id = sc.next();
				System.out.print("pw 입력 : ");
				pw = sc.next();
				
				for(int i = 0 ; i < cnt ; i++) { //null 값이 있으면 보지않게 
					if(idArray[i].equals(id) && pwArray[i].equals(pw)) {
						System.out.println("로그인 성공!");
						sw = false;
						break; //회원정보는 겹치치 않으니 로그인에 성공하면 그 다음 인덱스는 보지 않아도 됨
					}
				}
				
				if(sw) {
					System.out.println("로그인 실패...");
				}
				
			}else { //종료
				System.out.println("종료");
				break;
				}
			}

	}

}
