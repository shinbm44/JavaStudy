package Test_1;
import java.util.*;


public class eight {
	static int[] 상한선 = {12000000, 46000000, 88000000, 150000000, 300000000, 500000000, 1000000000, 0};
	static int[] 누진공제 = {0, 1080000, 5220000, 14900000, 19400000, 25400000, 35400000, 65400000};
	static int[] 세율 = {6, 15, 24, 35, 38, 40, 42, 45};
	static int [] 감소금액 = {120000, 340000, 420000, 620000, 1500000, 2000000, 5000000, 10000000}; 
	//87000000
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        
        int income = sc.nextInt();
        int result2 =TaxCal1(income); // 수입 - 이전 상한선 세금 금액
        int result = TaxCal2(income); // 세금 계산결과
        
        System.out.print(result2);
        System.out.println();
        for(int i =0; i<8; i++) {
        	
        	if(income >= 상한선[i]) {
        		System.out.print("   " +상한선[i] + " * " + 세율[i]+ "%" + " ="  );
        		System.out.print( 상한선[i] / 100 * 세율[i] - 누진공제[i]);
        		System.out.println();  
        	}else if(income < 상한선[i]) {
        		i--;
        	    System.out.print("   " +(result2) + " * " + 세율[i]+ "%"  + " ="  );
        		System.out.print((result2)/ 100 * 세율[i]);
        		System.out.println(); 
        		break;
        	} else if(income >1000000000) {
        		System.out.print("   " +(income - 1000000000) + " * " + 45 + "%" + " ="  );
        		System.out.print((income - 1000000000)/ 100 * 45);
        		System.out.println(); 
        		break;
        	}
        }
        sc.close();
       }
	
	
	public static int TaxCal1(int income) {
		int CalResult =0;
		
		for( int i =0; i<8; i++) {
			if(income>1000000000) {
				CalResult = income - 1000000000;
				break;
			} 
			else if (income >= 상한선[i]) {
				
				CalResult = income - 상한선[i];
				System.out.print(CalResult);
				System.out.println();
			} 
			else {
				continue;
			}
		}
		
		
		
		return CalResult;
	}

	
	

	//세금 계산기
	public static int TaxCal2(int income) {
		int CalResult = 0;
		
		for(int i =0; i<8; i++) {
			if(income < 상한선[i]) {
				CalResult = income / 100 * 세율[i] - 누진공제[i];
				break;
			} else if (income>1000000000) {
				i =7;
				CalResult = income / 100 * 세율[i] - 누진공제[i];
				break;
			}
		}
		
		return CalResult;
	}	
	
}
