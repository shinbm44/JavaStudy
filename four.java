package Test_1;
import java.util.Scanner;
import java.util.Random;



public class four {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.print("출생년도를 입력해 주세요.(yyyy):");
		String years = sc.next();
		
		System.out.print("출생월을 입력해 주세요.(mm):");
		String month = sc.next();
		
		System.out.print("출생일을 입력해 주세요.(dd):");
		String date = sc.next();
		
		System.out.print("성별을 입력해 주세요.(m/f):");
		char sex = sc.next().charAt(0);
		int sexNumber=0;;
		
		if(sex == 'm') {
			sexNumber = 3;
		} else if (sex == 'f') {
			sexNumber = 4;
		}
		
		
		int randomNumber = (ran.nextInt(999999)+100000); 
		
		System.out.print( years +  month+ date + "-" + sexNumber + randomNumber);
		
	}

}
