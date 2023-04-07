package 자판기객체지향연습;

import java.util.Scanner;

public class VendingMachineSimulator { // 프로그램을 구동하는 객체 -> 자판기에게 요청

	public static void main(String[] args) {
	    // 자판기 프로그램을 만들어보자.
		
		VendingMachine vm = new VendingMachine(); //변수 선언
		
		vm.inputMoney();
		
		vm.menuChoice();
		
		vm.changeMoney();

	}

}
