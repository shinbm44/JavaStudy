package Test_1;

import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		
		System.out.println("[캐시백계산]");
		System.out.print("결제 금액을 입력해 주세요.(금액):");
		double num = scan.nextInt();
	
		double back;
		double k = 0.1;
		back = num * k; 
		
		if( back >=300) {
			back = 300;
		} else if( back <= 200 && back> 100 ) {
			back = 200;
		} else if (back < 100) {
			back = 0;
		}
		
		System.out.println("결재 금액은 " + (int)num + "이고," + " " + "캐시백은" 
		+ " " + (int)back + "원 입니다.");

		scan.close();
	}

}
