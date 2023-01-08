package Test_1;

import java.util.Random;

import java.util.Random;

public class six {

	public static void main(String[] args) {

		Random ran = new Random();

		double prog = 0; //진행
		double one = 0;
		double two = 0;
		double three = 0;
		double four = 0;
		
		
		
		double OneCand = 0;//1번
		double TwoCand = 0;//2번
		double ThreeCand = 0;//3번
		double FourCand = 0;//4번
		
		

		for(int i =0; i<10001; i++) {
			int vot = (ran.nextInt(4)+1);

			if(vot==1) {
				OneCand ++;

			} else if(vot==2) {
				TwoCand ++;

			} else if(vot==3) {
				ThreeCand ++;

			} else if(vot==4) {
				FourCand ++;
			}
			String Who = Person(vot);
			
			
			prog = ((double)i/(double)10000) *(double)100;
			one = (OneCand/(double)10000) * (double)100;
			two = (TwoCand/(double)10000) * (double)100;
			three = (ThreeCand/(double)10000) * (double) 100;
			four = (FourCand/(double)10000) * (double) 100;
			
			System.out.print("[투표진행률]: ");
			System.out.printf("%.2f", prog);
			System.out.print( "%, " + i + "명 투표 => ");
			System.out.print(Who);
			System.out.println();
			System.out.print("[기호:1] 이재명: ");
			System.out.printf("%.2f" , one);
			System.out.print(" , (투표수:" + OneCand+ ")");
			System.out.println();
			System.out.print("[기호:2] 윤석열: ");
			System.out.printf("%.2f", two);
			System.out.print(" , (투표수:" + TwoCand+ ")");
			System.out.println();
			System.out.print("[기호:3] 심상정: ");
			System.out.printf("%.2f", three );
			System.out.print(" , (투표수:" + ThreeCand+ ")");
			System.out.println();
			System.out.print("[기호:3] 안철수: ");
			System.out.printf("%.2f" , four);
			System.out.print(" , (투표수:" + FourCand+ ")");
			System.out.println();


		}
		
		System.out.print("[투표결과] 당선인: ");
		
		double [] winner = {one, two, three, four};
		double max = 0;
		int num = -1;
		
		for( int i =0; i<4; i++) {
			if(max < winner[i]) {
				max = winner[i];
				num = i+1;
			}
		}
		switch(num) {
		case 1:
			System.out.print("이재명");
			break;
		case 2:
			System.out.print("윤석렬");
			break;
		case 3:
			System.out.print("심상정");
			break;
		case 4:
			System.out.print("안철수");
			break;
		}
		
			
		
		
	}

	public static String Person(int vot) {

		if( vot == 1) {
			return "이재명";
		} else if( vot ==2) {
			return "윤석열";
		} else if( vot ==3) {
			return "심상정";
		} else if ( vot ==4) {
			return "안철수";
		}
		return "무효표";
	}
}
