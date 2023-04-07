package 돼지저금통프로그램;

public class PiggyBank1 {
// 필드 - money
	int money;
	
	public PiggyBank1() { //생성자 ---> 작성하지 않아도 컴파일러가 자동으로 생성
		System.out.println("돼지저금통 생성!!");
	}
	
	//메소드 - deposit, withdraw showMoney
	public void deposit(int inputMoney) {
		money += inputMoney;
	}
	
	public void withdraw(int outputMoney) {
		if(money >= outputMoney){
			money -= outputMoney;
		}
	}
	
	public int showMoney() { //출력 기능은 사용자와 소통하는 인터페이스와 가까움
		return money; //return으로 변경 : 단일 책임 원칙
	}
}
