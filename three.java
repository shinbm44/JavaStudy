package Test_1;
import java.util.Scanner;


public class three {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("[입장권 계산]");
		
		System.out.print("나이를 입력해 주세요.(숫자):");
		int age=sc.nextInt();

		
		System.out.print("입장시간을 입력해주세요.(숫자입력):");
		int time = sc.nextInt();
	
		
		System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
		char what1 = sc.next().charAt(0);
		
		
		System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
		char what2 = sc.next().charAt(0);
		
		int money;
		
		int cal;
		
		cal = howMuch(age, time ,what1, what2);
		
		money = cal;
		
		System.out.println("입장료: " + money);
		
		sc.close();

	}
	
	
	public static int howMuch(int age, int time ,char what1, char what2) {
		
		if(age < 3) {
			return 0;
		}
		
		if(what1 == 'y'|| what2 == 'y') {
			return 8000;
			
		}
		
		if(age>3 && age<13) {
			return 6000;
		}
		
		if(time > 17) {
			return 6000;
		}
		
		return 10000;
				
	}
	

}
