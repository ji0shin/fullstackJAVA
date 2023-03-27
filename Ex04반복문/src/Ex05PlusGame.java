import java.util.Random;
import java.util.Scanner;

public class Ex05PlusGame {

	public static void main(String[] args) {
		
		// 1. 랜덤, 입력하는 도구 가져오기 
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 2. 출력문 -->  한번만
		System.out.println("===Plus Game===");
		
		// 틀린 횟수를 저장하는 변수
		int tries = 0;

		while(true) {
			// 맨 아래에 입력하면 문제가 일단 생성됨
		    // 사용자가 3번이상 틀리면 게임 종료

		    if(tries > 2) {
		    	System.out.println("game over");
		    	System.out.println(".　　   ＿＿＿\r\n"
		    			+ " 　 ／　  ―　   ＼\r\n"
		    			+ "  ／ノ　  ( ●)　    ＼\r\n"
		    			+ "｜  ( ●)　   ⌒)　    ｜\r\n"
		    			+ "｜　　(＿ノ￣　 　/\r\n"
		    			+ "｜　　　　　　　/\r\n"
		    			+ "  ＼＿　　  ⊂ヽ∩＼\r\n"
		    			+ "　　/   　　  (＿        ＼\r\n"
		    			+ "");
		    	break;    		
		    	}
		    
			// 3. 랜덤한 숫자 2개를 가져온다. 
			int num1 = rd.nextInt(50) + 1; //1부터 50사이의 숫자 (1부터 랜덤한 숫자를 시작하고 싶으면 + 1)
			int num2 = rd.nextInt(50) + 1;

			// 4. 문제 출력
			System.out.print(num1 + "+" + num2 + "=");
			// 사용자에게 답을 입력 받음
		    int answer = sc.nextInt();
		    // 입력한 답 == 실제 답 ----> Success / Fail
		    if(answer == num1 + num2) {
		    	System.out.println("+\r\n"
		    			+ "　 　 _n　　　　　 +\r\n"
		    			+ "　　 (　} ∧＿∧\r\n"
		    			+ "+　　＼(・ω・ ) 니가\r\n"
		    			+ "　　　 　| 　　ヽ 최고야!\r\n"
		    			+ "　　 　 /　＿とノ\r\n"
		    			+ "　　　 ,ゝ,,,)　 ヽ_,,)\r\n"
		    			+ "");
		    }else {
		    	// 틀렸다 --> 틀린 횟수 + 1
		    	tries++;
		    	System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\r\n"
		    			+ "████▌▄▌▄▐▐▌█████\r\n"
		    			+ "████▌▄▌▄▐▐▌▀████\r\n"
		    			+ "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀\r\n"
		    			+ "");

		    	System.out.print("계속 하시겠습니까? >> ");
		    	String check = sc.next();
		    	if(check.equals("N")) {
		    		System.out.println("종료합니다.");
		    		break;
		    	}else if(check.equals("Y")){}
		    }
		}
	}
}
