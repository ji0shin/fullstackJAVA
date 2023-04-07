package 돼지저금통프로그램;

public class PiggyBank {
	
	// 필드 - money
	int money;
	
	// 메소드 - deposit, withdraw, showMoney
	public void deposit(int inputMoney) {
		money += inputMoney;
	}
	
	public void withdraw(int outputMoney) {
		money -= outputMoney;
	}
	
	public void showMoney(){
		System.out.println(money);
	}
	
	

}
