package Test_1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class seven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();


		System.out.println("[로또 당첨 프로그램]");
		System.out.println();

		System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
		int num = sc.nextInt(); // 갯수

		int [][] data = new int [num][6];
		int [] data2 = new int [(6*num)];
		int [] result = new int [6];
		
		int num2 = 0;


		for( int i =0; i<data2.length; i++) {

			data2[i] = (ran.nextInt(45)+1);

			for(int j =0; j<i; j++) {
				if(data2[i]==data2[j]) {
					i--;
					break;
				}
			}
		} 
		
		for(int i = 0; i<6; i++) {
			result[i]= (ran.nextInt(45)+1);
			for(int j =0; j<i; j++) {
				if(result[i]==result[j]) {
					i--;
					break;
				}
			}
		}


		for(int q =0; q<num; q++) {
			for(int k =0; k<data[q].length; k++) {

				data[q][k] = data2[num2++];
			}
		}


		for(int i=0; i<num; i++) {
			System.out.print((char)((65)+i) + "   "); //아스키코드 알파벳

			for(int j =0; j<6; j++) {
				System.out.print(data[i][j] + " "); //로또 지원 번호 출력
			}
			System.out.println();
		}



		System.out.println();


		System.out.print("[로또 발표]");
		System.out.println();
		System.out.print("    ");

		for(int i =0; i<6; i++) {
			System.out.print(result[i] + " "); //당첨번호
		}

		System.out.println();
		System.out.println();
		System.out.print("[내 로또 결과]");
		System.out.println();



		for(int i=0; i<num; i++) {
			System.out.print((char)((65)+i) + "   "); //아스키코드 알파벳

			for(int j =0; j<6; j++) {
				System.out.print(data[i][j] + " "); 

			}

			int count =0;

			for(int q= 0; q<6; q++) {
				int k = data[i][q];
				
				for(int n =0; n<6; n++) {
					if(k==result[n]) {
						count ++;
					}
				}
			}


			System.out.print( "=> " + count +"개 일치");
			System.out.println();
		}


		sc.close();	
	}
}



